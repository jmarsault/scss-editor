package org.netbeans.modules.languages.scss.parser;

import java.util.Collections;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.languages.scss.antlr.ScssLexer;
import org.netbeans.modules.languages.scss.antlr.ScssParser;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author marsaultj
 */
public class NBScssParser extends Parser {

    private Snapshot snapshot;
    private ScssParser parser;
    private ScssLexer lexer;
    private CommonTree tree;
    private CommonTokenStream tokens;

    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) {
	this.snapshot = snapshot;
	ANTLRStringStream input = new ANTLRStringStream(snapshot.getText().toString());
	lexer = new ScssLexer(input);
	tokens = new CommonTokenStream(lexer);
	parser = new ScssParser(tokens);
	try {
	    ScssParser.stylesheet_return ret = parser.stylesheet();
	    tree = (CommonTree) ret.getTree();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public Result getResult(Task task) {
	return new ScssEditorParserResult(snapshot, parser, lexer, tree, tokens);
    }

    public void cancel() {
    }

    public void addChangeListener(ChangeListener changeListener) {
    }

    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class ScssEditorParserResult extends ParserResult {

	private ScssParser parser;
	private ScssLexer lexer;
	private CommonTree tree;
	private CommonTokenStream tokens;
	private boolean valid = true;

	ScssEditorParserResult(Snapshot snapshot, ScssParser parser, ScssLexer lexer, CommonTree tree, CommonTokenStream tokens) {
	    super(snapshot);
	    this.parser = parser;
	    this.lexer = lexer;
	    this.tree = tree;
	    this.tokens = tokens;
	}

	public ScssParser getScssParser()
		throws ParseException {
	    if (!valid) {
		throw new ParseException();
	    }
	    return parser;
	}

	public ScssLexer getLexer() {
	    return lexer;
	}

	public CommonTree getTree() {
	    return tree;
	}

	public CommonTokenStream getTokens() {
	    return tokens;
	}

	@Override
	protected void invalidate() {
	    valid = false;
	}

	@Override
	public List<? extends Error> getDiagnostics() {
	    return Collections.<Error>emptyList();
	}
    }
}
