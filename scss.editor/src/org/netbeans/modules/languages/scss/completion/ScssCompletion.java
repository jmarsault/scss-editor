/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 * 
 * Contributor(s):
 * 
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */
package org.netbeans.modules.languages.scss.completion;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.CodeCompletionResult;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementHandle.UrlHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.ParameterInfo;
import org.netbeans.modules.csl.spi.DefaultCompletionResult;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.languages.scss.antlr.ScssLexer;
import org.netbeans.modules.languages.scss.lexer.ScssLanguageHierarchy;
import org.netbeans.modules.languages.scss.lexer.ScssTokenId;
import org.netbeans.modules.languages.scss.parser.NBScssParser.ScssEditorParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.scss.CssModuleSupport;
import org.netbeans.modules.scss.csl.CssElement;
import org.netbeans.modules.scss.csl.CssPropertyElement;
import org.netbeans.modules.scss.csl.CssValueElement;
import org.netbeans.modules.scss.editor.HtmlTags;
import org.netbeans.modules.scss.editor.URLRetriever;
import org.netbeans.modules.scss.property.parser.PropertyModel;
import org.netbeans.modules.scss.property.parser.PropertyValue;
import org.netbeans.modules.scss.property.parser.ValueGrammarElement;
import org.netbeans.modules.scss.spi.*;
import org.netbeans.modules.scss.web.common.api.FileReferenceCompletion;
import org.netbeans.modules.scss.web.common.api.LexerUtils;
import org.openide.filesystems.FileObject;

public class ScssCompletion implements CodeCompletionHandler {

    private static final Collection<String> AT_RULES = Arrays.asList(new String[]{"@media", "@page", "@import", "@charset", "@font-face", "@mixin", "@function"}); //NOI18N
    private static final Collection<String> DOC_BLOCKS = Arrays.asList(new String[]{"@outputFile", "@debugInfo", "@lineComments", "@outputStyle"}); //NOI18N
    private static final Collection<String> DIRECTIVES = Arrays.asList(new String[]{"@include", "@extend", "@warn"}); //NOI18N
    private static final Collection<String> CONTROL_DIRECTIVES = Arrays.asList(new String[]{"@if", "@for", "@each", "@while"}); //NOI18N
    private static char firstPrefixChar;
    private static final String UNIVERSAL_SELECTOR = "*"; //NOI18N
    //unit testing support

    private boolean addSpaceBeforeItem = false;

    @Override
    public CodeCompletionResult complete(CodeCompletionContext context) {
        final List<CompletionProposal> completionProposals = new LinkedList<CompletionProposal>();

        ScssEditorParserResult info = (ScssEditorParserResult) context.getParserResult();
        Snapshot snapshot = info.getSnapshot();
        FileObject file = snapshot.getSource().getFileObject();

        int caretOffset = context.getCaretOffset();
        String prefix = context.getPrefix() != null ? context.getPrefix() : "";

        //read getPrefix() comment!
        if (firstPrefixChar != 0) {
            prefix = firstPrefixChar + prefix;
        }

        TokenHierarchy<?> th = snapshot.getTokenHierarchy();
        TokenSequence<ScssTokenId> ts = th.tokenSequence(ScssTokenId.language());

        assert ts != null;

        //handle lexical completion only
        CodeCompletionResult lexicalCompletionResult = handleLexicalBasedCompletion(file, ts, snapshot, caretOffset);
        if (lexicalCompletionResult != null) {
            return lexicalCompletionResult;
        }

        int astCaretOffset = snapshot.getEmbeddedOffset(caretOffset);


        int diff = ts.move(astCaretOffset);
        boolean tokenFound = diff == 0 ? ts.movePrevious() : ts.moveNext();

        completeKeywords(ts, context, completionProposals, tokenFound);
        completePropertyName(context, completionProposals);
        completeAtRulesAndHtmlSelectors(ts, context, completionProposals);
        completePropertyValue(snapshot, completionProposals, caretOffset, prefix);
        completeDirectives(ts, context, completionProposals);


        if (isComment(ts, context.getCaretOffset())) {
            completionProposals.addAll(Utilities.createRAWCompletionProposals(DOC_BLOCKS, ElementKind.FIELD, caretOffset - prefix.length()));
        }

        return new DefaultCompletionResult(completionProposals, false);
    }

