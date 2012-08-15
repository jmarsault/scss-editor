package org.netbeans.modules.languages.scss;

import org.netbeans.api.lexer.Language;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.languages.scss.formatter.ScssFormatter;
import org.netbeans.modules.languages.scss.lexer.ScssTokenId;
import org.netbeans.modules.csl.spi.CommentHandler;
import org.netbeans.modules.languages.scss.completion.ScssBracketCompleter;
import org.netbeans.modules.languages.scss.completion.ScssCompletion;
import org.netbeans.modules.parsing.spi.indexing.PathRecognizerRegistration;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@LanguageRegistration(mimeType = "text/x-scss", useMultiview = true)
@PathRecognizerRegistration(mimeTypes = "text/x-scss", libraryPathIds = {}, binaryLibraryPathIds = {}) //NOI18N
public class ScssLanguage extends DefaultLanguageConfig {

    @MultiViewElement.Registration(displayName="#CTL_SourceTabCaption",
        iconBase = "org/netbeans/modules/languages/scss/Scss.png",
        persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
        preferredID = "scss.source",
        mimeType = "text/x-scss",
        position = 1)
    @Messages("CTL_SourceTabCaption=&Source")
    public static MultiViewEditorElement createMultiViewEditorElement(Lookup context) {
        return new MultiViewEditorElement(context);
    }
    
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

    @Override
    public CodeCompletionHandler getCompletionHandler() {
        return new ScssCompletion();
    }
    
    @Override
    public KeystrokeHandler getKeystrokeHandler() {
        return new ScssBracketCompleter();
    }
}
