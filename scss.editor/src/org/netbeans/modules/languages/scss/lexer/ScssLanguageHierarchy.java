package org.netbeans.modules.languages.scss.lexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author marsaultj
 */
public final class ScssLanguageHierarchy extends LanguageHierarchy<ScssTokenId> {

    private static List<ScssTokenId> tokens = new ArrayList<ScssTokenId>();
    private static Map<Integer, ScssTokenId> idToToken = new HashMap<Integer, ScssTokenId>();

    static {
	TokenType[] tokenTypes = TokenType.values();
	for (TokenType tokenType : tokenTypes) {
	    tokens.add(new ScssTokenId(tokenType.name(), tokenType.category, tokenType.id));
	}
	for (ScssTokenId token : tokens) {
	    idToToken.put(token.ordinal(), token);
	}
    }

    protected static synchronized ScssTokenId getToken(int id) {
	return idToToken.get(id);
    }

    protected synchronized Collection<ScssTokenId> createTokenIds() {
	return tokens;
    }

    protected synchronized Lexer<ScssTokenId> createLexer(LexerRestartInfo<ScssTokenId> info) {
	return new NBScssLexer(info);
    }

    protected String mimeType() {
	return "text/x-scss";
    }
}
