// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g 2010-12-08 20:07:42
package org.netbeans.modules.languages.scss.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@SuppressWarnings("cast") public class ScssParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IM_SELECTOR", "IM_PROPERTY", "IM_VAR", "CHARSET_DIR", "STRING", "SEMI", "IMPORT_DIR", "COMMA", "IDENT", "URI", "MIXIN_DIR", "LPAREN", "VAR", "RPAREN", "COLON", "INCLUDE_DIR", "EXTEND_DIR", "MEDIA_DIR", "LBRACE", "RBRACE", "PAGE_DIR", "FOR_DIR", "FROM", "THROUGH", "TO", "IF_DIR", "ELSE_DIR", "IF", "WHILE_DIR", "UNKNOWN_DIR", "DIV", "STAR", "MOD", "PLUS", "GT", "MINUS", "ATTRIB", "PSEUDO", "HASH", "CLASS", "AMPERSAND", "IMPORTANT", "EQ", "NEQ", "GTE", "LTE", "LT", "NUMBER", "PERCENTAGE", "LENGTH_PX", "LENGTH_CM", "LENGTH_MM", "LENGTH_IN", "LENGTH_PT", "LENGTH_PC", "ANGLE_DEG", "ANGLE_RAD", "ANGLE_GRAD", "EMS", "EXS", "TIME_MS", "TIME_S", "FREQ_HZ", "FREQ_KHZ", "DEFAULT", "BEGIN_INTERPOLATION", "INTERPOLATION", "HEXCHAR", "NONASCII", "UNICODE", "ESCAPE", "SHARP", "NMSTART", "NMCHAR", "NAME", "ML_COMMENT", "SL_COMMENT", "SINGLE_EQ", "AND", "OR", "NOT", "INCLUDES", "DASHMATCH", "LBRACKET", "RBRACKET", "DOT", "DOLLAR", "DEBUG_DIR", "WARN_DIR", "DIMEN", "WS", "NL", "'url('"
    };
    public static final int ATTRIB=40;
    public static final int LT=50;
    public static final int STAR=35;
    public static final int MOD=36;
    public static final int EXTEND_DIR=20;
    public static final int IM_VAR=6;
    public static final int NOT=84;
    public static final int EOF=-1;
    public static final int INCLUDES=85;
    public static final int LBRACKET=87;
    public static final int RPAREN=17;
    public static final int NAME=78;
    public static final int ESCAPE=74;
    public static final int VAR=16;
    public static final int NL=95;
    public static final int EQ=46;
    public static final int LENGTH_CM=54;
    public static final int T__96=96;
    public static final int ELSE_DIR=30;
    public static final int RBRACE=23;
    public static final int SHARP=75;
    public static final int NMCHAR=77;
    public static final int NUMBER=51;
    public static final int LENGTH_IN=56;
    public static final int ANGLE_GRAD=61;
    public static final int PERCENTAGE=52;
    public static final int IMPORT_DIR=10;
    public static final int URI=13;
    public static final int WS=94;
    public static final int DASHMATCH=86;
    public static final int EMS=62;
    public static final int SL_COMMENT=80;
    public static final int OR=83;
    public static final int SINGLE_EQ=81;
    public static final int TIME_MS=64;
    public static final int GT=38;
    public static final int INTERPOLATION=70;
    public static final int PAGE_DIR=24;
    public static final int FROM=26;
    public static final int LENGTH_PX=53;
    public static final int NONASCII=72;
    public static final int DOLLAR=90;
    public static final int CLASS=43;
    public static final int FREQ_HZ=66;
    public static final int PSEUDO=41;
    public static final int LBRACE=22;
    public static final int GTE=48;
    public static final int AND=82;
    public static final int LTE=49;
    public static final int LPAREN=15;
    public static final int IF=31;
    public static final int ML_COMMENT=79;
    public static final int COMMA=11;
    public static final int LENGTH_PC=58;
    public static final int IF_DIR=29;
    public static final int IDENT=12;
    public static final int PLUS=37;
    public static final int WARN_DIR=92;
    public static final int BEGIN_INTERPOLATION=69;
    public static final int RBRACKET=88;
    public static final int DOT=89;
    public static final int DEBUG_DIR=91;
    public static final int LENGTH_PT=57;
    public static final int IM_PROPERTY=5;
    public static final int TO=28;
    public static final int FOR_DIR=25;
    public static final int DEFAULT=68;
    public static final int HASH=42;
    public static final int HEXCHAR=71;
    public static final int AMPERSAND=44;
    public static final int MINUS=39;
    public static final int MIXIN_DIR=14;
    public static final int SEMI=9;
    public static final int UNICODE=73;
    public static final int IM_SELECTOR=4;
    public static final int INCLUDE_DIR=19;
    public static final int IMPORTANT=45;
    public static final int LENGTH_MM=55;
    public static final int COLON=18;
    public static final int TIME_S=65;
    public static final int NEQ=47;
    public static final int NMSTART=76;
    public static final int DIMEN=93;
    public static final int UNKNOWN_DIR=33;
    public static final int EXS=63;
    public static final int THROUGH=27;
    public static final int ANGLE_DEG=59;
    public static final int DIV=34;
    public static final int MEDIA_DIR=21;
    public static final int FREQ_KHZ=67;
    public static final int CHARSET_DIR=7;
    public static final int ANGLE_RAD=60;
    public static final int WHILE_DIR=32;
    public static final int STRING=8;

    // delegates
    // delegators


        public ScssParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ScssParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ScssParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g"; }


    public static class stylesheet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stylesheet"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:70:1: stylesheet : charset_directive ( import_directive )* ( unknown_directive )* bodylist EOF ;
    public final ScssParser.stylesheet_return stylesheet() throws RecognitionException {
        ScssParser.stylesheet_return retval = new ScssParser.stylesheet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF5=null;
        ScssParser.charset_directive_return charset_directive1 = null;

        ScssParser.import_directive_return import_directive2 = null;

        ScssParser.unknown_directive_return unknown_directive3 = null;

        ScssParser.bodylist_return bodylist4 = null;


        CommonTree EOF5_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:71:1: ( charset_directive ( import_directive )* ( unknown_directive )* bodylist EOF )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:72:1: charset_directive ( import_directive )* ( unknown_directive )* bodylist EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_charset_directive_in_stylesheet126);
            charset_directive1=charset_directive();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, charset_directive1.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:73:1: ( import_directive )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IMPORT_DIR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:73:1: import_directive
            	    {
            	    pushFollow(FOLLOW_import_directive_in_stylesheet128);
            	    import_directive2=import_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, import_directive2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:74:1: ( unknown_directive )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==UNKNOWN_DIR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:74:1: unknown_directive
            	    {
            	    pushFollow(FOLLOW_unknown_directive_in_stylesheet131);
            	    unknown_directive3=unknown_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unknown_directive3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_bodylist_in_stylesheet134);
            bodylist4=bodylist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bodylist4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_stylesheet137); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF5_tree = (CommonTree)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stylesheet"

    public static class charset_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "charset_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:79:1: charset_directive : ( CHARSET_DIR STRING SEMI | );
    public final ScssParser.charset_directive_return charset_directive() throws RecognitionException {
        ScssParser.charset_directive_return retval = new ScssParser.charset_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARSET_DIR6=null;
        Token STRING7=null;
        Token SEMI8=null;

        CommonTree CHARSET_DIR6_tree=null;
        CommonTree STRING7_tree=null;
        CommonTree SEMI8_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:80:1: ( CHARSET_DIR STRING SEMI | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHARSET_DIR) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==IMPORT_DIR||LA3_0==IDENT||LA3_0==MIXIN_DIR||LA3_0==VAR||LA3_0==MEDIA_DIR||LA3_0==PAGE_DIR||LA3_0==UNKNOWN_DIR||LA3_0==STAR||(LA3_0>=HASH && LA3_0<=AMPERSAND)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:80:5: CHARSET_DIR STRING SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CHARSET_DIR6=(Token)match(input,CHARSET_DIR,FOLLOW_CHARSET_DIR_in_charset_directive148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHARSET_DIR6_tree = (CommonTree)adaptor.create(CHARSET_DIR6);
                    adaptor.addChild(root_0, CHARSET_DIR6_tree);
                    }
                    STRING7=(Token)match(input,STRING,FOLLOW_STRING_in_charset_directive150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING7_tree = (CommonTree)adaptor.create(STRING7);
                    adaptor.addChild(root_0, STRING7_tree);
                    }
                    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_charset_directive152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI8_tree = (CommonTree)adaptor.create(SEMI8);
                    adaptor.addChild(root_0, SEMI8_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:82:1: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "charset_directive"

    public static class import_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:84:1: import_directive : IMPORT_DIR import_ ( COMMA import_ )* SEMI ;
    public final ScssParser.import_directive_return import_directive() throws RecognitionException {
        ScssParser.import_directive_return retval = new ScssParser.import_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IMPORT_DIR9=null;
        Token COMMA11=null;
        Token SEMI13=null;
        ScssParser.import__return import_10 = null;

        ScssParser.import__return import_12 = null;


        CommonTree IMPORT_DIR9_tree=null;
        CommonTree COMMA11_tree=null;
        CommonTree SEMI13_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:85:1: ( IMPORT_DIR import_ ( COMMA import_ )* SEMI )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:85:5: IMPORT_DIR import_ ( COMMA import_ )* SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            IMPORT_DIR9=(Token)match(input,IMPORT_DIR,FOLLOW_IMPORT_DIR_in_import_directive165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT_DIR9_tree = (CommonTree)adaptor.create(IMPORT_DIR9);
            adaptor.addChild(root_0, IMPORT_DIR9_tree);
            }
            pushFollow(FOLLOW_import__in_import_directive167);
            import_10=import_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, import_10.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:85:24: ( COMMA import_ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:85:25: COMMA import_
            	    {
            	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_import_directive170); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA11_tree = (CommonTree)adaptor.create(COMMA11);
            	    adaptor.addChild(root_0, COMMA11_tree);
            	    }
            	    pushFollow(FOLLOW_import__in_import_directive172);
            	    import_12=import_();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, import_12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_import_directive176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI13_tree = (CommonTree)adaptor.create(SEMI13);
            adaptor.addChild(root_0, SEMI13_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "import_directive"

    public static class import__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "import_"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:88:1: import_ : ( STRING | ( 'url(' IDENT ')' ) | URI ) ( medium ( COMMA medium )* )? ;
    public final ScssParser.import__return import_() throws RecognitionException {
        ScssParser.import__return retval = new ScssParser.import__return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING14=null;
        Token string_literal15=null;
        Token IDENT16=null;
        Token char_literal17=null;
        Token URI18=null;
        Token COMMA20=null;
        ScssParser.medium_return medium19 = null;

        ScssParser.medium_return medium21 = null;


        CommonTree STRING14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree IDENT16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree URI18_tree=null;
        CommonTree COMMA20_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:1: ( ( STRING | ( 'url(' IDENT ')' ) | URI ) ( medium ( COMMA medium )* )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:5: ( STRING | ( 'url(' IDENT ')' ) | URI ) ( medium ( COMMA medium )* )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:5: ( STRING | ( 'url(' IDENT ')' ) | URI )
            int alt5=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt5=1;
                }
                break;
            case 96:
                {
                alt5=2;
                }
                break;
            case URI:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:6: STRING
                    {
                    STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_import_188); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING14_tree = (CommonTree)adaptor.create(STRING14);
                    adaptor.addChild(root_0, STRING14_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:13: ( 'url(' IDENT ')' )
                    {
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:13: ( 'url(' IDENT ')' )
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:14: 'url(' IDENT ')'
                    {
                    string_literal15=(Token)match(input,96,FOLLOW_96_in_import_191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal15_tree = (CommonTree)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);
                    }
                    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_import_193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT16_tree = (CommonTree)adaptor.create(IDENT16);
                    adaptor.addChild(root_0, IDENT16_tree);
                    }
                    char_literal17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_import_195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:32: URI
                    {
                    URI18=(Token)match(input,URI,FOLLOW_URI_in_import_198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI18_tree = (CommonTree)adaptor.create(URI18);
                    adaptor.addChild(root_0, URI18_tree);
                    }

                    }
                    break;

            }

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:37: ( medium ( COMMA medium )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:38: medium ( COMMA medium )*
                    {
                    pushFollow(FOLLOW_medium_in_import_202);
                    medium19=medium();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, medium19.getTree());
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:45: ( COMMA medium )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==IDENT) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:89:46: COMMA medium
                    	    {
                    	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_import_205); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA20_tree = (CommonTree)adaptor.create(COMMA20);
                    	    adaptor.addChild(root_0, COMMA20_tree);
                    	    }
                    	    pushFollow(FOLLOW_medium_in_import_207);
                    	    medium21=medium();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, medium21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "import_"

    public static class mixin_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixin_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:92:1: mixin_directive : MIXIN_DIR IDENT ( LPAREN ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )? RPAREN )? ruleSetContent ;
    public final ScssParser.mixin_directive_return mixin_directive() throws RecognitionException {
        ScssParser.mixin_directive_return retval = new ScssParser.mixin_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MIXIN_DIR22=null;
        Token IDENT23=null;
        Token LPAREN24=null;
        Token VAR25=null;
        Token COMMA26=null;
        Token VAR27=null;
        Token COMMA29=null;
        Token RPAREN31=null;
        ScssParser.mixinOptionalArg_return mixinOptionalArg28 = null;

        ScssParser.mixinOptionalArg_return mixinOptionalArg30 = null;

        ScssParser.ruleSetContent_return ruleSetContent32 = null;


        CommonTree MIXIN_DIR22_tree=null;
        CommonTree IDENT23_tree=null;
        CommonTree LPAREN24_tree=null;
        CommonTree VAR25_tree=null;
        CommonTree COMMA26_tree=null;
        CommonTree VAR27_tree=null;
        CommonTree COMMA29_tree=null;
        CommonTree RPAREN31_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:93:1: ( MIXIN_DIR IDENT ( LPAREN ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )? RPAREN )? ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:93:3: MIXIN_DIR IDENT ( LPAREN ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )? RPAREN )? ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            MIXIN_DIR22=(Token)match(input,MIXIN_DIR,FOLLOW_MIXIN_DIR_in_mixin_directive221); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MIXIN_DIR22_tree = (CommonTree)adaptor.create(MIXIN_DIR22);
            adaptor.addChild(root_0, MIXIN_DIR22_tree);
            }
            IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_mixin_directive223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT23_tree = (CommonTree)adaptor.create(IDENT23);
            adaptor.addChild(root_0, IDENT23_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:94:1: ( LPAREN ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )? RPAREN )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LPAREN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:94:2: LPAREN ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )? RPAREN
                    {
                    LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_mixin_directive227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN24_tree = (CommonTree)adaptor.create(LPAREN24);
                    adaptor.addChild(root_0, LPAREN24_tree);
                    }
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:95:5: ( ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==VAR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:96:9: ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg ) ( COMMA mixinOptionalArg )*
                            {
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:96:9: ( ( VAR ( COMMA VAR )* ) | mixinOptionalArg )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==VAR) ) {
                                int LA9_1 = input.LA(2);

                                if ( (LA9_1==COLON) ) {
                                    alt9=2;
                                }
                                else if ( (LA9_1==COMMA||LA9_1==RPAREN) ) {
                                    alt9=1;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 9, 1, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }
                            switch (alt9) {
                                case 1 :
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:97:13: ( VAR ( COMMA VAR )* )
                                    {
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:97:13: ( VAR ( COMMA VAR )* )
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:97:14: VAR ( COMMA VAR )*
                                    {
                                    VAR25=(Token)match(input,VAR,FOLLOW_VAR_in_mixin_directive259); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    VAR25_tree = (CommonTree)adaptor.create(VAR25);
                                    adaptor.addChild(root_0, VAR25_tree);
                                    }
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:97:18: ( COMMA VAR )*
                                    loop8:
                                    do {
                                        int alt8=2;
                                        int LA8_0 = input.LA(1);

                                        if ( (LA8_0==COMMA) ) {
                                            int LA8_1 = input.LA(2);

                                            if ( (LA8_1==VAR) ) {
                                                int LA8_3 = input.LA(3);

                                                if ( (LA8_3==COMMA||LA8_3==RPAREN) ) {
                                                    alt8=1;
                                                }


                                            }


                                        }


                                        switch (alt8) {
                                    	case 1 :
                                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:97:19: COMMA VAR
                                    	    {
                                    	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_mixin_directive262); if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) {
                                    	    COMMA26_tree = (CommonTree)adaptor.create(COMMA26);
                                    	    adaptor.addChild(root_0, COMMA26_tree);
                                    	    }
                                    	    VAR27=(Token)match(input,VAR,FOLLOW_VAR_in_mixin_directive264); if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) {
                                    	    VAR27_tree = (CommonTree)adaptor.create(VAR27);
                                    	    adaptor.addChild(root_0, VAR27_tree);
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop8;
                                        }
                                    } while (true);


                                    }


                                    }
                                    break;
                                case 2 :
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:98:11: mixinOptionalArg
                                    {
                                    pushFollow(FOLLOW_mixinOptionalArg_in_mixin_directive279);
                                    mixinOptionalArg28=mixinOptionalArg();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinOptionalArg28.getTree());

                                    }
                                    break;

                            }

                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:100:5: ( COMMA mixinOptionalArg )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==COMMA) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:100:6: COMMA mixinOptionalArg
                            	    {
                            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_mixin_directive292); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    COMMA29_tree = (CommonTree)adaptor.create(COMMA29);
                            	    adaptor.addChild(root_0, COMMA29_tree);
                            	    }
                            	    pushFollow(FOLLOW_mixinOptionalArg_in_mixin_directive294);
                            	    mixinOptionalArg30=mixinOptionalArg();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinOptionalArg30.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_mixin_directive302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN31_tree = (CommonTree)adaptor.create(RPAREN31);
                    adaptor.addChild(root_0, RPAREN31_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleSetContent_in_mixin_directive306);
            ruleSetContent32=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent32.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mixin_directive"

    public static class mixinOptionalArg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinOptionalArg"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:108:1: mixinOptionalArg : VAR COLON term ;
    public final ScssParser.mixinOptionalArg_return mixinOptionalArg() throws RecognitionException {
        ScssParser.mixinOptionalArg_return retval = new ScssParser.mixinOptionalArg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR33=null;
        Token COLON34=null;
        ScssParser.term_return term35 = null;


        CommonTree VAR33_tree=null;
        CommonTree COLON34_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:108:18: ( VAR COLON term )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:108:20: VAR COLON term
            {
            root_0 = (CommonTree)adaptor.nil();

            VAR33=(Token)match(input,VAR,FOLLOW_VAR_in_mixinOptionalArg317); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR33_tree = (CommonTree)adaptor.create(VAR33);
            adaptor.addChild(root_0, VAR33_tree);
            }
            COLON34=(Token)match(input,COLON,FOLLOW_COLON_in_mixinOptionalArg319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON34_tree = (CommonTree)adaptor.create(COLON34);
            adaptor.addChild(root_0, COLON34_tree);
            }
            pushFollow(FOLLOW_term_in_mixinOptionalArg321);
            term35=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term35.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mixinOptionalArg"

    public static class include_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "include_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:1: include_directive : INCLUDE_DIR IDENT ( LPAREN term ( COMMA term )* RPAREN )? SEMI ;
    public final ScssParser.include_directive_return include_directive() throws RecognitionException {
        ScssParser.include_directive_return retval = new ScssParser.include_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INCLUDE_DIR36=null;
        Token IDENT37=null;
        Token LPAREN38=null;
        Token COMMA40=null;
        Token RPAREN42=null;
        Token SEMI43=null;
        ScssParser.term_return term39 = null;

        ScssParser.term_return term41 = null;


        CommonTree INCLUDE_DIR36_tree=null;
        CommonTree IDENT37_tree=null;
        CommonTree LPAREN38_tree=null;
        CommonTree COMMA40_tree=null;
        CommonTree RPAREN42_tree=null;
        CommonTree SEMI43_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:19: ( INCLUDE_DIR IDENT ( LPAREN term ( COMMA term )* RPAREN )? SEMI )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:21: INCLUDE_DIR IDENT ( LPAREN term ( COMMA term )* RPAREN )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            INCLUDE_DIR36=(Token)match(input,INCLUDE_DIR,FOLLOW_INCLUDE_DIR_in_include_directive331); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INCLUDE_DIR36_tree = (CommonTree)adaptor.create(INCLUDE_DIR36);
            adaptor.addChild(root_0, INCLUDE_DIR36_tree);
            }
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_include_directive333); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT37_tree = (CommonTree)adaptor.create(IDENT37);
            adaptor.addChild(root_0, IDENT37_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:39: ( LPAREN term ( COMMA term )* RPAREN )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LPAREN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:40: LPAREN term ( COMMA term )* RPAREN
                    {
                    LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_include_directive336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN38_tree = (CommonTree)adaptor.create(LPAREN38);
                    adaptor.addChild(root_0, LPAREN38_tree);
                    }
                    pushFollow(FOLLOW_term_in_include_directive338);
                    term39=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term39.getTree());
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:52: ( COMMA term )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:111:53: COMMA term
                    	    {
                    	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_include_directive341); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA40_tree = (CommonTree)adaptor.create(COMMA40);
                    	    adaptor.addChild(root_0, COMMA40_tree);
                    	    }
                    	    pushFollow(FOLLOW_term_in_include_directive343);
                    	    term41=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_include_directive347); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN42_tree = (CommonTree)adaptor.create(RPAREN42);
                    adaptor.addChild(root_0, RPAREN42_tree);
                    }

                    }
                    break;

            }

            SEMI43=(Token)match(input,SEMI,FOLLOW_SEMI_in_include_directive351); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI43_tree = (CommonTree)adaptor.create(SEMI43);
            adaptor.addChild(root_0, SEMI43_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "include_directive"

    public static class extend_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extend_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:113:1: extend_directive : EXTEND_DIR selector SEMI ;
    public final ScssParser.extend_directive_return extend_directive() throws RecognitionException {
        ScssParser.extend_directive_return retval = new ScssParser.extend_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXTEND_DIR44=null;
        Token SEMI46=null;
        ScssParser.selector_return selector45 = null;


        CommonTree EXTEND_DIR44_tree=null;
        CommonTree SEMI46_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:113:18: ( EXTEND_DIR selector SEMI )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:113:20: EXTEND_DIR selector SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            EXTEND_DIR44=(Token)match(input,EXTEND_DIR,FOLLOW_EXTEND_DIR_in_extend_directive359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTEND_DIR44_tree = (CommonTree)adaptor.create(EXTEND_DIR44);
            adaptor.addChild(root_0, EXTEND_DIR44_tree);
            }
            pushFollow(FOLLOW_selector_in_extend_directive361);
            selector45=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector45.getTree());
            SEMI46=(Token)match(input,SEMI,FOLLOW_SEMI_in_extend_directive363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI46_tree = (CommonTree)adaptor.create(SEMI46);
            adaptor.addChild(root_0, SEMI46_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extend_directive"

    public static class media_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "media_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:115:1: media_directive : MEDIA_DIR medium ( COMMA medium )* LBRACE ruleSet RBRACE ;
    public final ScssParser.media_directive_return media_directive() throws RecognitionException {
        ScssParser.media_directive_return retval = new ScssParser.media_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MEDIA_DIR47=null;
        Token COMMA49=null;
        Token LBRACE51=null;
        Token RBRACE53=null;
        ScssParser.medium_return medium48 = null;

        ScssParser.medium_return medium50 = null;

        ScssParser.ruleSet_return ruleSet52 = null;


        CommonTree MEDIA_DIR47_tree=null;
        CommonTree COMMA49_tree=null;
        CommonTree LBRACE51_tree=null;
        CommonTree RBRACE53_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:116:1: ( MEDIA_DIR medium ( COMMA medium )* LBRACE ruleSet RBRACE )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:116:3: MEDIA_DIR medium ( COMMA medium )* LBRACE ruleSet RBRACE
            {
            root_0 = (CommonTree)adaptor.nil();

            MEDIA_DIR47=(Token)match(input,MEDIA_DIR,FOLLOW_MEDIA_DIR_in_media_directive371); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MEDIA_DIR47_tree = (CommonTree)adaptor.create(MEDIA_DIR47);
            adaptor.addChild(root_0, MEDIA_DIR47_tree);
            }
            pushFollow(FOLLOW_medium_in_media_directive373);
            medium48=medium();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, medium48.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:116:20: ( COMMA medium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:116:21: COMMA medium
            	    {
            	    COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_media_directive376); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA49_tree = (CommonTree)adaptor.create(COMMA49);
            	    adaptor.addChild(root_0, COMMA49_tree);
            	    }
            	    pushFollow(FOLLOW_medium_in_media_directive378);
            	    medium50=medium();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, medium50.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            LBRACE51=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_media_directive382); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE51_tree = (CommonTree)adaptor.create(LBRACE51);
            adaptor.addChild(root_0, LBRACE51_tree);
            }
            pushFollow(FOLLOW_ruleSet_in_media_directive384);
            ruleSet52=ruleSet();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSet52.getTree());
            RBRACE53=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_media_directive386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE53_tree = (CommonTree)adaptor.create(RBRACE53);
            adaptor.addChild(root_0, RBRACE53_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "media_directive"

    public static class page_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "page_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:122:1: page_directive : PAGE_DIR ( pseudoPage )? LBRACE declaration SEMI ( declaration SEMI )* RBRACE ;
    public final ScssParser.page_directive_return page_directive() throws RecognitionException {
        ScssParser.page_directive_return retval = new ScssParser.page_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PAGE_DIR54=null;
        Token LBRACE56=null;
        Token SEMI58=null;
        Token SEMI60=null;
        Token RBRACE61=null;
        ScssParser.pseudoPage_return pseudoPage55 = null;

        ScssParser.declaration_return declaration57 = null;

        ScssParser.declaration_return declaration59 = null;


        CommonTree PAGE_DIR54_tree=null;
        CommonTree LBRACE56_tree=null;
        CommonTree SEMI58_tree=null;
        CommonTree SEMI60_tree=null;
        CommonTree RBRACE61_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:123:1: ( PAGE_DIR ( pseudoPage )? LBRACE declaration SEMI ( declaration SEMI )* RBRACE )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:123:3: PAGE_DIR ( pseudoPage )? LBRACE declaration SEMI ( declaration SEMI )* RBRACE
            {
            root_0 = (CommonTree)adaptor.nil();

            PAGE_DIR54=(Token)match(input,PAGE_DIR,FOLLOW_PAGE_DIR_in_page_directive395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAGE_DIR54_tree = (CommonTree)adaptor.create(PAGE_DIR54);
            adaptor.addChild(root_0, PAGE_DIR54_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:123:12: ( pseudoPage )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COLON) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:123:12: pseudoPage
                    {
                    pushFollow(FOLLOW_pseudoPage_in_page_directive397);
                    pseudoPage55=pseudoPage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pseudoPage55.getTree());

                    }
                    break;

            }

            LBRACE56=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_page_directive400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE56_tree = (CommonTree)adaptor.create(LBRACE56);
            adaptor.addChild(root_0, LBRACE56_tree);
            }
            pushFollow(FOLLOW_declaration_in_page_directive402);
            declaration57=declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration57.getTree());
            SEMI58=(Token)match(input,SEMI,FOLLOW_SEMI_in_page_directive404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI58_tree = (CommonTree)adaptor.create(SEMI58);
            adaptor.addChild(root_0, SEMI58_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:125:18: ( declaration SEMI )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:125:19: declaration SEMI
            	    {
            	    pushFollow(FOLLOW_declaration_in_page_directive407);
            	    declaration59=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration59.getTree());
            	    SEMI60=(Token)match(input,SEMI,FOLLOW_SEMI_in_page_directive409); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SEMI60_tree = (CommonTree)adaptor.create(SEMI60);
            	    adaptor.addChild(root_0, SEMI60_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            RBRACE61=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_page_directive413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE61_tree = (CommonTree)adaptor.create(RBRACE61);
            adaptor.addChild(root_0, RBRACE61_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "page_directive"

    public static class for_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:129:1: for_directive : FOR_DIR VAR FROM term ( THROUGH | TO ) term ruleSetContent ;
    public final ScssParser.for_directive_return for_directive() throws RecognitionException {
        ScssParser.for_directive_return retval = new ScssParser.for_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR_DIR62=null;
        Token VAR63=null;
        Token FROM64=null;
        Token set66=null;
        ScssParser.term_return term65 = null;

        ScssParser.term_return term67 = null;

        ScssParser.ruleSetContent_return ruleSetContent68 = null;


        CommonTree FOR_DIR62_tree=null;
        CommonTree VAR63_tree=null;
        CommonTree FROM64_tree=null;
        CommonTree set66_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:130:1: ( FOR_DIR VAR FROM term ( THROUGH | TO ) term ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:130:3: FOR_DIR VAR FROM term ( THROUGH | TO ) term ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            FOR_DIR62=(Token)match(input,FOR_DIR,FOLLOW_FOR_DIR_in_for_directive422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR_DIR62_tree = (CommonTree)adaptor.create(FOR_DIR62);
            adaptor.addChild(root_0, FOR_DIR62_tree);
            }
            VAR63=(Token)match(input,VAR,FOLLOW_VAR_in_for_directive424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR63_tree = (CommonTree)adaptor.create(VAR63);
            adaptor.addChild(root_0, VAR63_tree);
            }
            FROM64=(Token)match(input,FROM,FOLLOW_FROM_in_for_directive426); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FROM64_tree = (CommonTree)adaptor.create(FROM64);
            adaptor.addChild(root_0, FROM64_tree);
            }
            pushFollow(FOLLOW_term_in_for_directive428);
            term65=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term65.getTree());
            set66=(Token)input.LT(1);
            if ( (input.LA(1)>=THROUGH && input.LA(1)<=TO) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set66));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_term_in_for_directive436);
            term67=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term67.getTree());
            pushFollow(FOLLOW_ruleSetContent_in_for_directive438);
            ruleSetContent68=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent68.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_directive"

    public static class if_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:133:1: if_directive : IF_DIR compare_expr ruleSetContent ( else_block )? ;
    public final ScssParser.if_directive_return if_directive() throws RecognitionException {
        ScssParser.if_directive_return retval = new ScssParser.if_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF_DIR69=null;
        ScssParser.compare_expr_return compare_expr70 = null;

        ScssParser.ruleSetContent_return ruleSetContent71 = null;

        ScssParser.else_block_return else_block72 = null;


        CommonTree IF_DIR69_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:134:1: ( IF_DIR compare_expr ruleSetContent ( else_block )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:134:3: IF_DIR compare_expr ruleSetContent ( else_block )?
            {
            root_0 = (CommonTree)adaptor.nil();

            IF_DIR69=(Token)match(input,IF_DIR,FOLLOW_IF_DIR_in_if_directive447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF_DIR69_tree = (CommonTree)adaptor.create(IF_DIR69);
            adaptor.addChild(root_0, IF_DIR69_tree);
            }
            pushFollow(FOLLOW_compare_expr_in_if_directive449);
            compare_expr70=compare_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_expr70.getTree());
            pushFollow(FOLLOW_ruleSetContent_in_if_directive451);
            ruleSetContent71=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent71.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:134:38: ( else_block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE_DIR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:134:38: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_directive453);
                    else_block72=else_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, else_block72.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_directive"

    public static class else_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_block"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:137:1: else_block : ELSE_DIR ( IF compare_expr )? ruleSetContent ;
    public final ScssParser.else_block_return else_block() throws RecognitionException {
        ScssParser.else_block_return retval = new ScssParser.else_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE_DIR73=null;
        Token IF74=null;
        ScssParser.compare_expr_return compare_expr75 = null;

        ScssParser.ruleSetContent_return ruleSetContent76 = null;


        CommonTree ELSE_DIR73_tree=null;
        CommonTree IF74_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:138:1: ( ELSE_DIR ( IF compare_expr )? ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:138:3: ELSE_DIR ( IF compare_expr )? ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            ELSE_DIR73=(Token)match(input,ELSE_DIR,FOLLOW_ELSE_DIR_in_else_block463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ELSE_DIR73_tree = (CommonTree)adaptor.create(ELSE_DIR73);
            adaptor.addChild(root_0, ELSE_DIR73_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:138:12: ( IF compare_expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IF) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:138:13: IF compare_expr
                    {
                    IF74=(Token)match(input,IF,FOLLOW_IF_in_else_block466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF74_tree = (CommonTree)adaptor.create(IF74);
                    adaptor.addChild(root_0, IF74_tree);
                    }
                    pushFollow(FOLLOW_compare_expr_in_else_block468);
                    compare_expr75=compare_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_expr75.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_ruleSetContent_in_else_block472);
            ruleSetContent76=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent76.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_block"

    public static class while_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:141:1: while_directive : WHILE_DIR compare_expr ruleSetContent ;
    public final ScssParser.while_directive_return while_directive() throws RecognitionException {
        ScssParser.while_directive_return retval = new ScssParser.while_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE_DIR77=null;
        ScssParser.compare_expr_return compare_expr78 = null;

        ScssParser.ruleSetContent_return ruleSetContent79 = null;


        CommonTree WHILE_DIR77_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:142:1: ( WHILE_DIR compare_expr ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:142:3: WHILE_DIR compare_expr ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            WHILE_DIR77=(Token)match(input,WHILE_DIR,FOLLOW_WHILE_DIR_in_while_directive482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE_DIR77_tree = (CommonTree)adaptor.create(WHILE_DIR77);
            adaptor.addChild(root_0, WHILE_DIR77_tree);
            }
            pushFollow(FOLLOW_compare_expr_in_while_directive484);
            compare_expr78=compare_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_expr78.getTree());
            pushFollow(FOLLOW_ruleSetContent_in_while_directive486);
            ruleSetContent79=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent79.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_directive"

    public static class unknown_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unknown_directive"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:145:1: unknown_directive : UNKNOWN_DIR ( . )* SEMI ;
    public final ScssParser.unknown_directive_return unknown_directive() throws RecognitionException {
        ScssParser.unknown_directive_return retval = new ScssParser.unknown_directive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNKNOWN_DIR80=null;
        Token wildcard81=null;
        Token SEMI82=null;

        CommonTree UNKNOWN_DIR80_tree=null;
        CommonTree wildcard81_tree=null;
        CommonTree SEMI82_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:146:1: ( UNKNOWN_DIR ( . )* SEMI )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:146:3: UNKNOWN_DIR ( . )* SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            UNKNOWN_DIR80=(Token)match(input,UNKNOWN_DIR,FOLLOW_UNKNOWN_DIR_in_unknown_directive496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UNKNOWN_DIR80_tree = (CommonTree)adaptor.create(UNKNOWN_DIR80);
            adaptor.addChild(root_0, UNKNOWN_DIR80_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:146:15: ( . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SEMI) ) {
                    alt20=2;
                }
                else if ( ((LA20_0>=IM_SELECTOR && LA20_0<=STRING)||(LA20_0>=IMPORT_DIR && LA20_0<=96)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:146:15: .
            	    {
            	    wildcard81=(Token)input.LT(1);
            	    matchAny(input); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    wildcard81_tree = (CommonTree)adaptor.create(wildcard81);
            	    adaptor.addChild(root_0, wildcard81_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            SEMI82=(Token)match(input,SEMI,FOLLOW_SEMI_in_unknown_directive501); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI82_tree = (CommonTree)adaptor.create(SEMI82);
            adaptor.addChild(root_0, SEMI82_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unknown_directive"

    public static class pseudoPage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pseudoPage"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:149:1: pseudoPage : COLON IDENT ;
    public final ScssParser.pseudoPage_return pseudoPage() throws RecognitionException {
        ScssParser.pseudoPage_return retval = new ScssParser.pseudoPage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON83=null;
        Token IDENT84=null;

        CommonTree COLON83_tree=null;
        CommonTree IDENT84_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:150:1: ( COLON IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:150:3: COLON IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            COLON83=(Token)match(input,COLON,FOLLOW_COLON_in_pseudoPage511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON83_tree = (CommonTree)adaptor.create(COLON83);
            adaptor.addChild(root_0, COLON83_tree);
            }
            IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_pseudoPage513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT84_tree = (CommonTree)adaptor.create(IDENT84);
            adaptor.addChild(root_0, IDENT84_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pseudoPage"

    public static class medium_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "medium"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:153:1: medium : IDENT ;
    public final ScssParser.medium_return medium() throws RecognitionException {
        ScssParser.medium_return retval = new ScssParser.medium_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT85=null;

        CommonTree IDENT85_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:154:1: ( IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:154:3: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT85=(Token)match(input,IDENT,FOLLOW_IDENT_in_medium522); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT85_tree = (CommonTree)adaptor.create(IDENT85);
            adaptor.addChild(root_0, IDENT85_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "medium"

    public static class bodylist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bodylist"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:157:1: bodylist : ( bodyset )* ;
    public final ScssParser.bodylist_return bodylist() throws RecognitionException {
        ScssParser.bodylist_return retval = new ScssParser.bodylist_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ScssParser.bodyset_return bodyset86 = null;



        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:158:1: ( ( bodyset )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:158:3: ( bodyset )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:158:3: ( bodyset )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENT||LA21_0==MIXIN_DIR||LA21_0==VAR||LA21_0==MEDIA_DIR||LA21_0==PAGE_DIR||LA21_0==STAR||(LA21_0>=HASH && LA21_0<=AMPERSAND)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:158:3: bodyset
            	    {
            	    pushFollow(FOLLOW_bodyset_in_bodylist532);
            	    bodyset86=bodyset();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bodyset86.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bodylist"

    public static class bodyset_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bodyset"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:161:1: bodyset : ( ruleSet | media_directive | page_directive | variable_def | mixin_directive );
    public final ScssParser.bodyset_return bodyset() throws RecognitionException {
        ScssParser.bodyset_return retval = new ScssParser.bodyset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ScssParser.ruleSet_return ruleSet87 = null;

        ScssParser.media_directive_return media_directive88 = null;

        ScssParser.page_directive_return page_directive89 = null;

        ScssParser.variable_def_return variable_def90 = null;

        ScssParser.mixin_directive_return mixin_directive91 = null;



        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:162:1: ( ruleSet | media_directive | page_directive | variable_def | mixin_directive )
            int alt22=5;
            switch ( input.LA(1) ) {
            case IDENT:
            case STAR:
            case HASH:
            case CLASS:
            case AMPERSAND:
                {
                alt22=1;
                }
                break;
            case MEDIA_DIR:
                {
                alt22=2;
                }
                break;
            case PAGE_DIR:
                {
                alt22=3;
                }
                break;
            case VAR:
                {
                alt22=4;
                }
                break;
            case MIXIN_DIR:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:162:3: ruleSet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ruleSet_in_bodyset543);
                    ruleSet87=ruleSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSet87.getTree());

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:163:3: media_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_media_directive_in_bodyset547);
                    media_directive88=media_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, media_directive88.getTree());

                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:164:3: page_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_page_directive_in_bodyset551);
                    page_directive89=page_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, page_directive89.getTree());

                    }
                    break;
                case 4 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:165:3: variable_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_def_in_bodyset555);
                    variable_def90=variable_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_def90.getTree());

                    }
                    break;
                case 5 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:166:3: mixin_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_mixin_directive_in_bodyset559);
                    mixin_directive91=mixin_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixin_directive91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bodyset"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:169:1: operator : ( DIV | STAR | MOD | COMMA | );
    public final ScssParser.operator_return operator() throws RecognitionException {
        ScssParser.operator_return retval = new ScssParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIV92=null;
        Token STAR93=null;
        Token MOD94=null;
        Token COMMA95=null;

        CommonTree DIV92_tree=null;
        CommonTree STAR93_tree=null;
        CommonTree MOD94_tree=null;
        CommonTree COMMA95_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:170:1: ( DIV | STAR | MOD | COMMA | )
            int alt23=5;
            switch ( input.LA(1) ) {
            case DIV:
                {
                alt23=1;
                }
                break;
            case STAR:
                {
                alt23=2;
                }
                break;
            case MOD:
                {
                alt23=3;
                }
                break;
            case COMMA:
                {
                alt23=4;
                }
                break;
            case STRING:
            case IDENT:
            case URI:
            case LPAREN:
            case VAR:
            case PLUS:
            case MINUS:
            case HASH:
            case NUMBER:
            case PERCENTAGE:
            case LENGTH_PX:
            case LENGTH_CM:
            case LENGTH_MM:
            case LENGTH_IN:
            case LENGTH_PT:
            case LENGTH_PC:
            case ANGLE_DEG:
            case ANGLE_RAD:
            case ANGLE_GRAD:
            case EMS:
            case EXS:
            case TIME_MS:
            case TIME_S:
            case FREQ_HZ:
            case FREQ_KHZ:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:170:3: DIV
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DIV92=(Token)match(input,DIV,FOLLOW_DIV_in_operator572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIV92_tree = (CommonTree)adaptor.create(DIV92);
                    adaptor.addChild(root_0, DIV92_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:171:3: STAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STAR93=(Token)match(input,STAR,FOLLOW_STAR_in_operator576); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR93_tree = (CommonTree)adaptor.create(STAR93);
                    adaptor.addChild(root_0, STAR93_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:172:3: MOD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MOD94=(Token)match(input,MOD,FOLLOW_MOD_in_operator581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MOD94_tree = (CommonTree)adaptor.create(MOD94);
                    adaptor.addChild(root_0, MOD94_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:173:3: COMMA
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_operator585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA95_tree = (CommonTree)adaptor.create(COMMA95);
                    adaptor.addChild(root_0, COMMA95_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:175:1: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class combinator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "combinator"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:177:1: combinator : ( PLUS | GT );
    public final ScssParser.combinator_return combinator() throws RecognitionException {
        ScssParser.combinator_return retval = new ScssParser.combinator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set96=null;

        CommonTree set96_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:178:1: ( PLUS | GT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set96=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=GT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set96));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "combinator"

    public static class unaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOperator"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:183:1: unaryOperator : ( MINUS | PLUS );
    public final ScssParser.unaryOperator_return unaryOperator() throws RecognitionException {
        ScssParser.unaryOperator_return retval = new ScssParser.unaryOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set97=null;

        CommonTree set97_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:184:1: ( MINUS | PLUS )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set97=(Token)input.LT(1);
            if ( input.LA(1)==PLUS||input.LA(1)==MINUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set97));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOperator"

    public static class property_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:188:1: property : IDENT ;
    public final ScssParser.property_return property() throws RecognitionException {
        ScssParser.property_return retval = new ScssParser.property_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT98=null;

        CommonTree IDENT98_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:188:9: ( IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:188:12: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT98=(Token)match(input,IDENT,FOLLOW_IDENT_in_property627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT98_tree = (CommonTree)adaptor.create(IDENT98);
            adaptor.addChild(root_0, IDENT98_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "property"

    public static class ruleSet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleSet"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:190:1: ruleSet : selector ( COMMA selector )* ruleSetContent ;
    public final ScssParser.ruleSet_return ruleSet() throws RecognitionException {
        ScssParser.ruleSet_return retval = new ScssParser.ruleSet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA100=null;
        ScssParser.selector_return selector99 = null;

        ScssParser.selector_return selector101 = null;

        ScssParser.ruleSetContent_return ruleSetContent102 = null;


        CommonTree COMMA100_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:191:1: ( selector ( COMMA selector )* ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:191:3: selector ( COMMA selector )* ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_selector_in_ruleSet635);
            selector99=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector99.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:191:12: ( COMMA selector )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:191:13: COMMA selector
            	    {
            	    COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_ruleSet638); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA100_tree = (CommonTree)adaptor.create(COMMA100);
            	    adaptor.addChild(root_0, COMMA100_tree);
            	    }
            	    pushFollow(FOLLOW_selector_in_ruleSet640);
            	    selector101=selector();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector101.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_ruleSetContent_in_ruleSet644);
            ruleSetContent102=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent102.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleSet"

    public static class nest_property_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nest_property"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:195:1: nest_property : property COLON ruleSetContent ;
    public final ScssParser.nest_property_return nest_property() throws RecognitionException {
        ScssParser.nest_property_return retval = new ScssParser.nest_property_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON104=null;
        ScssParser.property_return property103 = null;

        ScssParser.ruleSetContent_return ruleSetContent105 = null;


        CommonTree COLON104_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:196:1: ( property COLON ruleSetContent )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:196:2: property COLON ruleSetContent
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_property_in_nest_property652);
            property103=property();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, property103.getTree());
            COLON104=(Token)match(input,COLON,FOLLOW_COLON_in_nest_property654); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON104_tree = (CommonTree)adaptor.create(COLON104);
            adaptor.addChild(root_0, COLON104_tree);
            }
            pushFollow(FOLLOW_ruleSetContent_in_nest_property656);
            ruleSetContent105=ruleSetContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSetContent105.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nest_property"

    public static class ruleSetContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleSetContent"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:199:1: ruleSetContent : LBRACE ( declaration SEMI | ruleSet | nest_property | variable_def | extend_directive | include_directive | for_directive | while_directive | if_directive )* RBRACE ;
    public final ScssParser.ruleSetContent_return ruleSetContent() throws RecognitionException {
        ScssParser.ruleSetContent_return retval = new ScssParser.ruleSetContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACE106=null;
        Token SEMI108=null;
        Token RBRACE117=null;
        ScssParser.declaration_return declaration107 = null;

        ScssParser.ruleSet_return ruleSet109 = null;

        ScssParser.nest_property_return nest_property110 = null;

        ScssParser.variable_def_return variable_def111 = null;

        ScssParser.extend_directive_return extend_directive112 = null;

        ScssParser.include_directive_return include_directive113 = null;

        ScssParser.for_directive_return for_directive114 = null;

        ScssParser.while_directive_return while_directive115 = null;

        ScssParser.if_directive_return if_directive116 = null;


        CommonTree LBRACE106_tree=null;
        CommonTree SEMI108_tree=null;
        CommonTree RBRACE117_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:200:1: ( LBRACE ( declaration SEMI | ruleSet | nest_property | variable_def | extend_directive | include_directive | for_directive | while_directive | if_directive )* RBRACE )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:200:2: LBRACE ( declaration SEMI | ruleSet | nest_property | variable_def | extend_directive | include_directive | for_directive | while_directive | if_directive )* RBRACE
            {
            root_0 = (CommonTree)adaptor.nil();

            LBRACE106=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_ruleSetContent670); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE106_tree = (CommonTree)adaptor.create(LBRACE106);
            adaptor.addChild(root_0, LBRACE106_tree);
            }
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:201:1: ( declaration SEMI | ruleSet | nest_property | variable_def | extend_directive | include_directive | for_directive | while_directive | if_directive )*
            loop25:
            do {
                int alt25=10;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:201:2: declaration SEMI
            	    {
            	    pushFollow(FOLLOW_declaration_in_ruleSetContent673);
            	    declaration107=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration107.getTree());
            	    SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_ruleSetContent675); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SEMI108_tree = (CommonTree)adaptor.create(SEMI108);
            	    adaptor.addChild(root_0, SEMI108_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:202:2: ruleSet
            	    {
            	    pushFollow(FOLLOW_ruleSet_in_ruleSetContent678);
            	    ruleSet109=ruleSet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ruleSet109.getTree());

            	    }
            	    break;
            	case 3 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:203:2: nest_property
            	    {
            	    pushFollow(FOLLOW_nest_property_in_ruleSetContent681);
            	    nest_property110=nest_property();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, nest_property110.getTree());

            	    }
            	    break;
            	case 4 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:204:2: variable_def
            	    {
            	    pushFollow(FOLLOW_variable_def_in_ruleSetContent684);
            	    variable_def111=variable_def();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_def111.getTree());

            	    }
            	    break;
            	case 5 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:205:2: extend_directive
            	    {
            	    pushFollow(FOLLOW_extend_directive_in_ruleSetContent687);
            	    extend_directive112=extend_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, extend_directive112.getTree());

            	    }
            	    break;
            	case 6 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:206:2: include_directive
            	    {
            	    pushFollow(FOLLOW_include_directive_in_ruleSetContent690);
            	    include_directive113=include_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, include_directive113.getTree());

            	    }
            	    break;
            	case 7 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:207:2: for_directive
            	    {
            	    pushFollow(FOLLOW_for_directive_in_ruleSetContent693);
            	    for_directive114=for_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_directive114.getTree());

            	    }
            	    break;
            	case 8 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:208:2: while_directive
            	    {
            	    pushFollow(FOLLOW_while_directive_in_ruleSetContent696);
            	    while_directive115=while_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_directive115.getTree());

            	    }
            	    break;
            	case 9 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:209:2: if_directive
            	    {
            	    pushFollow(FOLLOW_if_directive_in_ruleSetContent699);
            	    if_directive116=if_directive();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_directive116.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            RBRACE117=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_ruleSetContent705); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE117_tree = (CommonTree)adaptor.create(RBRACE117);
            adaptor.addChild(root_0, RBRACE117_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleSetContent"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:213:1: selector : simpleSelector ( ( combinator )? simpleSelector )* ;
    public final ScssParser.selector_return selector() throws RecognitionException {
        ScssParser.selector_return retval = new ScssParser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ScssParser.simpleSelector_return simpleSelector118 = null;

        ScssParser.combinator_return combinator119 = null;

        ScssParser.simpleSelector_return simpleSelector120 = null;



        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:1: ( simpleSelector ( ( combinator )? simpleSelector )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:3: simpleSelector ( ( combinator )? simpleSelector )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleSelector_in_selector715);
            simpleSelector118=simpleSelector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleSelector118.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:18: ( ( combinator )? simpleSelector )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT||LA27_0==STAR||(LA27_0>=PLUS && LA27_0<=GT)||(LA27_0>=HASH && LA27_0<=AMPERSAND)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:19: ( combinator )? simpleSelector
            	    {
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:19: ( combinator )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=PLUS && LA26_0<=GT)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:214:19: combinator
            	            {
            	            pushFollow(FOLLOW_combinator_in_selector718);
            	            combinator119=combinator();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, combinator119.getTree());

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simpleSelector_in_selector721);
            	    simpleSelector120=simpleSelector();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleSelector120.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class simpleSelector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleSelector"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:217:1: simpleSelector : element ( ATTRIB )* ( PSEUDO )? ;
    public final ScssParser.simpleSelector_return simpleSelector() throws RecognitionException {
        ScssParser.simpleSelector_return retval = new ScssParser.simpleSelector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ATTRIB122=null;
        Token PSEUDO123=null;
        ScssParser.element_return element121 = null;


        CommonTree ATTRIB122_tree=null;
        CommonTree PSEUDO123_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:218:1: ( element ( ATTRIB )* ( PSEUDO )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:219:1: element ( ATTRIB )* ( PSEUDO )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_element_in_simpleSelector735);
            element121=element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, element121.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:219:9: ( ATTRIB )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ATTRIB) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:219:9: ATTRIB
            	    {
            	    ATTRIB122=(Token)match(input,ATTRIB,FOLLOW_ATTRIB_in_simpleSelector737); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ATTRIB122_tree = (CommonTree)adaptor.create(ATTRIB122);
            	    adaptor.addChild(root_0, ATTRIB122_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:219:17: ( PSEUDO )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PSEUDO) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:219:17: PSEUDO
                    {
                    PSEUDO123=(Token)match(input,PSEUDO,FOLLOW_PSEUDO_in_simpleSelector740); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PSEUDO123_tree = (CommonTree)adaptor.create(PSEUDO123);
                    adaptor.addChild(root_0, PSEUDO123_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleSelector"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:223:1: element : ( HASH | CLASS | AMPERSAND | IDENT | STAR );
    public final ScssParser.element_return element() throws RecognitionException {
        ScssParser.element_return retval = new ScssParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set124=null;

        CommonTree set124_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:224:1: ( HASH | CLASS | AMPERSAND | IDENT | STAR )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set124=(Token)input.LT(1);
            if ( input.LA(1)==IDENT||input.LA(1)==STAR||(input.LA(1)>=HASH && input.LA(1)<=AMPERSAND) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set124));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:231:1: declaration : property COLON expr ( IMPORTANT )? ;
    public final ScssParser.declaration_return declaration() throws RecognitionException {
        ScssParser.declaration_return retval = new ScssParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON126=null;
        Token IMPORTANT128=null;
        ScssParser.property_return property125 = null;

        ScssParser.expr_return expr127 = null;


        CommonTree COLON126_tree=null;
        CommonTree IMPORTANT128_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:232:1: ( property COLON expr ( IMPORTANT )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:232:3: property COLON expr ( IMPORTANT )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_property_in_declaration776);
            property125=property();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, property125.getTree());
            COLON126=(Token)match(input,COLON,FOLLOW_COLON_in_declaration778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON126_tree = (CommonTree)adaptor.create(COLON126);
            adaptor.addChild(root_0, COLON126_tree);
            }
            pushFollow(FOLLOW_expr_in_declaration780);
            expr127=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:232:23: ( IMPORTANT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IMPORTANT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:232:23: IMPORTANT
                    {
                    IMPORTANT128=(Token)match(input,IMPORTANT,FOLLOW_IMPORTANT_in_declaration782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORTANT128_tree = (CommonTree)adaptor.create(IMPORTANT128);
                    adaptor.addChild(root_0, IMPORTANT128_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class comparator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparator"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:239:1: comparator : ( EQ | NEQ | GTE | LTE | GT | LT );
    public final ScssParser.comparator_return comparator() throws RecognitionException {
        ScssParser.comparator_return retval = new ScssParser.comparator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set129=null;

        CommonTree set129_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:239:11: ( EQ | NEQ | GTE | LTE | GT | LT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set129=(Token)input.LT(1);
            if ( input.LA(1)==GT||(input.LA(1)>=EQ && input.LA(1)<=LT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set129));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparator"

    public static class compare_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expr"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:241:1: compare_expr : expr ( comparator expr )? ;
    public final ScssParser.compare_expr_return compare_expr() throws RecognitionException {
        ScssParser.compare_expr_return retval = new ScssParser.compare_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ScssParser.expr_return expr130 = null;

        ScssParser.comparator_return comparator131 = null;

        ScssParser.expr_return expr132 = null;



        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:242:1: ( expr ( comparator expr )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:242:3: expr ( comparator expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_compare_expr825);
            expr130=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr130.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:242:8: ( comparator expr )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==GT||(LA31_0>=EQ && LA31_0<=LT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:242:9: comparator expr
                    {
                    pushFollow(FOLLOW_comparator_in_compare_expr828);
                    comparator131=comparator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparator131.getTree());
                    pushFollow(FOLLOW_expr_in_compare_expr830);
                    expr132=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compare_expr"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:245:1: expr : paren_term ( operator paren_term )* ;
    public final ScssParser.expr_return expr() throws RecognitionException {
        ScssParser.expr_return retval = new ScssParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ScssParser.paren_term_return paren_term133 = null;

        ScssParser.operator_return operator134 = null;

        ScssParser.paren_term_return paren_term135 = null;



        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:246:1: ( paren_term ( operator paren_term )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:246:3: paren_term ( operator paren_term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_paren_term_in_expr842);
            paren_term133=paren_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paren_term133.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:246:14: ( operator paren_term )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==STRING||(LA32_0>=COMMA && LA32_0<=URI)||(LA32_0>=LPAREN && LA32_0<=VAR)||(LA32_0>=DIV && LA32_0<=PLUS)||LA32_0==MINUS||LA32_0==HASH||(LA32_0>=NUMBER && LA32_0<=FREQ_KHZ)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:246:15: operator paren_term
            	    {
            	    pushFollow(FOLLOW_operator_in_expr845);
            	    operator134=operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator134.getTree());
            	    pushFollow(FOLLOW_paren_term_in_expr847);
            	    paren_term135=paren_term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, paren_term135.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class paren_term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paren_term"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:249:1: paren_term : ( term | ( ( unaryOperator )? ( LPAREN expr RPAREN ) ) );
    public final ScssParser.paren_term_return paren_term() throws RecognitionException {
        ScssParser.paren_term_return retval = new ScssParser.paren_term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN138=null;
        Token RPAREN140=null;
        ScssParser.term_return term136 = null;

        ScssParser.unaryOperator_return unaryOperator137 = null;

        ScssParser.expr_return expr139 = null;


        CommonTree LPAREN138_tree=null;
        CommonTree RPAREN140_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:1: ( term | ( ( unaryOperator )? ( LPAREN expr RPAREN ) ) )
            int alt34=2;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==LPAREN) ) {
                    alt34=2;
                }
                else if ( ((LA34_1>=NUMBER && LA34_1<=FREQ_KHZ)) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case IDENT:
            case URI:
            case VAR:
            case HASH:
            case NUMBER:
            case PERCENTAGE:
            case LENGTH_PX:
            case LENGTH_CM:
            case LENGTH_MM:
            case LENGTH_IN:
            case LENGTH_PT:
            case LENGTH_PC:
            case ANGLE_DEG:
            case ANGLE_RAD:
            case ANGLE_GRAD:
            case EMS:
            case EXS:
            case TIME_MS:
            case TIME_S:
            case FREQ_HZ:
            case FREQ_KHZ:
                {
                alt34=1;
                }
                break;
            case LPAREN:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:3: term
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_term_in_paren_term858);
                    term136=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term136.getTree());

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:10: ( ( unaryOperator )? ( LPAREN expr RPAREN ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:10: ( ( unaryOperator )? ( LPAREN expr RPAREN ) )
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:11: ( unaryOperator )? ( LPAREN expr RPAREN )
                    {
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:11: ( unaryOperator )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==PLUS||LA33_0==MINUS) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:11: unaryOperator
                            {
                            pushFollow(FOLLOW_unaryOperator_in_paren_term863);
                            unaryOperator137=unaryOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryOperator137.getTree());

                            }
                            break;

                    }

                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:26: ( LPAREN expr RPAREN )
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:250:27: LPAREN expr RPAREN
                    {
                    LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paren_term867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN138_tree = (CommonTree)adaptor.create(LPAREN138);
                    adaptor.addChild(root_0, LPAREN138_tree);
                    }
                    pushFollow(FOLLOW_expr_in_paren_term869);
                    expr139=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr139.getTree());
                    RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paren_term871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN140_tree = (CommonTree)adaptor.create(RPAREN140);
                    adaptor.addChild(root_0, RPAREN140_tree);
                    }

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paren_term"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:254:1: term : ( ( unaryOperator )? ( NUMBER | PERCENTAGE | LENGTH_PX | LENGTH_CM | LENGTH_MM | LENGTH_IN | LENGTH_PT | LENGTH_PC | ANGLE_DEG | ANGLE_RAD | ANGLE_GRAD | EMS | EXS | TIME_MS | TIME_S | FREQ_HZ | FREQ_KHZ ) | STRING | URI | IDENT ( ( LPAREN )=> LPAREN expr RPAREN )? | VAR | hexColor );
    public final ScssParser.term_return term() throws RecognitionException {
        ScssParser.term_return retval = new ScssParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set142=null;
        Token STRING143=null;
        Token URI144=null;
        Token IDENT145=null;
        Token LPAREN146=null;
        Token RPAREN148=null;
        Token VAR149=null;
        ScssParser.unaryOperator_return unaryOperator141 = null;

        ScssParser.expr_return expr147 = null;

        ScssParser.hexColor_return hexColor150 = null;


        CommonTree set142_tree=null;
        CommonTree STRING143_tree=null;
        CommonTree URI144_tree=null;
        CommonTree IDENT145_tree=null;
        CommonTree LPAREN146_tree=null;
        CommonTree RPAREN148_tree=null;
        CommonTree VAR149_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:255:1: ( ( unaryOperator )? ( NUMBER | PERCENTAGE | LENGTH_PX | LENGTH_CM | LENGTH_MM | LENGTH_IN | LENGTH_PT | LENGTH_PC | ANGLE_DEG | ANGLE_RAD | ANGLE_GRAD | EMS | EXS | TIME_MS | TIME_S | FREQ_HZ | FREQ_KHZ ) | STRING | URI | IDENT ( ( LPAREN )=> LPAREN expr RPAREN )? | VAR | hexColor )
            int alt37=6;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
            case NUMBER:
            case PERCENTAGE:
            case LENGTH_PX:
            case LENGTH_CM:
            case LENGTH_MM:
            case LENGTH_IN:
            case LENGTH_PT:
            case LENGTH_PC:
            case ANGLE_DEG:
            case ANGLE_RAD:
            case ANGLE_GRAD:
            case EMS:
            case EXS:
            case TIME_MS:
            case TIME_S:
            case FREQ_HZ:
            case FREQ_KHZ:
                {
                alt37=1;
                }
                break;
            case STRING:
                {
                alt37=2;
                }
                break;
            case URI:
                {
                alt37=3;
                }
                break;
            case IDENT:
                {
                alt37=4;
                }
                break;
            case VAR:
                {
                alt37=5;
                }
                break;
            case HASH:
                {
                alt37=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:255:3: ( unaryOperator )? ( NUMBER | PERCENTAGE | LENGTH_PX | LENGTH_CM | LENGTH_MM | LENGTH_IN | LENGTH_PT | LENGTH_PC | ANGLE_DEG | ANGLE_RAD | ANGLE_GRAD | EMS | EXS | TIME_MS | TIME_S | FREQ_HZ | FREQ_KHZ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:255:3: ( unaryOperator )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==PLUS||LA35_0==MINUS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:255:3: unaryOperator
                            {
                            pushFollow(FOLLOW_unaryOperator_in_term886);
                            unaryOperator141=unaryOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryOperator141.getTree());

                            }
                            break;

                    }

                    set142=(Token)input.LT(1);
                    if ( (input.LA(1)>=NUMBER && input.LA(1)<=FREQ_KHZ) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set142));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:276:3: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING143=(Token)match(input,STRING,FOLLOW_STRING_in_term967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING143_tree = (CommonTree)adaptor.create(STRING143);
                    adaptor.addChild(root_0, STRING143_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:277:3: URI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    URI144=(Token)match(input,URI,FOLLOW_URI_in_term971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI144_tree = (CommonTree)adaptor.create(URI144);
                    adaptor.addChild(root_0, URI144_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:278:3: IDENT ( ( LPAREN )=> LPAREN expr RPAREN )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT145=(Token)match(input,IDENT,FOLLOW_IDENT_in_term975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT145_tree = (CommonTree)adaptor.create(IDENT145);
                    adaptor.addChild(root_0, IDENT145_tree);
                    }
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:278:9: ( ( LPAREN )=> LPAREN expr RPAREN )?
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:279:5: ( LPAREN )=> LPAREN expr RPAREN
                            {
                            LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_term989); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LPAREN146_tree = (CommonTree)adaptor.create(LPAREN146);
                            adaptor.addChild(root_0, LPAREN146_tree);
                            }
                            pushFollow(FOLLOW_expr_in_term991);
                            expr147=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr147.getTree());
                            RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_term993); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            RPAREN148_tree = (CommonTree)adaptor.create(RPAREN148);
                            adaptor.addChild(root_0, RPAREN148_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:281:3: VAR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    VAR149=(Token)match(input,VAR,FOLLOW_VAR_in_term1001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR149_tree = (CommonTree)adaptor.create(VAR149);
                    adaptor.addChild(root_0, VAR149_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:282:4: hexColor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hexColor_in_term1008);
                    hexColor150=hexColor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hexColor150.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class hexColor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hexColor"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:285:1: hexColor : HASH ;
    public final ScssParser.hexColor_return hexColor() throws RecognitionException {
        ScssParser.hexColor_return retval = new ScssParser.hexColor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HASH151=null;

        CommonTree HASH151_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:285:9: ( HASH )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:285:11: HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            HASH151=(Token)match(input,HASH,FOLLOW_HASH_in_hexColor1017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HASH151_tree = (CommonTree)adaptor.create(HASH151);
            adaptor.addChild(root_0, HASH151_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hexColor"

    public static class variable_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_def"
    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:287:1: variable_def : VAR COLON term ( IMPORTANT )? ( DEFAULT )? SEMI ;
    public final ScssParser.variable_def_return variable_def() throws RecognitionException {
        ScssParser.variable_def_return retval = new ScssParser.variable_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR152=null;
        Token COLON153=null;
        Token IMPORTANT155=null;
        Token DEFAULT156=null;
        Token SEMI157=null;
        ScssParser.term_return term154 = null;


        CommonTree VAR152_tree=null;
        CommonTree COLON153_tree=null;
        CommonTree IMPORTANT155_tree=null;
        CommonTree DEFAULT156_tree=null;
        CommonTree SEMI157_tree=null;

        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:1: ( VAR COLON term ( IMPORTANT )? ( DEFAULT )? SEMI )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:4: VAR COLON term ( IMPORTANT )? ( DEFAULT )? SEMI
            {
            root_0 = (CommonTree)adaptor.nil();

            VAR152=(Token)match(input,VAR,FOLLOW_VAR_in_variable_def1026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR152_tree = (CommonTree)adaptor.create(VAR152);
            adaptor.addChild(root_0, VAR152_tree);
            }
            COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_variable_def1028); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON153_tree = (CommonTree)adaptor.create(COLON153);
            adaptor.addChild(root_0, COLON153_tree);
            }
            pushFollow(FOLLOW_term_in_variable_def1030);
            term154=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term154.getTree());
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:19: ( IMPORTANT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IMPORTANT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:19: IMPORTANT
                    {
                    IMPORTANT155=(Token)match(input,IMPORTANT,FOLLOW_IMPORTANT_in_variable_def1032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORTANT155_tree = (CommonTree)adaptor.create(IMPORTANT155);
                    adaptor.addChild(root_0, IMPORTANT155_tree);
                    }

                    }
                    break;

            }

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:30: ( DEFAULT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DEFAULT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:288:30: DEFAULT
                    {
                    DEFAULT156=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_variable_def1035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT156_tree = (CommonTree)adaptor.create(DEFAULT156);
                    adaptor.addChild(root_0, DEFAULT156_tree);
                    }

                    }
                    break;

            }

            SEMI157=(Token)match(input,SEMI,FOLLOW_SEMI_in_variable_def1038); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI157_tree = (CommonTree)adaptor.create(SEMI157);
            adaptor.addChild(root_0, SEMI157_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_def"

    // $ANTLR start synpred1_Scss
    public final void synpred1_Scss_fragment() throws RecognitionException {   
        // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:279:5: ( LPAREN )
        // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:279:7: LPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_Scss986); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Scss

    // Delegated rules

    public final boolean synpred1_Scss() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Scss_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA25_eotS =
        "\15\uffff";
    static final String DFA25_eofS =
        "\15\uffff";
    static final String DFA25_minS =
        "\1\14\1\uffff\1\13\7\uffff\1\10\2\uffff";
    static final String DFA25_maxS =
        "\1\54\1\uffff\1\54\7\uffff\1\103\2\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\12\1\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1"+
        "\1\3";
    static final String DFA25_specialS =
        "\15\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\3\uffff\1\4\2\uffff\1\6\1\5\2\uffff\1\1\1\uffff\1\7\3"+
            "\uffff\1\11\2\uffff\1\10\2\uffff\1\3\6\uffff\3\3",
            "",
            "\2\3\5\uffff\1\12\3\uffff\1\3\14\uffff\1\3\1\uffff\2\3\1\uffff"+
            "\5\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\3\uffff\2\13\1\uffff\2\13\5\uffff\1\14\16\uffff\1\13"+
            "\1\uffff\1\13\2\uffff\1\13\10\uffff\21\13",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 201:1: ( declaration SEMI | ruleSet | nest_property | variable_def | extend_directive | include_directive | for_directive | while_directive | if_directive )*";
        }
    }
    static final String DFA36_eotS =
        "\25\uffff";
    static final String DFA36_eofS =
        "\25\uffff";
    static final String DFA36_minS =
        "\1\10\1\0\23\uffff";
    static final String DFA36_maxS =
        "\1\104\1\0\23\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\21\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\2\1\uffff\3\2\1\uffff\1\1\2\2\4\uffff\1\2\4\uffff\2\2\5"+
            "\uffff\6\2\2\uffff\1\2\2\uffff\30\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "278:9: ( ( LPAREN )=> LPAREN expr RPAREN )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Scss()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_charset_directive_in_stylesheet126 = new BitSet(new long[]{0x00001C0A01215400L});
    public static final BitSet FOLLOW_import_directive_in_stylesheet128 = new BitSet(new long[]{0x00001C0A01215400L});
    public static final BitSet FOLLOW_unknown_directive_in_stylesheet131 = new BitSet(new long[]{0x00001C0A01215000L});
    public static final BitSet FOLLOW_bodylist_in_stylesheet134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_stylesheet137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARSET_DIR_in_charset_directive148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_charset_directive150 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_charset_directive152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_DIR_in_import_directive165 = new BitSet(new long[]{0x0000000000002100L,0x0000000100000000L});
    public static final BitSet FOLLOW_import__in_import_directive167 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_import_directive170 = new BitSet(new long[]{0x0000000000002100L,0x0000000100000000L});
    public static final BitSet FOLLOW_import__in_import_directive172 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_SEMI_in_import_directive176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_import_188 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_96_in_import_191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_import_193 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAREN_in_import_195 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_URI_in_import_198 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_medium_in_import_202 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_import_205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_medium_in_import_207 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_MIXIN_DIR_in_mixin_directive221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_mixin_directive223 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_LPAREN_in_mixin_directive227 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_VAR_in_mixin_directive259 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_COMMA_in_mixin_directive262 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VAR_in_mixin_directive264 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_mixinOptionalArg_in_mixin_directive279 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_COMMA_in_mixin_directive292 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_mixinOptionalArg_in_mixin_directive294 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_RPAREN_in_mixin_directive302 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_mixin_directive306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_mixinOptionalArg317 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_mixinOptionalArg319 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_mixinOptionalArg321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_DIR_in_include_directive331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_include_directive333 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_LPAREN_in_include_directive336 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_include_directive338 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_COMMA_in_include_directive341 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_include_directive343 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_RPAREN_in_include_directive347 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_include_directive351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTEND_DIR_in_extend_directive359 = new BitSet(new long[]{0x00001C0800001000L});
    public static final BitSet FOLLOW_selector_in_extend_directive361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_extend_directive363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEDIA_DIR_in_media_directive371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_medium_in_media_directive373 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_COMMA_in_media_directive376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_medium_in_media_directive378 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_LBRACE_in_media_directive382 = new BitSet(new long[]{0x00001C0800001000L});
    public static final BitSet FOLLOW_ruleSet_in_media_directive384 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RBRACE_in_media_directive386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAGE_DIR_in_page_directive395 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_pseudoPage_in_page_directive397 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACE_in_page_directive400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_declaration_in_page_directive402 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_page_directive404 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_declaration_in_page_directive407 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_page_directive409 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_RBRACE_in_page_directive413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_DIR_in_for_directive422 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_VAR_in_for_directive424 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_FROM_in_for_directive426 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_for_directive428 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_for_directive430 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_for_directive436 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_for_directive438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_DIR_in_if_directive447 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_compare_expr_in_if_directive449 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_if_directive451 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_block_in_if_directive453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_DIR_in_else_block463 = new BitSet(new long[]{0x0000000080408000L});
    public static final BitSet FOLLOW_IF_in_else_block466 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_compare_expr_in_else_block468 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_else_block472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_DIR_in_while_directive482 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_compare_expr_in_while_directive484 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_while_directive486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNKNOWN_DIR_in_unknown_directive496 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000001FFFFFFFFL});
    public static final BitSet FOLLOW_SEMI_in_unknown_directive501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_pseudoPage511 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENT_in_pseudoPage513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_medium522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bodyset_in_bodylist532 = new BitSet(new long[]{0x00001C0801215002L});
    public static final BitSet FOLLOW_ruleSet_in_bodyset543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_media_directive_in_bodyset547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_page_directive_in_bodyset551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_def_in_bodyset555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixin_directive_in_bodyset559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_operator572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_operator576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_operator581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operator585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_combinator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_property627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_ruleSet635 = new BitSet(new long[]{0x0000000000408800L});
    public static final BitSet FOLLOW_COMMA_in_ruleSet638 = new BitSet(new long[]{0x00001C0800001000L});
    public static final BitSet FOLLOW_selector_in_ruleSet640 = new BitSet(new long[]{0x0000000000408800L});
    public static final BitSet FOLLOW_ruleSetContent_in_ruleSet644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_nest_property652 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_nest_property654 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleSetContent_in_nest_property656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_ruleSetContent670 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_declaration_in_ruleSetContent673 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_ruleSetContent675 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSetContent678 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_nest_property_in_ruleSetContent681 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_variable_def_in_ruleSetContent684 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_extend_directive_in_ruleSetContent687 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_include_directive_in_ruleSetContent690 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_for_directive_in_ruleSetContent693 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_while_directive_in_ruleSetContent696 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_if_directive_in_ruleSetContent699 = new BitSet(new long[]{0x00001C0922991000L});
    public static final BitSet FOLLOW_RBRACE_in_ruleSetContent705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleSelector_in_selector715 = new BitSet(new long[]{0x00001C6800001002L});
    public static final BitSet FOLLOW_combinator_in_selector718 = new BitSet(new long[]{0x00001C0800001000L});
    public static final BitSet FOLLOW_simpleSelector_in_selector721 = new BitSet(new long[]{0x00001C6800001002L});
    public static final BitSet FOLLOW_element_in_simpleSelector735 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ATTRIB_in_simpleSelector737 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_PSEUDO_in_simpleSelector740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_element0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_declaration776 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_declaration778 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_declaration780 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IMPORTANT_in_declaration782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_compare_expr825 = new BitSet(new long[]{0x0007C04000000002L});
    public static final BitSet FOLLOW_comparator_in_compare_expr828 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_compare_expr830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paren_term_in_expr842 = new BitSet(new long[]{0xFFF804BC0001B902L,0x000000000000000FL});
    public static final BitSet FOLLOW_operator_in_expr845 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_paren_term_in_expr847 = new BitSet(new long[]{0xFFF804BC0001B902L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_paren_term858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_paren_term863 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_paren_term867 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_paren_term869 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAREN_in_paren_term871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_term886 = new BitSet(new long[]{0xFFF8000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_term889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_term971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term975 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LPAREN_in_term989 = new BitSet(new long[]{0xFFF804A00001B100L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_term991 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RPAREN_in_term993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_term1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hexColor_in_term1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_hexColor1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variable_def1026 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_variable_def1028 = new BitSet(new long[]{0xFFF804A000013100L,0x000000000000000FL});
    public static final BitSet FOLLOW_term_in_variable_def1030 = new BitSet(new long[]{0x0000200000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_IMPORTANT_in_variable_def1032 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_DEFAULT_in_variable_def1035 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SEMI_in_variable_def1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_Scss986 = new BitSet(new long[]{0x0000000000000002L});

}