    private List<? extends CompletionProposal> completeImport(FileObject base, int offset, String prefix, boolean addQuotes, boolean addSemicolon) {
        FileReferenceCompletion<CssCompletionItem> fileCompletion = new CssLinkCompletion(addQuotes, addSemicolon);
        return fileCompletion.getItems(base, offset - prefix.length(), prefix);
    }

    private List<CompletionProposal> completeHtmlSelectors(String prefix, int offset) {
        List<CompletionProposal> proposals = new ArrayList<CompletionProposal>(20);
        Collection<String> items = new ArrayList(Arrays.asList(HtmlTags.getTags()));
        items.add(UNIVERSAL_SELECTOR);
        for (String tagName : items) {
            if (tagName.startsWith(prefix.toLowerCase(Locale.ENGLISH))) {
                proposals.add(CssCompletionItem.createSelectorCompletionItem(new CssElement(tagName),
                        tagName,
                        offset,
                        true));
            }
        }
        return proposals;
    }

    private Collection<CompletionProposal> getUsedColorsItems(Snapshot snapshot, String prefix,
            CssElement element, String origin, int anchor, boolean addSemicolon,
            boolean addSpaceBeforeItem) {
        Collection<CompletionProposal> proposals = new HashSet<CompletionProposal>();


        FileObject current = snapshot.getSource().getFileObject();
        if (current == null) {
            return proposals;
        }

        Map<FileObject, Collection<String>> result = new HashMap<FileObject, Collection<String>>();
        List<String> colors = new ArrayList<String>();

        TokenHierarchy<?> th = snapshot.getTokenHierarchy();
        TokenSequence<ScssTokenId> ts = th.tokenSequence(ScssTokenId.language());

        List<Token> founds = findTokens(ts, ScssLanguageHierarchy.getToken(ScssLexer.HASH));

        for (Token token : founds) {
            colors.add(token.text().toString());
        }

        for (String color : Filters.filterStrings(colors, prefix)) {
            proposals.add(CssCompletionItem.createHashColorCompletionItem(element, color, origin,
                    anchor, addSemicolon, addSpaceBeforeItem, true));
        }
        result.put(current, colors);


        return proposals;
    }

    private Collection<CompletionProposal> getUsedVars(Snapshot snapshot, int anchor, String prefix) {
        Collection<CompletionProposal> proposals = new HashSet<CompletionProposal>();

        List<String> vars = new ArrayList<String>();

        TokenHierarchy<?> th = snapshot.getTokenHierarchy();
        TokenSequence<ScssTokenId> ts = th.tokenSequence(ScssTokenId.language());

        List<Token> founds = findTokens(ts, ScssLanguageHierarchy.getToken(ScssLexer.VAR));

        for (Token token : founds) {
            if (anchor - prefix.length() != token.offset(th)
                    && !vars.contains(token.text().toString())) {
                vars.add(token.text().toString());

            }
        }
        for (String value : Filters.filterStrings(vars, prefix)) {
            CssElement handle = new CssElement(value);
            CompletionProposal proposal = CssCompletionItem.createRAWCompletionItem(handle, value, ElementKind.VARIABLE, anchor - prefix.length(), true);
            proposals.add(proposal);
        }

        return proposals;
    }

    private List<Token> findTokens(TokenSequence ts, TokenId... searchedIds) {
        Collection<TokenId> searched = Arrays.asList(searchedIds);
        List<Token> founds = new ArrayList<Token>();
        ts.move(0);
        while (ts.moveNext()) {
            Token token = ts.token();
            TokenId id = token.id();
            if (searched.contains(id)) {
                founds.add(token);
            }
        }
        return founds;
    }

    private Collection<String> addSuffix(Collection<String> values, String suffix) {
        suffix = suffix.toLowerCase();
        List<String> withSuffix = new ArrayList<String>();
        for (String value : values) {
            withSuffix.add(value + suffix);
        }
        return withSuffix;
    }

