package org.netbeans.modules.languages.scss.antlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.runtime.Token;
import org.netbeans.modules.languages.scss.lexer.ScssTokenId;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author marsaultj
 */
public class ScssLookAhead {

    private LexerRestartInfo<ScssTokenId> info;
    private ScssLexer lexer;
    private Token previousToken = Token.INVALID_TOKEN;
    private Token currentToken = Token.INVALID_TOKEN;
    private List<Integer> tokenTypeCache;
    private boolean beginOfLine = true;
    private static List<Integer> selectorTokens = new ArrayList<Integer>(
	    Arrays.asList(ScssLexer.IDENT, ScssLexer.AMPERSAND,
	    ScssLexer.STRING, ScssLexer.ATTRIB, ScssLexer.SINGLE_EQ,
	    ScssLexer.INCLUDES, ScssLexer.DASHMATCH, ScssLexer.PSEUDO,
	    ScssLexer.CLASS, ScssLexer.HASH, ScssLexer.STAR));
    private static List<Integer> EOLTokens = new ArrayList<Integer>(
	    Arrays.asList(ScssLexer.NL, ScssLexer.RBRACE, ScssLexer.SEMI));
    private static List<Integer> combinatorTokens = new ArrayList<Integer>(
	    Arrays.asList(ScssLexer.GT, ScssLexer.WS, ScssLexer.PLUS));

    public ScssLookAhead(LexerRestartInfo<ScssTokenId> info) {
	this.info = info;
	AntlrCharStream charStream = new AntlrCharStream(info.input(), "Scss Editor");
	lexer = new ScssLexer(charStream);
	tokenTypeCache = new ArrayList<Integer>();
    }

    public Token nextToken() {
	Token tok = this.moveNext();

	if (tokenTypeCache.isEmpty()) {
	    if (!this.findSelector(tok)) {
		this.findProperty(tok);
	    }
	}
	if (!tokenTypeCache.isEmpty()) {
	    tok.setType(tokenTypeCache.remove(0));
	}
	return tok;
    }

    private Token moveNext() {
	if (currentToken.getType() != ScssLexer.WS) {
	    if (EOLTokens.contains(currentToken.getType())) {
		beginOfLine = true;
	    } else if (currentToken != Token.INVALID_TOKEN
		    && currentToken.getType() != ScssLexer.ML_COMMENT) {
		beginOfLine = false;
	    }
	    previousToken = currentToken;
	}
	currentToken = lexer.nextToken();
	return currentToken;
    }

    private boolean findProperty(Token token) {
	boolean propertyFound = false;
	if (token.getType() == ScssLexer.IDENT) {
	    int startLength = info.input().readLength();
	    while (true) {
		//this token could be contained in a property
		if (token.getType() == ScssLexer.IDENT) {
		    tokenTypeCache.add(ScssLexer.IM_PROPERTY);
		} else {
		    break;
		}
		token = this.moveNext();
	    }
	    //Skip whitespace
	    while (token.getType() == ScssLexer.WS) {
		tokenTypeCache.add(ScssLexer.WS);
		token = this.moveNext();
	    }
	    if (token.getType() == ScssLexer.COLON) {
		tokenTypeCache.add(ScssLexer.COLON);
		propertyFound = true;

	    } else {
		// not a property, clear cache
		tokenTypeCache.clear();
	    }

	    //rollback to the first token
	    int endLength = info.input().readLength();
	    info.input().backup(endLength - startLength);

	}
	return propertyFound;
    }

    private boolean findSelector(Token token) {
	boolean selectorFound = false;
	if (beginOfLine && selectorTokens.contains(token.getType())) {
	    int startLength = info.input().readLength();
	    while (true) {
		while (selectorTokens.contains(token.getType())) {
		    //this token could be contained in a selector
		    tokenTypeCache.add(ScssLexer.IM_SELECTOR);
		    token = this.moveNext();
		}

		if (previousToken.getType() == ScssLexer.COLON
			&& combinatorTokens.contains(token.getType())) {
		    //not a selector, probably a nested property
		    tokenTypeCache.clear();
		    break;
		}
		while (combinatorTokens.contains(token.getType())) {
		    tokenTypeCache.add(token.getType());
		    token = this.moveNext();
		}
		if (token.getType() == ScssLexer.LBRACE) {
		    tokenTypeCache.add(token.getType());
		    selectorFound = true;
		    break;
		} else if (token.getType() == ScssLexer.SEMI
			|| token.getType() == ScssLexer.EOF
			|| token.getType() == ScssLexer.COLON) {
		    tokenTypeCache.clear();
		    break; // not a selector, clear cache
		} else if (!selectorTokens.contains(token.getType())) {
		    tokenTypeCache.add(token.getType()); //Maybe a comment
		    token = this.moveNext();
		}
	    }

	    //rollback to the first token
	    int endLength = info.input().readLength();
	    info.input().backup(endLength - startLength);
	}
	return selectorFound;
    }
}
