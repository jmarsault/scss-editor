package org.netbeans.modules.languages.scss.lexer;

import org.antlr.runtime.Token;
import org.netbeans.api.lexer.PartType;
import org.netbeans.modules.languages.scss.antlr.ScssLookAhead;
import org.netbeans.modules.languages.scss.antlr.ScssLexer;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author marsaultj
 */
public class NBScssLexer implements Lexer<ScssTokenId> {

    private LexerRestartInfo<ScssTokenId> info;
    private ScssLookAhead lexer;
    boolean parsed = false;

    @Override
    public Object state() {
	return null;
    }

    public NBScssLexer(LexerRestartInfo<ScssTokenId> info) {
	this.info = info;
	lexer = new ScssLookAhead(info);
    }

    @Override
    public org.netbeans.api.lexer.Token<ScssTokenId> nextToken() {

	org.netbeans.api.lexer.Token<ScssTokenId> result = null;
	ScssTokenId tokenId = ScssLanguageHierarchy.getToken(ScssLexer.WS);
	Token token = lexer.nextToken();

	if (token.getType() != ScssLexer.EOF) {
	    tokenId = ScssLanguageHierarchy.getToken(token.getType());
	    if (tokenId != null) {
		result = info.tokenFactory().createToken(tokenId);
	    } else {
		result = info.tokenFactory().createToken(ScssLanguageHierarchy.getToken(ScssLexer.WS));
	    }
	} else if (info.input().readLength() > 0) {
	    tokenId = ScssLanguageHierarchy.getToken(ScssLexer.WS);
	    result = info.tokenFactory().createToken(tokenId, info.input().readLength(),
		    PartType.MIDDLE);
	}

	return result;
    }

    @Override
    public void release() {
    }
}