    @Override
    public String document(ParserResult info, ElementHandle element) {
        HelpResolver resolver = CssModuleSupport.getHelpResolver();
        if (element instanceof CssPropertyElement) {
            CssPropertyElement e = (CssPropertyElement) element;
            Property property = e.getPropertyDescriptor();
            return resolver.getHelp(property);
        } else if (element instanceof ElementHandle.UrlHandle) {
            try {
                return URLRetriever.getURLContentAndCache(new URL(element.getName()));
            } catch (MalformedURLException e) {
                assert false;
            }
        }
        return null;
    }

    @Override
    public ElementHandle resolveLink(String link, ElementHandle elementHandle) {
        if (elementHandle instanceof CssPropertyElement) {
            CssPropertyElement e = (CssPropertyElement) elementHandle;
            Property property = e.getPropertyDescriptor();
            URL url = CssModuleSupport.getHelpResolver().resolveLink(property, link);
            if (url != null) {
                return new UrlHandle(url.toExternalForm());
            }
        }
        return null;
    }

    @Override
    public String getPrefix(ParserResult info, final int caretOffset, boolean upToOffset) {
        Snapshot snapshot = info.getSnapshot();
        TokenHierarchy hi = snapshot.getTokenHierarchy();
        String prefix = getPrefix(hi.tokenSequence(), snapshot.getEmbeddedOffset(caretOffset));

        //really ugly handling of class or id selector prefix:
        //Since the getPrefix() method is parser result based it is supposed
        //to work on top of the snapshot, while GsfCompletionProvider$Task.canFilter()
        //should be fast and hence operates on document, there arises a big contradiction -
        //For the virtually generated class and id selectors, the dot or hash chars
        //are part of the virtual source and hence becomes a part of the prefix in
        //this method call, while in the real html document they are invisible and an
        //attribute quote resides on their place.
        //So if a GsfCompletionProvider$CompletionEnvironment is created, an anchor
        //is computed from the caret offset and prefix lenght (prefix returned from
        //this method). After subsequent user's keystrokes the canFilter() method
        //gets text from this anchor to the caret from the edited document! So the
        //prefix contains the attribute quotation and any css items cannot be filtered.

        //this is a poor and hacky solution to this issue, some bug may appear for
        //non class or id elements starting with dot or hash?!?!?

        if (prefix.length() > 0 && (prefix.charAt(0) == '.' || prefix.charAt(0) == '#')) {
            firstPrefixChar = prefix.charAt(0);
            return prefix.substring(1);
        } else {
            firstPrefixChar = 0;
            return prefix;
        }

    }

    private String getPrefix(TokenSequence<ScssTokenId> ts, int caretOffset) {
        //we are out of any css
        if (ts == null) {
            return null;
        }

        int diff = ts.move(caretOffset);
        if (diff == 0) {
            if (!ts.movePrevious()) {
                //beginning of the token sequence, cannot get any prefix
                return ""; //NOI18N
            }
        } else {
            if (!ts.moveNext()) {
                return null;
            }
        }
        Token<ScssTokenId> t = ts.token();

        int skipPrefixChars = 0;

        return t.text().subSequence(skipPrefixChars, diff == 0 ? t.text().length() : diff).toString().trim();

    }

    boolean isComment(TokenSequence<ScssTokenId> ts, int caretOffset) {
        ts.move(caretOffset);
        Token comment = LexerUtils.followsToken(ts, ScssLanguageHierarchy.getToken(ScssLexer.ML_COMMENT), false, true, (TokenId) null);
        return comment != null;
    }

    boolean isPropertyName(TokenSequence<ScssTokenId> ts, int offset) {
        ts.move(offset);
        Collection<? extends TokenId> searchedId = new ArrayList<TokenId>(Arrays.asList(new TokenId[]{ScssLanguageHierarchy.getToken(ScssLexer.LBRACE), ScssLanguageHierarchy.getToken(ScssLexer.SEMI)}));
        Token propertyName = LexerUtils.followsToken(ts, searchedId, true, true, ScssLanguageHierarchy.getToken(ScssLexer.WS), ScssLanguageHierarchy.getToken(ScssLexer.NL), ScssLanguageHierarchy.getToken(ScssLexer.ML_COMMENT), ScssLanguageHierarchy.getToken(ScssLexer.UNKNOWN_DIR));

        return propertyName != null;
    }

