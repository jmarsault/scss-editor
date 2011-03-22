package org.netbeans.modules.languages.scss;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.languages.scss.formatter.ScssFormatter;
import org.netbeans.modules.languages.scss.lexer.ScssTokenId;
import org.netbeans.modules.csl.spi.CommentHandler;

@LanguageRegistration(mimeType = "text/x-scss")
public class ScssLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
	return ScssTokenId.language();
    }

    @Override
    public String getDisplayName() {
	return "Scss";
    }

    @Override
    public boolean hasFormatter() {
	return true;
    }

    @Override
    public Formatter getFormatter() {
	return new ScssFormatter();
    }

    @Override
    public CommentHandler getCommentHandler() {
	return new ScssComment();
    }
}
