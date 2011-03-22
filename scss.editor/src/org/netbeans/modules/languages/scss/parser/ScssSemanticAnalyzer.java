package org.netbeans.modules.languages.scss.parser;

import java.util.HashMap;
import java.util.Map;
import org.netbeans.modules.csl.api.ColoringAttributes;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.SemanticAnalyzer;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.Document;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import javax.swing.text.StyledDocument;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.openide.text.NbDocument;

/**
 *
 * @author marsaultj
 */
public class ScssSemanticAnalyzer extends SemanticAnalyzer {

    private boolean cancelled;
    private Document doc;

    private static final Pattern INTERPOLATION = Pattern.compile("[^\\\\]\\{\\$#?[a-zA-Z0-9\\.\\(\\)]*\\}?");

    private static final Pattern VAR = Pattern.compile("#\\{(.+?)\\}");
    private Map<OffsetRange, Set<ColoringAttributes>> semanticHighlights;

//    @Override
//    public Map<OffsetRange, ColoringAttributes> getHighlights() {
//	return semanticHighlights;
//    }
    public void cancel() {
	cancelled = true;
    }

//    public void run(CompilationInfo ci) throws Exception {
    @Override
    public void run(Result result, SchedulerEvent se) {

	final Map<OffsetRange, Set<ColoringAttributes>> highlights = new HashMap<OffsetRange, Set<ColoringAttributes>>();
	semanticHighlights = null;

//	OffsetRange range = null;
	if (cancelled) {
	    return;
	}

	System.out.println("CSSSemanticAnalyzer run");
	doc = result.getSnapshot().getSource().getDocument(false);


//	    bag.clear();
//	    HighlightsSequence.EMPTY;
//	OffsetsBag newBag = new OffsetsBag(doc, true);

	NBScssParser.ScssEditorParserResult pResult = (NBScssParser.ScssEditorParserResult) result;
	CommonTree tree = pResult.getTree();

	for (int i = 0; i < tree.getChildCount(); i++) {
	    if (tree.getChild(i) != null && tree.getChild(i).getText() != null) {

		CommonTree node = ((CommonTree) tree.getChild(i));
		//node.
		Token token = node.token;

		int startRef = NbDocument.findLineOffset((StyledDocument) doc, token.getLine() - 1) + token.getCharPositionInLine();
		String str = node.getText();
		System.out.println("INTERPOLATION.matcher(str)");
		Matcher matcher = INTERPOLATION.matcher(str);
		while (matcher.find()) {
		    System.out.println("INTERPOLATION found in str " + str);
		    int start = startRef + matcher.start();
		    int end = startRef + matcher.end();
		    System.out.println(" start = <" + start + ">");
		    System.out.println(" end = <" + end + ">");
		    OffsetRange range = new OffsetRange(start, end);
		    highlights.put(range, ColoringAttributes.CUSTOM2_SET);
		    OffsetRange varRange = new OffsetRange(start + 2, end - 1);
		    highlights.put(varRange, ColoringAttributes.FIELD_SET);
		}
//		matcher = VAR.matcher(str);
//		while (matcher.find()) {
//		    System.out.println("VAR found in str " + str);
//		    int start = startRef + matcher.start();
//		    int end = startRef + matcher.end();
//		    System.out.println(" start = <" + start + ">");
//		    System.out.println(" end = <" + end + ">");
//		    OffsetRange range = new OffsetRange(start, end);
//		    highlights.put(range, ColoringAttributes.FIELD_SET);
//		}
//		if (node.getType() == ScssLexer.IM_SELECTOR) {
//		    System.out.println("CSSSemanticAnalyzer run IM_SELECTOR");
//		    highlights.put(this.addHighlight(node), ColoringAttributes.METHOD_SET);
//		    System.out.println("CSSSemanticAnalyzer run IM_SELECTOR fin");
//
//		}
//		if (node.getType() == ScssLexer.IM_PROPERTY) {
//		    System.out.println("CSSSemanticAnalyzer run IM_PROPERTY");
//		    highlights.put(this.addHighlight(node), ColoringAttributes.CUSTOM1_SET);
//		    System.out.println("CSSSemanticAnalyzer run IM_PROPERTY fin");
//		}
//		System.out.println("CSSSemanticAnalyzer run VAR before");
//		if (node.getType() == ScssLexer.IM_VAR) {
//		    System.out.println("CSSSemanticAnalyzer run VAR");
//		    highlights.put(this.addHighlight(node), ColoringAttributes.FIELD_SET);
//		    System.out.println("CSSSemanticAnalyzer run VAR fin");
//		}
		//TODO repaint vars

	    }

	}


//	final Map<OffsetRange, ColoringAttributes> highlights = new HashMap<OffsetRange, ColoringAttributes>();
//
//	//XXX fixthis - the css parser always parses the whole css content!
//	ParserResult presult = ci.getEmbeddedResults(Css.CSS_MIME_TYPE).iterator().next();
//	final TranslatedSource source = presult.getTranslatedSource();
//	SimpleNode root = ((CSSParserResult) presult).root();
//
//	if (root == null) {
//	    //serious error in the source, no results
//	    semanticHighlights = highlights;
//	    return;
//	}
//
//	NodeVisitor visitor = new NodeVisitor() {
//
//	    //XXX using the ColoringAttributes.YYY java specific codes should
//	    //be changed to something more meaningful
//	    public void visit(SimpleNode node) {
//		if (node.kind() == CSSParserTreeConstants.JJTELEMENTNAME || node.kind() == CSSParserTreeConstants.JJT_CLASS || node.kind() == CSSParserTreeConstants.JJTPSEUDO || node.kind() == CSSParserTreeConstants.JJTHASH || node.kind() == CSSParserTreeConstants.JJTATTRIB) {
//		    AstOffsetRange range = new AstOffsetRange(node.startOffset(), node.endOffset(), source);
//		    //filter virtual nodes
//		    if (!range.isEmpty()) {
//			highlights.put(range, ColoringAttributes.METHOD);
//		    }
//		} else if (node.kind() == CSSParserTreeConstants.JJTPROPERTY) {
//		    //check vendor speficic property
//		    AstOffsetRange range = new AstOffsetRange(node.startOffset(), node.endOffset(), source);
//
//		    if (!range.isEmpty()) { //filter virtual nodes
//
//			String propertyName = node.image().trim();
//			if (CssAnalyser.isVendorSpecificProperty(propertyName)) {
//			    //special highlight for vend. spec. properties
//			    highlights.put(range, ColoringAttributes.PARAMETER_USE);
//			} else {
//			    highlights.put(range, ColoringAttributes.PARAMETER);
//			}
//		    }
//		}
//	    }
//	};
//
//	root.visitChildren(visitor);
//        for (int i = 0; i < sheet.getCssRules().getLength(); i++) {
//            if (cancelled) {
//                return;
//            }
//
//            CSSRule rule = sheet.getCssRules().item(i);
//            if (rule.getType() == CSSRule.STYLE_RULE) {
//                CSSStyleRule styleRule = (CSSStyleRule) rule;
//
//                CSSStyleDeclaration declaration = styleRule.getStyle();
//                System.out.println("rule " + styleRule.getCssText() + ": " + declaration.getCssText());
//
//                //TODO compute the range - need to hack the parser so it provides offsets
//                OffsetRange range = new OffsetRange(0, 20);
//                highlights.put(range, ColoringAttributes.PARAMETER);
//            }
//        }
	System.out.println("highlights size " + highlights.size());
	semanticHighlights = highlights;
    }