    private boolean isProperty(TokenSequence ts, int offset) {
        ts.move(offset);
        Collection<? extends TokenId> searchedId = new ArrayList<TokenId>(Arrays.asList(new TokenId[]{ScssLanguageHierarchy.getToken(ScssLexer.IM_PROPERTY), ScssLanguageHierarchy.getToken(ScssLexer.VAR)}));
        Token propertyName = LexerUtils.followsToken(ts, searchedId, true, true, ScssLanguageHierarchy.getToken(ScssLexer.WS), ScssLanguageHierarchy.getToken(ScssLexer.IDENT), ScssLanguageHierarchy.getToken(ScssLexer.COLON), ScssLanguageHierarchy.getToken(ScssLexer.ML_COMMENT));

        return propertyName != null;
    }

    @Override
    public QueryType getAutoQuery(JTextComponent component, String typedText) {
        int offset = component.getCaretPosition();
        if (typedText == null || typedText.length() == 0) {
            return QueryType.NONE;
        }
        char c = typedText.charAt(typedText.length() - 1);

        TokenSequence<ScssTokenId> ts = LexerUtils.getJoinedTokenSequence(component.getDocument(), offset, ScssTokenId.language());
        if (ts != null) {
            int diff = ts.move(offset);
            TokenId currentTokenId = null;
            if (ts != null) {
                if (diff == 0 && ts.movePrevious() || ts.moveNext()) {
                    currentTokenId = ts.token().id();
                }
            }

            if (currentTokenId.ordinal() == ScssLexer.IDENT) {
                return QueryType.COMPLETION;
            }

            //#177306  Eager CSS CC
            //
            //open completion when a space is pressed, but only
            //if typed by user by pressing the spacebar.
            //
            //1) filters out tabs which are converted to spaces
            //   before being put into the document
            //2) filters out newline keystrokes which causes the indentation
            //   to put some spaces on the newline
            //3) filters out typing spaces in comments
            //
            if (typedText.length() == 1 && c == ' ' && currentTokenId.ordinal() != ScssLexer.ML_COMMENT) {
                return QueryType.COMPLETION;
            }
        }

        switch (c) {
            case '\n':
            case '}':
            case ';': {
                return QueryType.STOP;
            }
            case '.':
            case '#':
            case ':':
            case ',': {
                return QueryType.COMPLETION;
            }
        }
        return QueryType.NONE;
    }

    @Override
    public String resolveTemplateVariable(String variable, ParserResult info, int caretOffset, String name, Map parameters) {
        return null;
    }

    @Override
    public Set<String> getApplicableTemplates(Document doc, int selectionBegin, int selectionEnd) {
        return Collections.emptySet();
    }

    @Override
    public ParameterInfo parameters(ParserResult info, int caretOffset, CompletionProposal proposal) {
        return ParameterInfo.NONE;
    }

