package org.netbeans.modules.languages.scss.parser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.modules.scss.options.ScssSettings;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.windows.InputOutput;

class InvalidOutputStyleException extends Exception {

	InvalidOutputStyleException(String value) {
		super("Invalid doc block value for SCSS outputStyle \"" + value + "\" (should be one of \"compressed\", \"expanded\", \"compact\" or \"nested\")");
	}
}

/**
 * Parse doc block comments at the top of SCSS files, to override global options.
 *
 * @author Jon Cairns <jon.cairns@22blue.co.uk>
 */
public class ScssDocblockParser {

	private FileObject fo;
	private InputOutput io;
	private boolean inComment = false;
	private boolean complete = false;
	private static int DEBUGINFO = 0;
	private static int LINECOMMENTS = 1;
	private static int OUTPUTSTYLE = 2;
	private static int OUTPUTFILE = 3;
	private Map values = new HashMap();
	private static final int MAXLINENO = 30;
	private static final int MAXLINESTART = 3;
	private static final boolean DEBUGENABLED = false;

	public ScssDocblockParser(FileObject fo, InputOutput io) {
		this.io = io;
		this.fo = fo;
		try {
			parse();
		} catch (IOException e) {
			//Bizarrely, giving it another go seems to do the trick
			try {
				parse();
			} catch (IOException e2) {
				io.getErr().println("Failed to parse SCSS file: " + e2.getMessage());
			}
		}
	}

	/**
	 * Highly sophisticated debug function.
	 *
	 * Outputs to stderr if DEBUGENABLED is true.
	 */
	private void debug(String text) {
		if (DEBUGENABLED) {
			io.getErr().println("ScssDocBlockParser: " + text);
		}
	}

	/**
	 * Parse the file level doc block, as long as it arrives within MAXLINESTART
	 * lines of the top of the file, and closes within MAXLINENO lines.
	 *
	 * @return void
	 */
	private void parse() throws IOException {
		try {
			int lineno = 0;
			for (String line : fo.asLines()) {
				lineno++;
				parseLine(line.trim(), lineno);
				if (complete) {
					break;
				}
			}
		} catch (InvalidOutputStyleException iose) {
			io.getErr().println("Failed to parse SCSS doc block comment: " + iose.getMessage());
		}
	}

	/**
	 * Parse a single line, checking for doc block tags.
	 *
	 * The parsing only begins if the block opener is found.
	 *
	 * @throws InvalidDocBlockException
	 * @throws InvalidOutputStyleException
	 * @param line The line of the file currently being parsed
	 * @param lineno The current line number
	 * @return void
	 */
	private void parseLine(String line, int lineno) throws InvalidOutputStyleException {
		if (inComment) {
			if (lineno > MAXLINENO) {
				complete = true;
				debug("Reached maximum line number");
			} else if (line.matches("\\*/")) {
				inComment = false;
				complete = true;
				debug("Found closing block comment on line " + lineno);
			} else if (line.matches("[^*]*\\*\\s*@.*")) {
				parseBlockComment(line);
			}
		} else {
			if (lineno > MAXLINESTART) {
				debug("Can't find any doc block comments within " + MAXLINESTART + " lines of the top of the file");
				complete = true;
			} else if (line.startsWith("/**")) {
				debug("Found doc block");
				inComment = true;
			}
		}
	}

	/**
	 * Read the doc block tag name and value.
	 *
	 * This method is only reached if we are certain that there is a doc block tag
	 * on this line. However, if the format is invalid, an exception is thrown.
	 *
	 * @param line The line of the file currently being parsed
	 * @throws InvalidDocBlockException
	 * @throws InvalidOutputStyleException
	 */
	private void parseBlockComment(String line)
	    throws InvalidOutputStyleException {
		Pattern bcRegex = Pattern.compile("[^@]*@([a-zA-Z0-9]+)\\s+([^\\s]+).*");
		Matcher bcMatcher = bcRegex.matcher(line);
		if (bcMatcher.find()) {
			String blockName = bcMatcher.group(1);
			String blockVal = bcMatcher.group(2);
			debug("Found tag @" + blockName + " " + blockVal);

			if (blockName.equals("outputFile")) {
				values.put(OUTPUTFILE, sanitizeOutputFile(blockVal));
				debug("Output file: " + values.get(OUTPUTFILE));

			} else if (blockName.equals("debugInfo")) {
				values.put(DEBUGINFO, (blockVal.equals("true")) ? true : false);

			} else if (blockName.equals("lineComments")) {
				values.put(LINECOMMENTS, (blockVal.equals("true")) ? true : false);

				//Check that the output style matches one of the allowed values
			} else if (blockName.equals("outputStyle")) {
				if (blockVal.equals(ScssSettings.OutputStyle.COMPACT.name)
				    || blockVal.equals(ScssSettings.OutputStyle.COMPRESSED.name)
				    || blockVal.equals(ScssSettings.OutputStyle.EXPANDED.name)
				    || blockVal.equals(ScssSettings.OutputStyle.NESTED.name)) {
					values.put(OUTPUTSTYLE, blockVal);
				} else {
					throw new InvalidOutputStyleException(blockVal);
				}
			} else {
				debug("Ignoring unknown doc block tag \"" + blockName + "\"");
			}
		}
	}

	/**
	 * Sanitise the output file path as specified in the doc block tag.
	 *
	 * If the path is relative, combine with the current SCSS file path. If it
	 * is absolute, use the project file path.
	 *
	 * @param outputFileValue Output file path as specified in doc block tag
	 * @return Output file path (string)
	 */
	private String sanitizeOutputFile(String outputFileValue) {
		String base = null;
		File outputFileObject = new File(outputFileValue);
		if (outputFileObject.isAbsolute()) {
			Project proj = FileOwnerQuery.getOwner(fo);
			FileObject pfo = proj.getProjectDirectory();
			base = pfo.getPath();
			outputFileValue = outputFileValue.substring(1);
		} else {
			base = fo.getParent().getPath();
		}
		File outFile = new File(base, outputFileValue);
		return FileUtil.normalizeFile(outFile).getPath();
	}

	/**
	 * Get the output file if specified, otherwise return defaultValue.
	 * @param defaultValue
	 * @return
	 */
	public String getOutputFile(String defaultValue) {
		if (values.containsKey(OUTPUTFILE)) {
			return (String) values.get(OUTPUTFILE);
		} else {
			return defaultValue;
		}
	}

	/**
	 * Get the output style if specified, otherwise return defaultValue.
	 * @param defaultValue
	 */
	public String getOutputStyle(String defaultValue) {
		if (values.containsKey(OUTPUTSTYLE)) {
			return (String) values.get(OUTPUTSTYLE);
		} else {
			return defaultValue;
		}
	}

	/**
	 * Get whether line comments are enabled, otherwise return defaultValue.
	 * @param defaultValue
	 */
	public boolean isLineCommentsEnabled(boolean defaultValue) {
		if (values.containsKey(LINECOMMENTS)) {
			return (Boolean) values.get(LINECOMMENTS);
		} else {
			return defaultValue;
		}
	}

	/**
	 * Get whether debug info is enabled, otherwise return defaultValue.
	 * @param defaultValue
	 */
	public boolean isDebugInfoEnabled(boolean defaultValue) {
		if (values.containsKey(DEBUGINFO)) {
			return (Boolean) values.get(DEBUGINFO);
		} else {
			return defaultValue;
		}
	}
}
