package org.netbeans.modules.languages.scss.lexer;

import org.netbeans.modules.languages.scss.antlr.ScssLexer;

/**
 *
 * @author marsaultj
 */
public enum TokenType {

    HASH(ScssLexer.HASH, "hash"),
    IM_PROPERTY(ScssLexer.IM_PROPERTY, "mod-custom1"),
    IM_SELECTOR(ScssLexer.IM_SELECTOR, "mod-method"),
    PSEUDO(ScssLexer.PSEUDO, "mod-method"),
    AMPERSAND(ScssLexer.AMPERSAND, "mod-method"),
    IDENT(ScssLexer.IDENT, "character"),
    SL_COMMENT(ScssLexer.SL_COMMENT, "comment"),
    ML_COMMENT(ScssLexer.ML_COMMENT, "comment"),
    ESCAPE(ScssLexer.ESCAPE, "others"),
    HEXCHAR(ScssLexer.HEXCHAR, "others"),
    NMSTART(ScssLexer.NMSTART, "others"),
    NAME(ScssLexer.NAME, "others"),
    NMCHAR(ScssLexer.NMCHAR, "others"),
    NONASCII(ScssLexer.NONASCII, "others"),
    UNICODE(ScssLexer.UNICODE, "others"),
    COMMA(ScssLexer.COMMA, "separator"),
    SEMI(ScssLexer.SEMI, "separator"),
    COLON(ScssLexer.COLON, "separator"),
    RBRACKET(ScssLexer.RBRACKET, "brace"),
    LBRACKET(ScssLexer.LBRACKET, "brace"),
    RBRACE(ScssLexer.RBRACE, "brace"),
    LBRACE(ScssLexer.LBRACE, "brace"),
    LPAREN(ScssLexer.LPAREN, "brace"),
    RPAREN(ScssLexer.RPAREN, "brace"),
    BEGIN_INTERPOLATION(ScssLexer.BEGIN_INTERPOLATION, "brace"),
    WS(ScssLexer.WS, "whitespace"),
    NL(ScssLexer.NL, "whitespace"),
    STRING(ScssLexer.STRING, "string"),
    DOLLAR(ScssLexer.DOLLAR, "character"),
    STAR(ScssLexer.STAR, "character"),
    VAR(ScssLexer.VAR, "variable"),
    SHARP(ScssLexer.SHARP, "character"),
    URI(ScssLexer.URI, "url"),
    DASHMATCH(ScssLexer.DASHMATCH, "operator"),
    MOD(ScssLexer.MOD, "operator"),
    LT(ScssLexer.LT, "operator"),
    EQ(ScssLexer.EQ, "operator"),
    GTE(ScssLexer.GTE, "operator"),
    AND(ScssLexer.AND, "operator"),
    NEQ(ScssLexer.NEQ, "operator"),
    LTE(ScssLexer.LTE, "operator"),
    OR(ScssLexer.OR, "operator"),
    NOT(ScssLexer.NOT, "operator"),
    GT(ScssLexer.GT, "operator"),
    INCLUDES(ScssLexer.INCLUDES, "operator"),
    SINGLE_EQ(ScssLexer.SINGLE_EQ, "operator"),
    DOT(ScssLexer.DOT, "operator"),
    MINUS(ScssLexer.MINUS, "operator"),
    PLUS(ScssLexer.PLUS, "operator"),
    DIV(ScssLexer.DIV, "operator"),
    EMS(ScssLexer.EMS, "number"),
    EXS(ScssLexer.EXS, "number"),
    TIME_S(ScssLexer.TIME_S, "number"),
    TIME_MS(ScssLexer.TIME_MS, "number"),
    ANGLE_DEG(ScssLexer.ANGLE_DEG, "number"),
    ANGLE_GRAD(ScssLexer.ANGLE_GRAD, "number"),
    ANGLE_RAD(ScssLexer.ANGLE_RAD, "number"),
    FREQ_KHZ(ScssLexer.FREQ_KHZ, "number"),
    FREQ_HZ(ScssLexer.FREQ_HZ, "number"),
    LENGTH_IN(ScssLexer.LENGTH_IN, "number"),
    LENGTH_PX(ScssLexer.LENGTH_PX, "number"),
    LENGTH_PC(ScssLexer.LENGTH_PC, "number"),
    LENGTH_CM(ScssLexer.LENGTH_CM, "number"),
    LENGTH_PT(ScssLexer.LENGTH_PT, "number"),
    LENGTH_MM(ScssLexer.LENGTH_MM, "number"),
    NUMBER(ScssLexer.NUMBER, "number"),
    PERCENTAGE(ScssLexer.PERCENTAGE, "number"),
    DIMEN(ScssLexer.DIMEN, "number"),
    IF(ScssLexer.IF, "keyword"),
    FROM(ScssLexer.FROM, "keyword"),
    TO(ScssLexer.TO, "keyword"),
    THROUGH(ScssLexer.THROUGH, "keyword"),
    IMPORTANT(ScssLexer.IMPORTANT, "keyword"),
    DEFAULT(ScssLexer.DEFAULT, "keyword"),
    INCLUDE_DIR(ScssLexer.INCLUDE_DIR, "keyword"),
    MEDIA_DIR(ScssLexer.MEDIA_DIR, "keyword"),
    CHARSET_DIR(ScssLexer.CHARSET_DIR, "keyword"),
    MIXIN_DIR(ScssLexer.MIXIN_DIR, "keyword"),
    UNKNOWN_DIR(ScssLexer.UNKNOWN_DIR, "keyword"),
    PAGE_DIR(ScssLexer.PAGE_DIR, "keyword"),
    IMPORT_DIR(ScssLexer.IMPORT_DIR, "keyword"),
    WHILE_DIR(ScssLexer.WHILE_DIR, "keyword"),
    ELSE_DIR(ScssLexer.ELSE_DIR, "keyword"),
    FOR_DIR(ScssLexer.FOR_DIR, "keyword"),
    WARN_DIR(ScssLexer.WARN_DIR, "keyword"),
    DEBUG_DIR(ScssLexer.DEBUG_DIR, "keyword"),
    IF_DIR(ScssLexer.IF_DIR, "keyword"),
    EXTEND_DIR(ScssLexer.EXTEND_DIR, "keyword");
    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
	this.id = id;
	this.category = category;
    }

    public static TokenType valueOf(int id) {
	TokenType[] values = values();
	for (TokenType value : values) {
	    if (value.id == id) {
		return value;
	    }
	}
	throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