    private CodeCompletionResult handleLexicalBasedCompletion(FileObject file, TokenSequence<ScssTokenId> ts, Snapshot snapshot, int caretOffset) {
        //position the token sequence on the caret position, not the recomputed offset with substracted prefix length
        int tokenDiff = ts.move(snapshot.getEmbeddedOffset(caretOffset));
        if (ts.moveNext() || ts.movePrevious()) {
            boolean addSemicolon = true;
            switch (ts.token().id().ordinal()) {
                case ScssLexer.SEMI: //@import |;
                    addSemicolon = false;
                case ScssLexer.WS: //@import |
                    if (addSemicolon) {
                        Token semicolon = LexerUtils.followsToken(ts, ScssLanguageHierarchy.getToken(ScssLexer.SEMI), false, true, ScssLanguageHierarchy.getToken(ScssLexer.WS));
                        addSemicolon = (semicolon == null);
                    }
                    if (null != LexerUtils.followsToken(ts, ScssLanguageHierarchy.getToken(ScssLexer.IMPORT_DIR), true, false, ScssLanguageHierarchy.getToken(ScssLexer.WS))) {
                        List<CompletionProposal> imports = (List<CompletionProposal>) completeImport(file, caretOffset, "", true, addSemicolon);
                        int moveBack = (addSemicolon ? 1 : 0) + 1; //+1 means the added quotation mark length
                        return new CssFileCompletionResult(imports, moveBack);
                    }
                    break;
                case ScssLexer.STRING: //@import "|"; or @import "fil|";
                    Token<ScssTokenId> originalToken = ts.token();
                    addSemicolon = false;
                    if (null != LexerUtils.followsToken(ts, ScssLanguageHierarchy.getToken(ScssLexer.IMPORT_DIR), true, false, ScssLanguageHierarchy.getToken(ScssLexer.WS))) {
                        //strip off the leading quote and the rest of token after caret
                        String valuePrefix = originalToken.text().toString().substring(1, tokenDiff);
                        List<CompletionProposal> imports = (List<CompletionProposal>) completeImport(file,
                                caretOffset, valuePrefix, false, addSemicolon);
                        int moveBack = addSemicolon ? 1 : 0;
                        return new CssFileCompletionResult(imports, moveBack);

                    }
                    break;

            }
        }

        return null;
    }

    private void completeAtRulesAndHtmlSelectors(TokenSequence ts, CodeCompletionContext context, List<CompletionProposal> completionProposals) {

        String prefix = context.getPrefix();
        int offset = context.getCaretOffset();

        ts.move(offset);

        if (null == LexerUtils.followsToken(ts, ScssLanguageHierarchy.getToken(ScssLexer.COLON), true, true, ScssLanguageHierarchy.getToken(ScssLexer.WS), ScssLanguageHierarchy.getToken(ScssLexer.NL), ScssLanguageHierarchy.getToken(ScssLexer.ML_COMMENT))) {
            TokenId id = ts.token() != null ? ts.token().id() : null;
            if (id == null || (id.ordinal() != ScssLexer.UNKNOWN_DIR && id.ordinal() != ScssLexer.ML_COMMENT)) {
                List<CompletionProposal> all = new ArrayList<CompletionProposal>();

                if (!isPropertyName(ts, offset)) {
                    //complete at keywords without prefix
                    Collection<String> rules = Filters.filterStrings(AT_RULES, prefix);
                    rules = addSuffix(rules, " ");
                    all.addAll(Utilities.createRAWCompletionProposals(rules, ElementKind.FIELD, offset - prefix.length()));
                }
                if (!isProperty(ts, offset)) {
                    //complete html selector names
                    all.addAll(completeHtmlSelectors(prefix, offset - prefix.length()));
                    completionProposals.addAll(all);
                }
            }
        }
    }

    private void completeKeywords(TokenSequence<ScssTokenId> ts, CodeCompletionContext context, List<CompletionProposal> completionProposals, boolean tokenFound) {
        //complete at keywords with prefix - parse tree OK
        if (tokenFound) {
            TokenId id = ts.token().id();
            if (id.ordinal() == ScssLexer.IMPORT_DIR || id.ordinal() == ScssLexer.MEDIA_DIR || id.ordinal() == ScssLexer.PAGE_DIR || id.ordinal() == ScssLexer.CHARSET_DIR
                    || id.ordinal() == ScssLexer.UNKNOWN_DIR) {
                //we are on the right place in the node
                String prefix = context.getPrefix() != null ? context.getPrefix() : "";
                Collection<String> rules = Filters.filterStrings(AT_RULES, prefix);
                rules = addSuffix(rules, " ");
                completionProposals.addAll(Utilities.createRAWCompletionProposals(rules, ElementKind.FIELD, context.getCaretOffset() - prefix.length()));
            }
        }

    }