    private OffsetRange addHighlight(CommonTree node) {
	CommonTree firstChild = (CommonTree) node.getChild(0);
	Token token = firstChild.token;

	System.out.println(" IMAGINERY_TOKEN = <" + node.getText() + ">");
	System.out.println(" subToken.getLine() = <" + token.getLine() + ">");
	System.out.println(" subToken.getCharPositionInLine() = <" + token.getCharPositionInLine() + ">");
	int start = NbDocument.findLineOffset((StyledDocument) doc, token.getLine() - 1) + token.getCharPositionInLine();
	int stop = start + node.getText().length();

	System.out.println(" start = <" + start + ">");
	System.out.println(" stop = <" + stop + ">");
	OffsetRange range = new OffsetRange(start, stop);
	return range;
//	bag.addHighlight(start, stop, attribute);
    }

    @Override
    public int getPriority() {
	return 102;


    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
	return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;

    }

    @Override
    public Map getHighlights() {
	System.out.println("getHighlights");
	return semanticHighlights;
    }
//    public static class AstOffsetRange extends OffsetRange {
//
//        private TranslatedSource source;
//
//        public AstOffsetRange(int start, int end, TranslatedSource source) {
//            super(start, end);
//            this.source = source;
//        }
//
//        public int getStart() {
//            return source == null ? super.getStart() : source.getLexicalOffset(super.getStart());
//        }
//
//        public int getEnd() {
//            return source == null ? super.getEnd() : source.getLexicalOffset(super.getEnd());
//        }
//
//        public boolean isEmpty() {
//            return getEnd() - getStart() == 0;
//        }
//    }
}
