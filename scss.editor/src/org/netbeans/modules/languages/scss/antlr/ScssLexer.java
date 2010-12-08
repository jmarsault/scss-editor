// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g 2010-12-08 20:07:43
package org.netbeans.modules.languages.scss.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("cast") public class ScssLexer extends Lexer {
    public static final int LT=50;
    public static final int ATTRIB=40;
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
    public static final int SHARP=75;
    public static final int RBRACE=23;
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
    public static final int OR=83;
    public static final int SL_COMMENT=80;
    public static final int SINGLE_EQ=81;
    public static final int TIME_MS=64;
    public static final int GT=38;
    public static final int INTERPOLATION=70;
    public static final int PAGE_DIR=24;
    public static final int LENGTH_PX=53;
    public static final int FROM=26;
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
    public static final int FREQ_KHZ=67;
    public static final int MEDIA_DIR=21;
    public static final int CHARSET_DIR=7;
    public static final int ANGLE_RAD=60;
    public static final int STRING=8;
    public static final int WHILE_DIR=32;





    // delegates
    // delegators

    public ScssLexer() {;} 
    public ScssLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScssLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g"; }

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:9:7: ( 'url(' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:9:9: 'url('
            {
            match("url("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "INTERPOLATION"
    public final void mINTERPOLATION() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:291:24: ( BEGIN_INTERPOLATION VAR RBRACE )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:291:26: BEGIN_INTERPOLATION VAR RBRACE
            {
            mBEGIN_INTERPOLATION(); 
            mVAR(); 
            mRBRACE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "INTERPOLATION"

    // $ANTLR start "HEXCHAR"
    public final void mHEXCHAR() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:293:25: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:293:27: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEXCHAR"

    // $ANTLR start "NONASCII"
    public final void mNONASCII() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:295:25: ( '\\u0080' .. '\\uFFFF' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:295:27: '\\u0080' .. '\\uFFFF'
            {
            matchRange('\u0080','\uFFFF'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NONASCII"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:297:25: ( '\\\\' HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )? )? )? ( '\\r' | '\\n' | '\\t' | '\\f' | ' ' )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:297:27: '\\\\' HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )? )? )? ( '\\r' | '\\n' | '\\t' | '\\f' | ' ' )*
            {
            match('\\'); 
            mHEXCHAR(); 
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:298:1: ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )? )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:298:2: HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )? )?
                    {
                    mHEXCHAR(); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:299:5: ( HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:299:6: HEXCHAR ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )?
                            {
                            mHEXCHAR(); 
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:300:9: ( HEXCHAR ( HEXCHAR ( HEXCHAR )? )? )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:300:10: HEXCHAR ( HEXCHAR ( HEXCHAR )? )?
                                    {
                                    mHEXCHAR(); 
                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:301:13: ( HEXCHAR ( HEXCHAR )? )?
                                    int alt2=2;
                                    int LA2_0 = input.LA(1);

                                    if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                                        alt2=1;
                                    }
                                    switch (alt2) {
                                        case 1 :
                                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:301:14: HEXCHAR ( HEXCHAR )?
                                            {
                                            mHEXCHAR(); 
                                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:301:22: ( HEXCHAR )?
                                            int alt1=2;
                                            int LA1_0 = input.LA(1);

                                            if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                                                alt1=1;
                                            }
                                            switch (alt1) {
                                                case 1 :
                                                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:301:22: HEXCHAR
                                                    {
                                                    mHEXCHAR(); 

                                                    }
                                                    break;

                                            }


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:305:1: ( '\\r' | '\\n' | '\\t' | '\\f' | ' ' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:307:25: ( UNICODE | '\\\\' ~ ( '\\r' | '\\n' | '\\f' | HEXCHAR ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='\u0000' && LA7_1<='\t')||LA7_1=='\u000B'||(LA7_1>='\u000E' && LA7_1<='/')||(LA7_1>=':' && LA7_1<='@')||(LA7_1>='G' && LA7_1<='`')||(LA7_1>='g' && LA7_1<='\uFFFF')) ) {
                    alt7=2;
                }
                else if ( ((LA7_1>='0' && LA7_1<='9')||(LA7_1>='A' && LA7_1<='F')||(LA7_1>='a' && LA7_1<='f')) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:307:27: UNICODE
                    {
                    mUNICODE(); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:307:37: '\\\\' ~ ( '\\r' | '\\n' | '\\f' | HEXCHAR )
                    {
                    match('\\'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||(input.LA(1)>='G' && input.LA(1)<='`')||(input.LA(1)>='g' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "NMSTART"
    public final void mNMSTART() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:309:25: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '-' | SHARP | NONASCII | ESCAPE )
            int alt8=7;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='_') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='a' && LA8_0<='z')) ) {
                alt8=2;
            }
            else if ( ((LA8_0>='A' && LA8_0<='Z')) ) {
                alt8=3;
            }
            else if ( (LA8_0=='-') ) {
                alt8=4;
            }
            else if ( (LA8_0=='#') ) {
                alt8=5;
            }
            else if ( ((LA8_0>='\u0080' && LA8_0<='\uFFFF')) ) {
                alt8=6;
            }
            else if ( (LA8_0=='\\') ) {
                alt8=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:309:28: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:310:3: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:311:3: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 4 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:312:3: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 5 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:313:3: SHARP
                    {
                    mSHARP(); 

                    }
                    break;
                case 6 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:314:3: NONASCII
                    {
                    mNONASCII(); 

                    }
                    break;
                case 7 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:315:3: ESCAPE
                    {
                    mESCAPE(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NMSTART"

    // $ANTLR start "NMCHAR"
    public final void mNMCHAR() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:318:25: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | NONASCII | ESCAPE )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='_') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='a' && LA9_0<='z')) ) {
                alt9=2;
            }
            else if ( ((LA9_0>='A' && LA9_0<='Z')) ) {
                alt9=3;
            }
            else if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                alt9=4;
            }
            else if ( (LA9_0=='-') ) {
                alt9=5;
            }
            else if ( ((LA9_0>='\u0080' && LA9_0<='\uFFFF')) ) {
                alt9=6;
            }
            else if ( (LA9_0=='\\') ) {
                alt9=7;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:318:27: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:319:3: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 3 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:320:3: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 4 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:321:3: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 5 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:322:3: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 6 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:323:3: NONASCII
                    {
                    mNONASCII(); 

                    }
                    break;
                case 7 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:324:3: ESCAPE
                    {
                    mESCAPE(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NMCHAR"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:328:25: ( ( NMCHAR )+ )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:328:27: ( NMCHAR )+
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:328:27: ( NMCHAR )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='-'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='\\'||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')||(LA10_0>='\u0080' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:328:27: NMCHAR
            	    {
            	    mNMCHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:20: ( '/*' ( options {greedy=false; } : ( . )* ) '*/' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:22: '/*' ( options {greedy=false; } : ( . )* ) '*/'
            {
            match("/*"); 

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:27: ( options {greedy=false; } : ( . )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:57: ( . )*
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:57: ( . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:339:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:11: ( '//' ( options {greedy=false; } : ( . )* ) '\\n' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:13: '//' ( options {greedy=false; } : ( . )* ) '\\n'
            {
            match("//"); 

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:18: ( options {greedy=false; } : ( . )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:48: ( . )*
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:48: ( . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n') ) {
                    alt12=2;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:341:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            match('\n'); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:345:7: ( '+' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:345:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:346:8: ( '-' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:346:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:347:6: ( '/' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:347:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:348:6: ( '%' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:348:8: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "SINGLE_EQ"
    public final void mSINGLE_EQ() throws RecognitionException {
        try {
            int _type = SINGLE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:349:12: ( '=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:349:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE_EQ"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:350:8: ( ':' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:350:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:351:9: ( '(' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:351:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:352:9: ( ')' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:352:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:353:8: ( ',' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:353:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:354:6: ( 'and' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:354:8: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:355:5: ( 'or' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:355:7: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:356:10: ( 'not' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:356:12: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:357:10: ( '==' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:357:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:358:10: ( '!=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:358:12: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:359:10: ( '>=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:359:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:360:10: ( '<=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:360:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:361:10: ( '>' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:361:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:362:10: ( '<' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:362:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "INCLUDES"
    public final void mINCLUDES() throws RecognitionException {
        try {
            int _type = INCLUDES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:363:17: ( '~=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:363:19: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDES"

    // $ANTLR start "DASHMATCH"
    public final void mDASHMATCH() throws RecognitionException {
        try {
            int _type = DASHMATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:364:17: ( '|=' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:364:20: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DASHMATCH"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:366:5: ( 'if' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:366:7: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:367:7: ( 'from' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:367:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:368:5: ( 'to' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:368:7: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "THROUGH"
    public final void mTHROUGH() throws RecognitionException {
        try {
            int _type = THROUGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:369:10: ( 'through' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:369:12: 'through'
            {
            match("through"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROUGH"

    // $ANTLR start "BEGIN_INTERPOLATION"
    public final void mBEGIN_INTERPOLATION() throws RecognitionException {
        try {
            int _type = BEGIN_INTERPOLATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:371:21: ( '#{' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:371:23: '#{'
            {
            match("#{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN_INTERPOLATION"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:372:17: ( '{' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:372:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:373:17: ( '}' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:373:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:374:17: ( '[' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:374:19: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:375:17: ( ']' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:375:19: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:378:17: ( ';' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:378:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:379:17: ( '.' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:379:19: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:380:11: ( '&' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:380:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:381:8: ( '*' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:381:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:382:17: ( '$' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:382:19: '$'
            {
            match('$'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "SHARP"
    public final void mSHARP() throws RecognitionException {
        try {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:383:16: ( '#' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:383:18: '#'
            {
            match('#'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SHARP"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:386:1: ( '\\'' (~ ( '\\n' | '\\r' | '\\f' | '\\'' ) )* '\\'' | '\"' (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )* '\"' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\'') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\"') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:386:3: '\\'' (~ ( '\\n' | '\\r' | '\\f' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:386:8: (~ ( '\\n' | '\\r' | '\\f' | '\\'' ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='\u0000' && LA13_0<='\t')||LA13_0=='\u000B'||(LA13_0>='\u000E' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:386:10: ~ ( '\\n' | '\\r' | '\\f' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:387:3: '\"' (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:387:7: (~ ( '\\n' | '\\r' | '\\f' | '\"' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||LA14_0=='\u000B'||(LA14_0>='\u000E' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:387:9: ~ ( '\\n' | '\\r' | '\\f' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:391:17: ( SHARP NAME )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:391:19: SHARP NAME
            {
            mSHARP(); 
            mNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:16: ( ( INTERPOLATION | NMSTART ) ( NMCHAR | INTERPOLATION )* )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:19: ( INTERPOLATION | NMSTART ) ( NMCHAR | INTERPOLATION )*
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:19: ( INTERPOLATION | NMSTART )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='#') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='{') ) {
                    alt16=1;
                }
                else {
                    alt16=2;}
            }
            else if ( (LA16_0=='-'||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='\\'||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')||(LA16_0>='\u0080' && LA16_0<='\uFFFF')) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:20: INTERPOLATION
                    {
                    mINTERPOLATION(); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:34: NMSTART
                    {
                    mNMSTART(); 

                    }
                    break;

            }

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:43: ( NMCHAR | INTERPOLATION )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='-'||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='\\'||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')||(LA17_0>='\u0080' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }
                else if ( (LA17_0=='#') ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:44: NMCHAR
            	    {
            	    mNMCHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:393:51: INTERPOLATION
            	    {
            	    mINTERPOLATION(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:396:1: ( DOT IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:396:3: DOT IDENT
            {
            mDOT(); 
            mIDENT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "PSEUDO"
    public final void mPSEUDO() throws RecognitionException {
        try {
            int _type = PSEUDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:401:1: ( COLON IDENT ( LPAREN ( IDENT )? RPAREN )? )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:401:4: COLON IDENT ( LPAREN ( IDENT )? RPAREN )?
            {
            mCOLON(); 
            mIDENT(); 
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:403:1: ( LPAREN ( IDENT )? RPAREN )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='(') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:404:5: LPAREN ( IDENT )? RPAREN
                    {
                    mLPAREN(); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:404:12: ( IDENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='#'||LA18_0=='-'||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='\\'||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||(LA18_0>='\u0080' && LA18_0<='\uFFFF')) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:404:12: IDENT
                            {
                            mIDENT(); 

                            }
                            break;

                    }

                    mRPAREN(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PSEUDO"

    // $ANTLR start "ATTRIB"
    public final void mATTRIB() throws RecognitionException {
        try {
            int _type = ATTRIB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:409:1: ( LBRACKET IDENT ( ( SINGLE_EQ | INCLUDES | DASHMATCH ) ( IDENT | STRING ) )? RBRACKET )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:410:1: LBRACKET IDENT ( ( SINGLE_EQ | INCLUDES | DASHMATCH ) ( IDENT | STRING ) )? RBRACKET
            {
            mLBRACKET(); 
            mIDENT(); 
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:412:1: ( ( SINGLE_EQ | INCLUDES | DASHMATCH ) ( IDENT | STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='='||LA22_0=='|'||LA22_0=='~') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:413:5: ( SINGLE_EQ | INCLUDES | DASHMATCH ) ( IDENT | STRING )
                    {
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:413:5: ( SINGLE_EQ | INCLUDES | DASHMATCH )
                    int alt20=3;
                    switch ( input.LA(1) ) {
                    case '=':
                        {
                        alt20=1;
                        }
                        break;
                    case '~':
                        {
                        alt20=2;
                        }
                        break;
                    case '|':
                        {
                        alt20=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:414:9: SINGLE_EQ
                            {
                            mSINGLE_EQ(); 

                            }
                            break;
                        case 2 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:415:7: INCLUDES
                            {
                            mINCLUDES(); 

                            }
                            break;
                        case 3 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:416:3: DASHMATCH
                            {
                            mDASHMATCH(); 

                            }
                            break;

                    }

                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:418:1: ( IDENT | STRING )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='#'||LA21_0=='-'||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='\\'||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')||(LA21_0>='\u0080' && LA21_0<='\uFFFF')) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0=='\"'||LA21_0=='\'') ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:419:5: IDENT
                            {
                            mIDENT(); 

                            }
                            break;
                        case 2 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:420:3: STRING
                            {
                            mSTRING(); 

                            }
                            break;

                    }


                    }
                    break;

            }

            mRBRACKET(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTRIB"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:427:1: ( DOLLAR NAME )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:427:3: DOLLAR NAME
            {
            mDOLLAR(); 
            mNAME(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "MIXIN_DIR"
    public final void mMIXIN_DIR() throws RecognitionException {
        try {
            int _type = MIXIN_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:431:16: ( '@mixin' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:431:18: '@mixin'
            {
            match("@mixin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIXIN_DIR"

    // $ANTLR start "INCLUDE_DIR"
    public final void mINCLUDE_DIR() throws RecognitionException {
        try {
            int _type = INCLUDE_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:432:17: ( '@include' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:432:19: '@include'
            {
            match("@include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE_DIR"

    // $ANTLR start "DEBUG_DIR"
    public final void mDEBUG_DIR() throws RecognitionException {
        try {
            int _type = DEBUG_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:433:11: ( '@debug' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:433:13: '@debug'
            {
            match("@debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEBUG_DIR"

    // $ANTLR start "WARN_DIR"
    public final void mWARN_DIR() throws RecognitionException {
        try {
            int _type = WARN_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:434:10: ( '@warn' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:434:12: '@warn'
            {
            match("@warn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WARN_DIR"

    // $ANTLR start "FOR_DIR"
    public final void mFOR_DIR() throws RecognitionException {
        try {
            int _type = FOR_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:435:10: ( '@for' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:435:12: '@for'
            {
            match("@for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR_DIR"

    // $ANTLR start "WHILE_DIR"
    public final void mWHILE_DIR() throws RecognitionException {
        try {
            int _type = WHILE_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:436:11: ( '@while' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:436:13: '@while'
            {
            match("@while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE_DIR"

    // $ANTLR start "IF_DIR"
    public final void mIF_DIR() throws RecognitionException {
        try {
            int _type = IF_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:437:9: ( '@if' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:437:11: '@if'
            {
            match("@if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF_DIR"

    // $ANTLR start "ELSE_DIR"
    public final void mELSE_DIR() throws RecognitionException {
        try {
            int _type = ELSE_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:438:10: ( '@else' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:438:12: '@else'
            {
            match("@else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE_DIR"

    // $ANTLR start "EXTEND_DIR"
    public final void mEXTEND_DIR() throws RecognitionException {
        try {
            int _type = EXTEND_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:439:17: ( '@extend' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:439:19: '@extend'
            {
            match("@extend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTEND_DIR"

    // $ANTLR start "IMPORT_DIR"
    public final void mIMPORT_DIR() throws RecognitionException {
        try {
            int _type = IMPORT_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:440:17: ( '@import' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:440:19: '@import'
            {
            match("@import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT_DIR"

    // $ANTLR start "MEDIA_DIR"
    public final void mMEDIA_DIR() throws RecognitionException {
        try {
            int _type = MEDIA_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:441:17: ( '@media' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:441:19: '@media'
            {
            match("@media"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MEDIA_DIR"

    // $ANTLR start "PAGE_DIR"
    public final void mPAGE_DIR() throws RecognitionException {
        try {
            int _type = PAGE_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:442:17: ( '@page' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:442:19: '@page'
            {
            match("@page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAGE_DIR"

    // $ANTLR start "CHARSET_DIR"
    public final void mCHARSET_DIR() throws RecognitionException {
        try {
            int _type = CHARSET_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:443:17: ( '@charset' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:443:19: '@charset'
            {
            match("@charset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARSET_DIR"

    // $ANTLR start "UNKNOWN_DIR"
    public final void mUNKNOWN_DIR() throws RecognitionException {
        try {
            int _type = UNKNOWN_DIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:444:13: ( '@' IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:444:15: '@' IDENT
            {
            match('@'); 
            mIDENT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNKNOWN_DIR"

    // $ANTLR start "IMPORTANT"
    public final void mIMPORTANT() throws RecognitionException {
        try {
            int _type = IMPORTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:447:14: ( '!' ( 'i' | 'I' ) ( 'm' | 'M' ) ( 'p' | 'P' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 'n' | 'N' ) ( 't' | 'T' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:447:16: '!' ( 'i' | 'I' ) ( 'm' | 'M' ) ( 'p' | 'P' ) ( 'o' | 'O' ) ( 'r' | 'R' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 'n' | 'N' ) ( 't' | 'T' )
            {
            match('!'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORTANT"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:448:12: ( '!' ( 'd' | 'E' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'u' | 'U' ) ( 'l' | 'L' ) ( 't' | 'T' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:448:14: '!' ( 'd' | 'E' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'a' | 'A' ) ( 'u' | 'U' ) ( 'l' | 'L' ) ( 't' | 'T' )
            {
            match('!'); 
            if ( input.LA(1)=='E'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "LENGTH_PX"
    public final void mLENGTH_PX() throws RecognitionException {
        try {
            int _type = LENGTH_PX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:451:10: ( NUMBER ( 'p' | 'P' ) ( 'x' | 'X' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:451:12: NUMBER ( 'p' | 'P' ) ( 'x' | 'X' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_PX"

    // $ANTLR start "LENGTH_CM"
    public final void mLENGTH_CM() throws RecognitionException {
        try {
            int _type = LENGTH_CM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:452:10: ( NUMBER ( 'c' | 'C' ) ( 'm' | 'M' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:452:12: NUMBER ( 'c' | 'C' ) ( 'm' | 'M' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_CM"

    // $ANTLR start "LENGTH_MM"
    public final void mLENGTH_MM() throws RecognitionException {
        try {
            int _type = LENGTH_MM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:453:10: ( NUMBER ( 'm' | 'M' ) ( 'm' | 'M' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:453:12: NUMBER ( 'm' | 'M' ) ( 'm' | 'M' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_MM"

    // $ANTLR start "LENGTH_IN"
    public final void mLENGTH_IN() throws RecognitionException {
        try {
            int _type = LENGTH_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:454:10: ( NUMBER ( 'i' | 'I' ) ( 'n' | 'N' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:454:12: NUMBER ( 'i' | 'I' ) ( 'n' | 'N' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_IN"

    // $ANTLR start "LENGTH_PT"
    public final void mLENGTH_PT() throws RecognitionException {
        try {
            int _type = LENGTH_PT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:455:10: ( NUMBER ( 'p' | 'P' ) ( 't' | 'T' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:455:12: NUMBER ( 'p' | 'P' ) ( 't' | 'T' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_PT"

    // $ANTLR start "LENGTH_PC"
    public final void mLENGTH_PC() throws RecognitionException {
        try {
            int _type = LENGTH_PC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:456:10: ( NUMBER ( 'p' | 'P' ) ( 'c' | 'C' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:456:12: NUMBER ( 'p' | 'P' ) ( 'c' | 'C' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LENGTH_PC"

    // $ANTLR start "ANGLE_DEG"
    public final void mANGLE_DEG() throws RecognitionException {
        try {
            int _type = ANGLE_DEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:457:10: ( NUMBER ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'g' | 'G' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:457:12: NUMBER ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'g' | 'G' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGLE_DEG"

    // $ANTLR start "ANGLE_RAD"
    public final void mANGLE_RAD() throws RecognitionException {
        try {
            int _type = ANGLE_RAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:458:10: ( NUMBER ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'd' | 'D' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:458:12: NUMBER ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'd' | 'D' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGLE_RAD"

    // $ANTLR start "ANGLE_GRAD"
    public final void mANGLE_GRAD() throws RecognitionException {
        try {
            int _type = ANGLE_GRAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:459:11: ( NUMBER ( 'g' | 'G' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'd' | 'D' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:459:13: NUMBER ( 'g' | 'G' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'd' | 'D' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANGLE_GRAD"

    // $ANTLR start "TIME_MS"
    public final void mTIME_MS() throws RecognitionException {
        try {
            int _type = TIME_MS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:460:8: ( NUMBER ( 'm' | 'M' ) ( 's' | 'S' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:460:10: NUMBER ( 'm' | 'M' ) ( 's' | 'S' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME_MS"

    // $ANTLR start "TIME_S"
    public final void mTIME_S() throws RecognitionException {
        try {
            int _type = TIME_S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:461:7: ( NUMBER 's' | 'S' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='.'||(LA23_0>='0' && LA23_0<='9')) ) {
                alt23=1;
            }
            else if ( (LA23_0=='S') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:461:9: NUMBER 's'
                    {
                    mNUMBER(); 
                    match('s'); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:461:20: 'S'
                    {
                    match('S'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME_S"

    // $ANTLR start "FREQ_HZ"
    public final void mFREQ_HZ() throws RecognitionException {
        try {
            int _type = FREQ_HZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:462:8: ( NUMBER ( 'H' | 'h' ) ( 'Z' | 'z' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:462:10: NUMBER ( 'H' | 'h' ) ( 'Z' | 'z' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FREQ_HZ"

    // $ANTLR start "FREQ_KHZ"
    public final void mFREQ_KHZ() throws RecognitionException {
        try {
            int _type = FREQ_KHZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:463:9: ( NUMBER ( 'k' | 'K' ) ( 'h' | 'H' ) ( 'z' | 'Z' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:463:11: NUMBER ( 'k' | 'K' ) ( 'h' | 'H' ) ( 'z' | 'Z' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FREQ_KHZ"

    // $ANTLR start "EMS"
    public final void mEMS() throws RecognitionException {
        try {
            int _type = EMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:464:4: ( NUMBER ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:464:7: NUMBER ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMS"

    // $ANTLR start "EXS"
    public final void mEXS() throws RecognitionException {
        try {
            int _type = EXS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:465:4: ( NUMBER ( 'e' | 'E' ) ( 'x' | 'X' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:465:7: NUMBER ( 'e' | 'E' ) ( 'x' | 'X' )
            {
            mNUMBER(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXS"

    // $ANTLR start "DIMEN"
    public final void mDIMEN() throws RecognitionException {
        try {
            int _type = DIMEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:466:6: ( NUMBER IDENT )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:466:8: NUMBER IDENT
            {
            mNUMBER(); 
            mIDENT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIMEN"

    // $ANTLR start "PERCENTAGE"
    public final void mPERCENTAGE() throws RecognitionException {
        try {
            int _type = PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:467:11: ( NUMBER '%' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:467:13: NUMBER '%'
            {
            mNUMBER(); 
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTAGE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:1: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                alt28=1;
            }
            else if ( (LA28_0=='.') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:5: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
                    {
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:5: ( '0' .. '9' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:5: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:15: ( '.' ( '0' .. '9' )+ )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='.') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:16: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:20: ( '0' .. '9' )+
                            int cnt25=0;
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:470:20: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt25 >= 1 ) break loop25;
                                        EarlyExitException eee =
                                            new EarlyExitException(25, input);
                                        throw eee;
                                }
                                cnt25++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:471:3: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:471:7: ( '0' .. '9' )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:471:7: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:475:5: ( 'url(' ( IDENT | STRING ) ')' )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:476:1: 'url(' ( IDENT | STRING ) ')'
            {
            match("url("); 

            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:477:1: ( IDENT | STRING )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='#'||LA29_0=='-'||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='\\'||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')||(LA29_0>='\u0080' && LA29_0<='\uFFFF')) ) {
                alt29=1;
            }
            else if ( (LA29_0=='\"'||LA29_0=='\'') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:477:2: IDENT
                    {
                    mIDENT(); 

                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:477:8: STRING
                    {
                    mSTRING(); 

                    }
                    break;

            }

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:483:9: ( ( ' ' | '\\t' )+ )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:483:11: ( ' ' | '\\t' )+
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:483:11: ( ' ' | '\\t' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='\t'||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:9: ( ( '\\r' ( '\\n' )? | '\\n' ) )
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:11: ( '\\r' ( '\\n' )? | '\\n' )
            {
            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:11: ( '\\r' ( '\\n' )? | '\\n' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\r') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\n') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:12: '\\r' ( '\\n' )?
                    {
                    match('\r'); 
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:17: ( '\\n' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\n') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:17: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:484:25: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    public void mTokens() throws RecognitionException {
        // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:8: ( T__96 | ML_COMMENT | SL_COMMENT | PLUS | MINUS | DIV | MOD | SINGLE_EQ | COLON | LPAREN | RPAREN | COMMA | AND | OR | NOT | EQ | NEQ | GTE | LTE | GT | LT | INCLUDES | DASHMATCH | IF | FROM | TO | THROUGH | BEGIN_INTERPOLATION | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | DOT | AMPERSAND | STAR | STRING | HASH | IDENT | CLASS | PSEUDO | ATTRIB | VAR | MIXIN_DIR | INCLUDE_DIR | DEBUG_DIR | WARN_DIR | FOR_DIR | WHILE_DIR | IF_DIR | ELSE_DIR | EXTEND_DIR | IMPORT_DIR | MEDIA_DIR | PAGE_DIR | CHARSET_DIR | UNKNOWN_DIR | IMPORTANT | DEFAULT | LENGTH_PX | LENGTH_CM | LENGTH_MM | LENGTH_IN | LENGTH_PT | LENGTH_PC | ANGLE_DEG | ANGLE_RAD | ANGLE_GRAD | TIME_MS | TIME_S | FREQ_HZ | FREQ_KHZ | EMS | EXS | DIMEN | PERCENTAGE | NUMBER | URI | WS | NL )
        int alt33=80;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:10: T__96
                {
                mT__96(); 

                }
                break;
            case 2 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:16: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 3 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:27: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 4 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:38: PLUS
                {
                mPLUS(); 

                }
                break;
            case 5 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:43: MINUS
                {
                mMINUS(); 

                }
                break;
            case 6 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:49: DIV
                {
                mDIV(); 

                }
                break;
            case 7 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:53: MOD
                {
                mMOD(); 

                }
                break;
            case 8 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:57: SINGLE_EQ
                {
                mSINGLE_EQ(); 

                }
                break;
            case 9 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:67: COLON
                {
                mCOLON(); 

                }
                break;
            case 10 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:73: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 11 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:80: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 12 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:87: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 13 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:93: AND
                {
                mAND(); 

                }
                break;
            case 14 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:97: OR
                {
                mOR(); 

                }
                break;
            case 15 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:100: NOT
                {
                mNOT(); 

                }
                break;
            case 16 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:104: EQ
                {
                mEQ(); 

                }
                break;
            case 17 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:107: NEQ
                {
                mNEQ(); 

                }
                break;
            case 18 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:111: GTE
                {
                mGTE(); 

                }
                break;
            case 19 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:115: LTE
                {
                mLTE(); 

                }
                break;
            case 20 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:119: GT
                {
                mGT(); 

                }
                break;
            case 21 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:122: LT
                {
                mLT(); 

                }
                break;
            case 22 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:125: INCLUDES
                {
                mINCLUDES(); 

                }
                break;
            case 23 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:134: DASHMATCH
                {
                mDASHMATCH(); 

                }
                break;
            case 24 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:144: IF
                {
                mIF(); 

                }
                break;
            case 25 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:147: FROM
                {
                mFROM(); 

                }
                break;
            case 26 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:152: TO
                {
                mTO(); 

                }
                break;
            case 27 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:155: THROUGH
                {
                mTHROUGH(); 

                }
                break;
            case 28 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:163: BEGIN_INTERPOLATION
                {
                mBEGIN_INTERPOLATION(); 

                }
                break;
            case 29 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:183: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 30 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:190: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 31 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:197: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 32 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:206: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 33 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:215: SEMI
                {
                mSEMI(); 

                }
                break;
            case 34 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:220: DOT
                {
                mDOT(); 

                }
                break;
            case 35 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:224: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 36 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:234: STAR
                {
                mSTAR(); 

                }
                break;
            case 37 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:239: STRING
                {
                mSTRING(); 

                }
                break;
            case 38 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:246: HASH
                {
                mHASH(); 

                }
                break;
            case 39 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:251: IDENT
                {
                mIDENT(); 

                }
                break;
            case 40 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:257: CLASS
                {
                mCLASS(); 

                }
                break;
            case 41 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:263: PSEUDO
                {
                mPSEUDO(); 

                }
                break;
            case 42 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:270: ATTRIB
                {
                mATTRIB(); 

                }
                break;
            case 43 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:277: VAR
                {
                mVAR(); 

                }
                break;
            case 44 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:281: MIXIN_DIR
                {
                mMIXIN_DIR(); 

                }
                break;
            case 45 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:291: INCLUDE_DIR
                {
                mINCLUDE_DIR(); 

                }
                break;
            case 46 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:303: DEBUG_DIR
                {
                mDEBUG_DIR(); 

                }
                break;
            case 47 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:313: WARN_DIR
                {
                mWARN_DIR(); 

                }
                break;
            case 48 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:322: FOR_DIR
                {
                mFOR_DIR(); 

                }
                break;
            case 49 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:330: WHILE_DIR
                {
                mWHILE_DIR(); 

                }
                break;
            case 50 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:340: IF_DIR
                {
                mIF_DIR(); 

                }
                break;
            case 51 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:347: ELSE_DIR
                {
                mELSE_DIR(); 

                }
                break;
            case 52 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:356: EXTEND_DIR
                {
                mEXTEND_DIR(); 

                }
                break;
            case 53 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:367: IMPORT_DIR
                {
                mIMPORT_DIR(); 

                }
                break;
            case 54 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:378: MEDIA_DIR
                {
                mMEDIA_DIR(); 

                }
                break;
            case 55 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:388: PAGE_DIR
                {
                mPAGE_DIR(); 

                }
                break;
            case 56 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:397: CHARSET_DIR
                {
                mCHARSET_DIR(); 

                }
                break;
            case 57 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:409: UNKNOWN_DIR
                {
                mUNKNOWN_DIR(); 

                }
                break;
            case 58 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:421: IMPORTANT
                {
                mIMPORTANT(); 

                }
                break;
            case 59 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:431: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 60 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:439: LENGTH_PX
                {
                mLENGTH_PX(); 

                }
                break;
            case 61 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:449: LENGTH_CM
                {
                mLENGTH_CM(); 

                }
                break;
            case 62 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:459: LENGTH_MM
                {
                mLENGTH_MM(); 

                }
                break;
            case 63 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:469: LENGTH_IN
                {
                mLENGTH_IN(); 

                }
                break;
            case 64 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:479: LENGTH_PT
                {
                mLENGTH_PT(); 

                }
                break;
            case 65 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:489: LENGTH_PC
                {
                mLENGTH_PC(); 

                }
                break;
            case 66 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:499: ANGLE_DEG
                {
                mANGLE_DEG(); 

                }
                break;
            case 67 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:509: ANGLE_RAD
                {
                mANGLE_RAD(); 

                }
                break;
            case 68 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:519: ANGLE_GRAD
                {
                mANGLE_GRAD(); 

                }
                break;
            case 69 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:530: TIME_MS
                {
                mTIME_MS(); 

                }
                break;
            case 70 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:538: TIME_S
                {
                mTIME_S(); 

                }
                break;
            case 71 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:545: FREQ_HZ
                {
                mFREQ_HZ(); 

                }
                break;
            case 72 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:553: FREQ_KHZ
                {
                mFREQ_KHZ(); 

                }
                break;
            case 73 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:562: EMS
                {
                mEMS(); 

                }
                break;
            case 74 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:566: EXS
                {
                mEXS(); 

                }
                break;
            case 75 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:570: DIMEN
                {
                mDIMEN(); 

                }
                break;
            case 76 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:576: PERCENTAGE
                {
                mPERCENTAGE(); 

                }
                break;
            case 77 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:587: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 78 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:594: URI
                {
                mURI(); 

                }
                break;
            case 79 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:598: WS
                {
                mWS(); 

                }
                break;
            case 80 :
                // D:\\projets\\netbeans\\scss.editor\\src\\org\\netbeans\\modules\\languages\\scss\\antlr\\Scss.g:1:601: NL
                {
                mNL(); 

                }
                break;

        }

    }


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\1\uffff\1\40\1\52\1\uffff\1\53\1\uffff\1\55\1\56\3\uffff\3\40"+
        "\1\uffff\1\67\1\71\2\uffff\4\40\2\uffff\1\106\2\uffff\1\111\7\uffff"+
        "\1\125\2\uffff\1\40\10\uffff\1\40\1\157\1\40\7\uffff\1\161\1\40"+
        "\1\163\1\40\1\165\6\166\3\uffff\1\125\2\uffff\10\123\3\uffff\2\130"+
        "\1\uffff\20\130\1\u00a1\2\130\1\uffff\1\40\1\u00a5\1\uffff\1\u00a6"+
        "\1\uffff\1\40\1\uffff\1\40\2\uffff\2\166\3\123\1\u00b0\11\123\1"+
        "\125\2\130\1\u00bc\1\u00bd\1\u00bc\1\u00bd\2\u00be\1\u00bf\1\u00c0"+
        "\1\u00c1\1\u00bf\1\u00c0\1\u00c1\2\u00c2\2\130\1\u00c5\1\u00c6\1"+
        "\u00c5\1\u00c6\2\130\2\u00c9\1\uffff\2\130\1\u00cc\2\uffff\1\u00ce"+
        "\1\40\4\166\3\123\1\uffff\4\123\1\u00da\4\123\2\u00df\7\uffff\2"+
        "\u00e0\2\uffff\2\130\1\uffff\2\u00e3\3\uffff\1\40\3\166\5\123\1"+
        "\u00ed\1\123\1\uffff\1\u00ef\1\123\1\u00f1\1\123\2\uffff\2\u00f3"+
        "\1\uffff\1\40\3\166\1\u00f8\1\u00f9\2\123\1\u00fc\1\uffff\1\u00fd"+
        "\1\uffff\1\123\1\uffff\1\123\1\uffff\1\u0100\3\166\2\uffff\1\123"+
        "\1\u0105\2\uffff\1\u0106\1\123\1\uffff\3\166\1\u0108\2\uffff\1\u0109"+
        "\2\uffff";
    static final String DFA33_eofS =
        "\u010a\uffff";
    static final String DFA33_minS =
        "\1\11\1\162\1\52\1\uffff\1\43\1\uffff\1\75\1\43\3\uffff\1\156\1"+
        "\162\1\157\3\75\2\uffff\1\146\1\162\1\150\1\55\2\uffff\1\43\2\uffff"+
        "\1\43\6\uffff\2\43\2\uffff\1\154\10\uffff\1\144\1\43\1\164\7\uffff"+
        "\1\43\1\157\1\43\1\162\1\44\6\43\1\0\2\uffff\1\43\2\uffff\1\145"+
        "\1\146\1\145\1\141\1\157\1\154\1\141\1\150\1\uffff\1\60\1\uffff"+
        "\1\110\1\115\1\uffff\1\110\1\115\2\132\2\103\2\116\2\105\2\115\2"+
        "\122\2\115\1\43\2\101\1\uffff\1\50\1\43\1\uffff\1\43\1\uffff\1\155"+
        "\1\uffff\1\157\2\uffff\1\43\1\11\1\170\1\144\1\143\1\43\1\160\1"+
        "\142\1\162\1\151\1\162\1\163\1\164\1\147\1\141\1\43\2\132\16\43"+
        "\2\107\4\43\2\101\2\43\1\uffff\2\104\1\42\2\uffff\1\43\1\165\4\11"+
        "\2\151\1\154\1\uffff\1\157\1\165\1\156\1\154\1\43\3\145\1\162\2"+
        "\43\7\uffff\2\43\2\uffff\2\104\1\uffff\2\43\3\uffff\1\147\3\11\1"+
        "\156\1\141\1\165\1\162\1\147\1\43\1\145\1\uffff\1\43\1\156\1\43"+
        "\1\163\2\uffff\2\43\1\uffff\1\150\3\11\2\43\1\144\1\164\1\43\1\uffff"+
        "\1\43\1\uffff\1\144\1\uffff\1\145\1\uffff\1\43\3\11\2\uffff\1\145"+
        "\1\43\2\uffff\1\43\1\164\1\uffff\3\11\1\43\2\uffff\1\43\2\uffff";
    static final String DFA33_maxS =
        "\1\uffff\1\162\1\57\1\uffff\1\uffff\1\uffff\1\75\1\uffff\3\uffff"+
        "\1\156\1\162\1\157\1\151\2\75\2\uffff\1\146\1\162\1\157\1\uffff"+
        "\2\uffff\1\uffff\2\uffff\1\uffff\6\uffff\2\uffff\2\uffff\1\154\10"+
        "\uffff\1\144\1\uffff\1\164\7\uffff\1\uffff\1\157\1\uffff\1\162\1"+
        "\44\7\uffff\2\uffff\1\uffff\2\uffff\1\151\1\156\1\145\1\150\1\157"+
        "\1\170\1\141\1\150\1\uffff\1\71\1\uffff\1\150\1\163\1\uffff\1\150"+
        "\1\163\2\172\2\170\2\156\2\145\2\170\2\162\2\155\1\uffff\2\141\1"+
        "\uffff\1\50\1\uffff\1\uffff\1\uffff\1\uffff\1\155\1\uffff\1\157"+
        "\2\uffff\2\uffff\1\170\1\144\1\143\1\uffff\1\160\1\142\1\162\1\151"+
        "\1\162\1\163\1\164\1\147\1\141\1\uffff\2\172\16\uffff\2\147\4\uffff"+
        "\2\141\2\uffff\1\uffff\2\144\1\uffff\2\uffff\1\uffff\1\165\4\uffff"+
        "\2\151\1\154\1\uffff\1\157\1\165\1\156\1\154\1\uffff\3\145\1\162"+
        "\2\uffff\7\uffff\2\uffff\2\uffff\2\144\1\uffff\2\uffff\3\uffff\1"+
        "\147\3\uffff\1\156\1\141\1\165\1\162\1\147\1\uffff\1\145\1\uffff"+
        "\1\uffff\1\156\1\uffff\1\163\2\uffff\2\uffff\1\uffff\1\150\5\uffff"+
        "\1\144\1\164\1\uffff\1\uffff\1\uffff\1\uffff\1\144\1\uffff\1\145"+
        "\1\uffff\4\uffff\2\uffff\1\145\1\uffff\2\uffff\1\uffff\1\164\1\uffff"+
        "\4\uffff\2\uffff\1\uffff\2\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\4\1\uffff\1\7\2\uffff\1\12\1\13\1\14\6\uffff\1\26\1"+
        "\27\4\uffff\1\35\1\36\1\uffff\1\40\1\41\1\uffff\1\43\1\44\1\45\2"+
        "\47\1\53\2\uffff\1\117\1\120\1\uffff\1\2\1\3\1\6\1\5\1\20\1\10\1"+
        "\11\1\51\3\uffff\1\21\1\72\1\73\1\22\1\24\1\23\1\25\14\uffff\1\37"+
        "\1\52\1\uffff\1\42\1\50\10\uffff\1\71\1\uffff\1\115\2\uffff\1\113"+
        "\23\uffff\1\114\2\uffff\1\16\1\uffff\1\30\1\uffff\1\32\1\uffff\1"+
        "\34\1\46\52\uffff\1\106\3\uffff\1\15\1\17\11\uffff\1\62\13\uffff"+
        "\1\76\1\105\1\107\1\74\1\100\1\101\1\77\2\uffff\1\112\1\111\2\uffff"+
        "\1\75\2\uffff\1\1\1\116\1\31\13\uffff\1\60\4\uffff\1\110\1\102\2"+
        "\uffff\1\103\11\uffff\1\57\1\uffff\1\63\1\uffff\1\67\1\uffff\1\104"+
        "\4\uffff\1\54\1\66\2\uffff\1\56\1\61\2\uffff\1\33\4\uffff\1\65\1"+
        "\64\1\uffff\1\55\1\70";
    static final String DFA33_specialS =
        "\105\uffff\1\0\u00c4\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\45\1\46\2\uffff\1\46\22\uffff\1\45\1\16\1\37\1\26\1\42\1"+
            "\5\1\35\1\37\1\10\1\11\1\36\1\3\1\12\1\4\1\34\1\2\12\44\1\7"+
            "\1\33\1\20\1\6\1\17\1\uffff\1\43\22\40\1\41\7\40\1\31\1\40\1"+
            "\32\1\uffff\1\40\1\uffff\1\13\4\40\1\24\2\40\1\23\4\40\1\15"+
            "\1\14\4\40\1\25\1\1\5\40\1\27\1\22\1\30\1\21\1\uffff\uff80\40",
            "\1\47",
            "\1\50\4\uffff\1\51",
            "",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "",
            "\1\54",
            "\1\57\11\uffff\1\57\23\uffff\32\57\1\uffff\1\57\2\uffff\1"+
            "\57\1\uffff\32\57\5\uffff\uff80\57",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63\7\uffff\1\65\3\uffff\1\64\32\uffff\1\65\4\uffff\1\64",
            "\1\66",
            "\1\70",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\75\6\uffff\1\74",
            "\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff\1\105\2\uffff"+
            "\1\77\1\uffff\32\100\1\76\4\uffff\uff80\104",
            "",
            "",
            "\1\107\11\uffff\1\107\23\uffff\32\107\1\uffff\1\107\2\uffff"+
            "\1\107\1\uffff\32\107\5\uffff\uff80\107",
            "",
            "",
            "\1\112\11\uffff\1\112\2\uffff\12\110\7\uffff\32\112\1\uffff"+
            "\1\112\2\uffff\1\112\1\uffff\32\112\5\uffff\uff80\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\123\11\uffff\1\123\23\uffff\32\123\1\uffff\1\123\2\uffff"+
            "\1\123\1\uffff\2\123\1\122\1\115\1\120\1\117\2\123\1\114\3\123"+
            "\1\113\2\123\1\121\6\123\1\116\3\123\5\uffff\uff80\123",
            "\1\130\1\uffff\1\154\7\uffff\1\130\1\124\1\uffff\12\44\7\uffff"+
            "\2\130\1\150\1\142\1\144\1\130\1\146\1\134\1\140\1\130\1\131"+
            "\1\130\1\132\2\130\1\136\1\130\1\152\10\130\1\uffff\1\130\2"+
            "\uffff\1\130\1\uffff\2\130\1\147\1\141\1\143\1\130\1\145\1\133"+
            "\1\137\1\130\1\126\1\130\1\127\2\130\1\135\1\130\1\153\1\151"+
            "\7\130\5\uffff\uff80\130",
            "",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "\1\162",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "\1\164",
            "\1\40",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\12\167\1\uffff\1\167\2\uffff\42\167\12\170\7\167\6\170\32"+
            "\167\6\170\uff99\167",
            "",
            "",
            "\1\130\1\uffff\1\154\7\uffff\1\130\2\uffff\12\110\7\uffff"+
            "\2\130\1\150\1\142\1\144\1\130\1\146\1\134\1\140\1\130\1\131"+
            "\1\130\1\132\2\130\1\136\1\130\1\152\10\130\1\uffff\1\130\2"+
            "\uffff\1\130\1\uffff\2\130\1\147\1\141\1\143\1\130\1\145\1\133"+
            "\1\137\1\130\1\126\1\130\1\127\2\130\1\135\1\130\1\153\1\151"+
            "\7\130\5\uffff\uff80\130",
            "",
            "",
            "\1\172\3\uffff\1\171",
            "\1\174\6\uffff\1\175\1\173",
            "\1\176",
            "\1\177\6\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082\13\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\u0086",
            "",
            "\1\u0088\37\uffff\1\u0087",
            "\1\u008b\5\uffff\1\u008c\31\uffff\1\u0089\5\uffff\1\u008a",
            "",
            "\1\u0088\37\uffff\1\u0087",
            "\1\u008b\5\uffff\1\u008c\31\uffff\1\u0089\5\uffff\1\u008a",
            "\1\u008e\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008d",
            "\1\u0094\20\uffff\1\u0093\3\uffff\1\u0092\12\uffff\1\u0091"+
            "\20\uffff\1\u0090\3\uffff\1\u008f",
            "\1\u0094\20\uffff\1\u0093\3\uffff\1\u0092\12\uffff\1\u0091"+
            "\20\uffff\1\u0090\3\uffff\1\u008f",
            "\1\u0096\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0095",
            "\1\u0098\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0097",
            "\1\u009c\12\uffff\1\u009b\24\uffff\1\u009a\12\uffff\1\u0099",
            "\1\u009c\12\uffff\1\u009b\24\uffff\1\u009a\12\uffff\1\u0099",
            "\1\u009e\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009d",
            "\1\u00a0\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u009f",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\u00a3\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a2",
            "",
            "\1\u00a4",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "",
            "\1\40\11\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00ac\7\uffff\6\u00ab\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00a9\24\100\5\uffff\uff80\104",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\130\1\uffff\1\154\7\uffff\1\130\2\uffff\12\u0086\7\uffff"+
            "\2\130\1\150\1\142\1\144\1\130\1\146\1\134\1\140\1\130\1\131"+
            "\1\130\1\132\2\130\1\136\1\130\1\152\10\130\1\uffff\1\130\2"+
            "\uffff\1\130\1\uffff\2\130\1\147\1\141\1\143\1\130\1\145\1\133"+
            "\1\137\1\130\1\126\1\130\1\127\2\130\1\135\1\130\1\153\1\151"+
            "\7\130\5\uffff\uff80\130",
            "\1\u00bb\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00ba",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\u00c4\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c3",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\u00c8\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c7",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "",
            "\1\u00cb\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00ca",
            "\2\u00cd\3\uffff\1\u00cd\5\uffff\1\u00cd\23\uffff\32\u00cd"+
            "\1\uffff\1\u00cd\2\uffff\1\u00cd\1\uffff\32\u00cd\5\uffff\uff80"+
            "\u00cd",
            "",
            "",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "\1\u00cf",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00d2\7\uffff\6\u00d1\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00d0\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff\1\105\2\uffff"+
            "\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00d2\7\uffff\6\u00d1\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00d0\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00d2\7\uffff\6\u00d1\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00d0\24\100\5\uffff\uff80\104",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "",
            "",
            "\1\u00e2\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e1",
            "",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "",
            "",
            "",
            "\1\u00e4",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00e7\7\uffff\6\u00e6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00e5\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00e7\7\uffff\6\u00e6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00e5\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00e7\7\uffff\6\u00e6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00e5\24\100\5\uffff\uff80\104",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00ee",
            "",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00f0",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00f2",
            "",
            "",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "\1\130\11\uffff\1\130\2\uffff\12\130\7\uffff\32\130\1\uffff"+
            "\1\130\2\uffff\1\130\1\uffff\32\130\5\uffff\uff80\130",
            "",
            "\1\u00f4",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00f7\7\uffff\6\u00f6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00f5\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00f7\7\uffff\6\u00f6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00f5\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u00f7\7\uffff\6\u00f6\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u00f5\24\100\5\uffff\uff80\104",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u00fa",
            "\1\u00fb",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "",
            "\1\40\11\uffff\1\40\2\uffff\12\40\7\uffff\32\40\1\uffff\1"+
            "\40\2\uffff\1\40\1\uffff\32\40\5\uffff\uff80\40",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u0103\7\uffff\6\u0102\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u0101\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u0103\7\uffff\6\u0102\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u0101\24\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\u0103\7\uffff\6\u0102\24\101\1\uffff"+
            "\1\105\2\uffff\1\77\1\uffff\6\u0101\24\100\5\uffff\uff80\104",
            "",
            "",
            "\1\u0104",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "",
            "",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "\1\u0107",
            "",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff\1\105\2\uffff"+
            "\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff\1\105\2\uffff"+
            "\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\2\u00aa\1\uffff\2\u00aa\22\uffff\1\u00aa\2\uffff\1\40\11"+
            "\uffff\1\103\2\uffff\12\102\7\uffff\32\101\1\uffff\1\105\2\uffff"+
            "\1\77\1\uffff\32\100\5\uffff\uff80\104",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "",
            "",
            "\1\123\11\uffff\1\123\2\uffff\12\123\7\uffff\32\123\1\uffff"+
            "\1\123\2\uffff\1\123\1\uffff\32\123\5\uffff\uff80\123",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__96 | ML_COMMENT | SL_COMMENT | PLUS | MINUS | DIV | MOD | SINGLE_EQ | COLON | LPAREN | RPAREN | COMMA | AND | OR | NOT | EQ | NEQ | GTE | LTE | GT | LT | INCLUDES | DASHMATCH | IF | FROM | TO | THROUGH | BEGIN_INTERPOLATION | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | DOT | AMPERSAND | STAR | STRING | HASH | IDENT | CLASS | PSEUDO | ATTRIB | VAR | MIXIN_DIR | INCLUDE_DIR | DEBUG_DIR | WARN_DIR | FOR_DIR | WHILE_DIR | IF_DIR | ELSE_DIR | EXTEND_DIR | IMPORT_DIR | MEDIA_DIR | PAGE_DIR | CHARSET_DIR | UNKNOWN_DIR | IMPORTANT | DEFAULT | LENGTH_PX | LENGTH_CM | LENGTH_MM | LENGTH_IN | LENGTH_PT | LENGTH_PC | ANGLE_DEG | ANGLE_RAD | ANGLE_GRAD | TIME_MS | TIME_S | FREQ_HZ | FREQ_KHZ | EMS | EXS | DIMEN | PERCENTAGE | NUMBER | URI | WS | NL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_69 = input.LA(1);

                        s = -1;
                        if ( ((LA33_69>='\u0000' && LA33_69<='\t')||LA33_69=='\u000B'||(LA33_69>='\u000E' && LA33_69<='/')||(LA33_69>=':' && LA33_69<='@')||(LA33_69>='G' && LA33_69<='`')||(LA33_69>='g' && LA33_69<='\uFFFF')) ) {s = 119;}

                        else if ( ((LA33_69>='0' && LA33_69<='9')||(LA33_69>='A' && LA33_69<='F')||(LA33_69>='a' && LA33_69<='f')) ) {s = 120;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}