    private void completePropertyName(CodeCompletionContext context, List<CompletionProposal> completionProposals) {

        String prefix = "{".equals(context.getPrefix()) ? "" : context.getPrefix();
        int anchor = context.getCaretOffset();
        ScssEditorParserResult info = (ScssEditorParserResult) context.getParserResult();
        Snapshot snapshot = info.getSnapshot();
        TokenSequence<ScssTokenId> ts = snapshot.getTokenHierarchy().tokenSequence(ScssTokenId.language());
        if (isPropertyName(ts, anchor)) {
            Collection<Property> possibleProps = Filters.filterProperties(CssModuleSupport.getProperties(), prefix);
            List<CompletionProposal> properties = Utilities.wrapProperties(possibleProps, anchor - prefix.length());
            completionProposals.addAll(properties);
            Collection<String> directives = Filters.filterStrings(DIRECTIVES, prefix);
            directives = addSuffix(directives, " ");
            completionProposals.addAll(Utilities.createRAWCompletionProposals(directives, ElementKind.FIELD, context.getCaretOffset() - prefix.length()));

        }
    }

    private void completePropertyValue(
            Snapshot snapshot,
            List<CompletionProposal> completionProposals, int caretOffset, String prefix) {

        TokenSequence<ScssTokenId> ts = snapshot.getTokenHierarchy().tokenSequence(ScssTokenId.language());
        ts.move(caretOffset);
        Collection<? extends TokenId> searchedId = new ArrayList<TokenId>(Arrays.asList(new TokenId[]{ScssLanguageHierarchy.getToken(ScssLexer.IM_PROPERTY), ScssLanguageHierarchy.getToken(ScssLexer.VAR)}));
        Token propertyName = LexerUtils.followsToken(ts, searchedId, true, true, ScssLanguageHierarchy.getToken(ScssLexer.WS), ScssLanguageHierarchy.getToken(ScssLexer.IDENT), ScssLanguageHierarchy.getToken(ScssLexer.COLON), ScssLanguageHierarchy.getToken(ScssLexer.ML_COMMENT));

        if (null != propertyName) {
            PropertyModel prop = CssModuleSupport.getPropertyModel(propertyName.text().toString());
            Map<String, CompletionProposal> props = new TreeMap<String, CompletionProposal>();
            if (prop != null) {
                addPropertyValues(props, snapshot, prop, caretOffset, prefix, true);
            } else {
                for (Property property : CssModuleSupport.getProperties()) {
                    prop = CssModuleSupport.getPropertyModel(property.getName());
                    addPropertyValues(props, snapshot, prop, caretOffset, prefix, false);
                }
            }
            completionProposals.addAll(props.values());

        }

    }

