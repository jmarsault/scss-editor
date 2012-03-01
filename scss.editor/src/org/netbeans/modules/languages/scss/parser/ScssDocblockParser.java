package org.netbeans.modules.languages.scss.parser;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.modules.scss.engine.Engine;
import org.netbeans.modules.scss.options.ScssSettings;
import org.openide.filesystems.FileObject;
import org.openide.util.NbBundle;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

class InvalidOutputStyleException extends Exception {
	InvalidOutputStyleException(String value) {
		super("Invalid doc block value for SCSS outputStyle \""+value+"\" (should be one of \"compressed\", \"expanded\", \"compact\" or \"nested\")");
	}
}
class InvalidDocBlockException extends Exception {
	InvalidDocBlockException(String value) {
		super("Invalid format for SCSS doc block line \""+value+"\" (expected format \"@blockName blockValue\")");
	}
}

class InvalidOutputFileException extends Exception {
	InvalidOutputFileException(File file) {
		super("Cannot write to file \""+file.getPath()+"\", please check that it is a valid and writable file path");
	}
}
/**
 *
 * @author Jon Cairns <jon.cairns@22blue.co.uk>
 */
public class ScssDocblockParser {

    private FileObject fo;
    private static final InputOutput io = IOProvider.getDefault().getIO("Scss comment parser", false);
    private boolean inComment = false;
    private boolean complete = false;

    private static int DEBUGINFO = 0;
    private static int LINECOMMENTS = 1;
    private static int OUTPUTSTYLE = 2;
    private static int OUTPUTFILE = 3;

    private Hashtable values = new Hashtable();

    private static final int MAXLINENO = 30;
    private static final int MAXLINESTART = 3;

    public ScssDocblockParser(FileObject fo) {
        this.fo = fo;
        parse();
    }

    private void parse() {
        try {
            int lineno = 0;
            for (String line : fo.asLines()) {
                lineno++;
                parseLine(line.trim(),lineno);
                if (complete) {
                    break;
                }
            }
        } catch (IOException e) {
            io.getErr().println("Failed to parse SCSS file: " + e.getMessage());
        } catch (InvalidDocBlockException idbe) {
		io.getErr().println("Failed to parse SCSS doc block comment: "+idbe.getMessage());
        } catch (InvalidOutputStyleException iose) {
		io.getErr().println("Failed to parse SCSS doc block comment: "+iose.getMessage());
        } catch (InvalidOutputFileException iofe) {
		io.getErr().println("Invalid output file: "+iofe.getMessage());
	  }
    }

    private void parseLine(String line,int lineno)
	throws InvalidDocBlockException, InvalidOutputStyleException, InvalidOutputFileException {
        if (inComment) {
            if (lineno > MAXLINENO) {
                complete = true;
			io.getErr().println("Reached maximum line number");
            } else if (line.matches("\\*/")) {
                inComment = false;
                complete = true;
			io.getErr().println("Found closing block comment on line "+lineno);
            } else if (line.matches("[^*]*\\*\\s*@.*")) {
			parseBlockComment(line);
            }
        } else {
		if (lineno > MAXLINESTART) {
			io.getErr().println("Can't find any doc block comments within "+MAXLINESTART+" lines of the top of the file");
			complete = true;
		} else if (line.startsWith("/**")) {
			io.getErr().println("Found doc block");
			inComment = true;
            }
        }
    }

    private void parseBlockComment(String line)
	throws InvalidDocBlockException, InvalidOutputStyleException, InvalidOutputFileException {
        Pattern bcRegex = Pattern.compile("[^@]*@([a-zA-Z0-9]+)\\s+([^\\s]+).*");
        Matcher bcMatcher = bcRegex.matcher(line);
        if (bcMatcher.find()) {
		String blockName = bcMatcher.group(1);
		String blockVal = bcMatcher.group(2);
		io.getErr().println("@"+blockName+" "+blockVal);

		if (blockName.equals("outputFile")) {
			values.put(OUTPUTFILE,sanitizeOutputFile(blockVal));
			io.getErr().println("Output file: "+values.get(OUTPUTFILE));
            } else if (blockName.equals("debugInfo")) {
			values.put(DEBUGINFO,(blockVal.equals("true")) ? true : false);
            } else if (blockName.equals("lineComments")) {
			values.put(LINECOMMENTS,(blockVal.equals("true")) ? true : false);
            } else if (blockName.equals("outputStyle")) {
		      if (blockVal.equals(ScssSettings.OutputStyle.COMPACT.name)
			  	|| blockVal.equals(ScssSettings.OutputStyle.COMPRESSED.name)
			  	|| blockVal.equals(ScssSettings.OutputStyle.EXPANDED.name)
			  	|| blockVal.equals(ScssSettings.OutputStyle.NESTED.name)
			  ) {
				values.put(OUTPUTSTYLE,blockVal);
		      } else {
				throw new InvalidOutputStyleException(blockVal);
		      }
            } else {
			io.getErr().println("Ignoring unknown doc block tag \""+blockName+"\"");
            }
        } else {
            //TODO: Throw exception
		throw new InvalidDocBlockException(line);
        }
    }

    private String sanitizeOutputFile(String outputFileValue) throws InvalidOutputFileException {
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
	    File outFile = new File(base,outputFileValue);
	    if (outFile.canWrite()) {
		    return outFile.getPath();
	    } else {
		    throw new InvalidOutputFileException(outFile);
	    }
    }

    public String getOutputFile(String defaultValue) {
	    if (values.containsKey(OUTPUTFILE)) {
		    return (String)values.get(OUTPUTFILE);
	    } else {
		    return defaultValue;
	    }
    }

    public String getOutputStyle(String defaultValue) {
	    if (values.containsKey(OUTPUTSTYLE)) {
		    return (String)values.get(OUTPUTSTYLE);
	    } else {
		    return defaultValue;
	    }
    }

    public boolean isLineCommentsEnabled(boolean defaultValue) {
	    if (values.containsKey(LINECOMMENTS)) {
		    return (Boolean)values.get(LINECOMMENTS);
	    } else {
		    return defaultValue;
	    }
    }

    public boolean isDebugInfoEnabled(boolean defaultValue) {
	    if (values.containsKey(DEBUGINFO)) {
		    return (Boolean)values.get(DEBUGINFO);
	    } else {
		    return defaultValue;
	    }
    }
}
