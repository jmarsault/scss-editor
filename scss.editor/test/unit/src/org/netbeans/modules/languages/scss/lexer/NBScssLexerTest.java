package org.netbeans.modules.languages.scss.lexer;

import org.netbeans.modules.languages.scss.antlr.ScssLexer;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.api.lexer.TokenHierarchy;
import org.junit.Test;
import org.netbeans.lib.lexer.test.LexerTestUtilities;
import static org.junit.Assert.*;

/**
 *
 * @author marsaultj
 */
public class NBScssLexerTest {

    private Language<ScssTokenId> lang = ScssTokenId.language();

    @Test
    public void selector() {

	String text = "\r\n#main p {}";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NL), "\r\n", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "#main", 2);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, ScssLanguageHierarchy.getToken(ScssLexer.WS), " ", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, ScssLanguageHierarchy.getToken(ScssLexer.IM_SELECTOR), "p", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, ScssLanguageHierarchy.getToken(ScssLexer.WS), " ", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, ScssLanguageHierarchy.getToken(ScssLexer.LBRACE), "{", 10);
    }

    @Test
    public void testReadProperty() {

	String text = "color: #00ff00;";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_PROPERTY), "color", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COLON), ":", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.HASH), "#00ff00", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.SEMI), ";", 14);
    }

    @Test
    public void testReadPropertyInterpolation() {

	String text = "#{$attr}-color: blue;";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_PROPERTY), "#{$attr}-color", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COLON), ":", 14);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 15);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IDENT), "blue", 16);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.SEMI), ";", 20);
    }

    @Test
    public void testReadPropertyNested() {

	String text = "font: {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_PROPERTY), "font", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COLON), ":", 4);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 6);
    }

    @Test
    public void testReadPropertyExpr() {

	String text = "width: 2em * $test;";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_PROPERTY), "width", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COLON), ":", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.EMS), "2em", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 10);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.STAR), "*", 11);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 12);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$test", 13);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.SEMI), ";", 18);
    }

    @Test
    public void testReadMixin() {

	String text = "@mixin test-message {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.MIXIN_DIR), "@mixin", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IDENT), "test-message", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 19);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 20);
    }

    @Test
    public void testReadMixinWithArguments() {

	String text = "@mixin rounded($side, $other-side, $radius: 10px) {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.MIXIN_DIR), "@mixin", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IDENT), "rounded", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LPAREN), "(", 14);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$side", 15);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COMMA), ",", 20);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 21);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$other-side", 22);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COMMA), ",", 33);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 34);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$radius", 35);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.COLON), ":", 42);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 43);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LENGTH_PX), "10px", 44);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.RPAREN), ")", 48);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 49);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 50);
    }

    @Test
    public void testReadSelector() {

	String text = "\r\n#main p {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NL), "\r\n", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "#main", 2);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "p", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 10);
    }

    @Test
    public void testReadParentSelector() {

	String text = "\r\n&:hover {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NL), "\r\n", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "&", 2);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), ":hover", 3);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 10);
    }

    @Test
    public void testReadAttributeSelector() {

	String text = "span[hello=\"Cleveland\"][goodbye=\"Columbus\"] { ";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "span", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "[hello=\"Cleveland\"]", 4);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "[goodbye=\"Columbus\"]", 23);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 43);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 44);
    }

    @Test
    public void testReadSelectorWithInterpolation() {

	String text = "p.#{$name} {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), "p", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IM_SELECTOR), ".#{$name}", 1);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 10);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 11);
    }

    @Test
    public void testReadImportDirective() {

	String text = "@import 'foo.scss';";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IMPORT_DIR), "@import", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.STRING), "'foo.scss'", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.SEMI), ";", 18);
    }

    @Test
    public void testReadUnknownDirective() {

	String text = "@foo 'foo' foo;";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.UNKNOWN_DIR), "@foo", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 4);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.STRING), "'foo'", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 10);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IDENT), "foo", 11);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.SEMI), ";", 14);
    }

    @Test
    public void testReadForDirective() {

	String text = "@for $i from 1 through 3 {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.FOR_DIR), "@for", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 4);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$i", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.FROM), "from", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 12);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "1", 13);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 14);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.THROUGH), "through", 15);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 22);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "3", 23);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 24);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 25);
    }

    @Test
    public void testReadIfDirective() {

	String text = "@if 1 + 1 == 2 {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IF_DIR), "@if", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 3);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "1", 4);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.PLUS), "+", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "1", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.EQ), "==", 10);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 12);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "2", 13);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 14);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 15);
    }

    @Test
    public void testReadElseIfDirective() {

	String text = "@else if $type == monster {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.ELSE_DIR), "@else", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 5);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IF), "if", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 8);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$type", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 14);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.EQ), "==", 15);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 17);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.IDENT), "monster", 18);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 25);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 26);
    }

    @Test
    public void testReadWhileDirective() {

	String text = "@while $i > 0 {";
	TokenHierarchy<?> hi = TokenHierarchy.create(text, lang);
	TokenSequence<?> ts = hi.tokenSequence();
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WHILE_DIR), "@while", 0);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 6);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.VAR), "$i", 7);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 9);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.GT), ">", 10);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 11);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.NUMBER), "0", 12);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.WS), " ", 13);
	assertTrue(ts.moveNext());
	LexerTestUtilities.assertTokenEquals(ts, lang.tokenId(ScssLexer.LBRACE), "{", 14);
    }
}