    private void addPropertyValues(Map<String, CompletionProposal> completionProposals, Snapshot snapshot, PropertyModel prop, int anchor, String prefix, boolean same) {

        boolean addSemicolon = true;

        boolean extendedItemsOnly = false;

        if (prop != null) {

            PropertyValue propVal = new PropertyValue(prop, "");

            Collection<ValueGrammarElement> alts = propVal.getAlternatives();

            Collection<ValueGrammarElement> filteredByPrefix = Filters.filterElements(alts, prefix);

            Map<String, Collection<ValueGrammarElement>> value2GrammarElement =
                    new HashMap<String, Collection<ValueGrammarElement>>();
            for (ValueGrammarElement element : filteredByPrefix) {
                String elementValue = element.value();
                Collection<ValueGrammarElement> col = value2GrammarElement.get(elementValue);
                if (col == null) {
                    col = new LinkedList<ValueGrammarElement>();
                    value2GrammarElement.put(elementValue, col);
                }
                col.add(element);
            }

            boolean colorChooserAdded = false;

            Collection<CompletionProposal> usedVars = getUsedVars(snapshot, anchor, prefix);
            for (CompletionProposal completionProposal : usedVars) {
                completionProposals.put(completionProposal.getName(), completionProposal);
            }

            for (Map.Entry<String, Collection<ValueGrammarElement>> entry : value2GrammarElement.entrySet()) {

                Collection<ValueGrammarElement> elements = entry.getValue();
                ValueGrammarElement element = elements.iterator().next();

                if (element.isUnit()) {
                    CompletionProposal unitCompletionItem = CssCompletionItem.createUnitCompletionItem(element);
                    completionProposals.put(unitCompletionItem.getName(), unitCompletionItem);
                    continue;
                }

                String visibleOrigin = element.getVisibleOrigin();

                CssValueElement handle = new CssValueElement(prop.getProperty(), element);
                String vo = null;
                if (same) {
                    for (ValueGrammarElement e : elements) {
                        if (vo == null) {
                            vo = e.getVisibleOrigin();
                        } else {
                            if (!vo.equals(e.getVisibleOrigin())) {
                                same = false;
                                break;
                            }
                        }
                    }
                }

                String origin = element.origin();

                if ("@colors-list".equals(origin)) { //NOI18N
                    if (!colorChooserAdded) {
                        //add color chooser item
                        completionProposals.put("@colors-list", CssCompletionItem.createColorChooserCompletionItem(anchor - prefix.length(), visibleOrigin, addSemicolon));
                        //add used colors items
                        Collection<CompletionProposal> usedColors = getUsedColorsItems(snapshot, prefix, handle, visibleOrigin, anchor, addSemicolon, addSpaceBeforeItem);
                        for (CompletionProposal completionProposal : usedColors) {
                            completionProposals.put(completionProposal.getName(), completionProposal);
                        }

                        colorChooserAdded = true;
                    }
                    if (!extendedItemsOnly) {
                        CompletionProposal colorValue = CssCompletionItem.createColorValueCompletionItem(handle, element, anchor - prefix.length(), addSemicolon, addSpaceBeforeItem);
                        completionProposals.put(origin + colorValue.getName(), colorValue);
                    }
                } else {

                    CompletionProposal valueCompletionItem = CssCompletionItem.createValueCompletionItem(
                            handle,
                            element,
                            same ? visibleOrigin : "...",
                            anchor - prefix.length(),
                            addSemicolon,
                            addSpaceBeforeItem);
                    if (!completionProposals.containsKey(valueCompletionItem.getName())) {
                        completionProposals.put(valueCompletionItem.getName(), valueCompletionItem);
                    }

                }
            }
        }

    }

    private void completeDirectives(TokenSequence ts, CodeCompletionContext context, List<CompletionProposal> completionProposals) {
        String prefix = context.getPrefix();
        int caretOffset = context.getCaretOffset();
        if (!isProperty(ts, caretOffset)) {
            Collection<String> directives = Filters.filterStrings(CONTROL_DIRECTIVES, prefix);
            directives = addSuffix(directives, " ");
            completionProposals.addAll(Utilities.createRAWCompletionProposals(directives, ElementKind.FIELD, caretOffset - prefix.length()));
        }
    }

    private static class CssFileCompletionResult extends DefaultCompletionResult {

        private int moveCaretBack;

        public CssFileCompletionResult(List<CompletionProposal> list, int moveCaretBack) {
            super(list, false);
            this.moveCaretBack = moveCaretBack;
        }

        @Override
        public void afterInsert(CompletionProposal item) {
            Caret c = EditorRegistry.lastFocusedComponent().getCaret();
            c.setDot(c.getDot() - moveCaretBack);
        }
    }

    private static class CssLinkCompletion extends FileReferenceCompletion<CssCompletionItem> {

        private static final String GO_UP_TEXT = "../"; //NOI18N
        private boolean addQuotes;
        private boolean addSemicolon;

        public CssLinkCompletion(boolean addQuotes, boolean addSemicolon) {
            this.addQuotes = addQuotes;
            this.addSemicolon = addSemicolon;
        }

        @Override
        public CssCompletionItem createFileItem(int anchor, String name, Color color, ImageIcon icon) {
            return CssCompletionItem.createFileCompletionItem(new CssElement(name), name, anchor, color, icon, addQuotes, addSemicolon);
        }

        @Override
        public CssCompletionItem createGoUpItem(int anchor, Color color, ImageIcon icon) {
            return CssCompletionItem.createFileCompletionItem(new CssElement(GO_UP_TEXT), GO_UP_TEXT, anchor, color, icon, addQuotes, addSemicolon);
        }
    }
}
