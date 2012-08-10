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
 * Contributor(s): jeremy.marsault@gmail.com
 * 
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */
package org.netbeans.modules.languages.scss.completion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.api.Indent;
import org.netbeans.modules.languages.scss.antlr.ScssLexer;
import org.netbeans.modules.languages.scss.lexer.ScssTokenId;
import org.netbeans.modules.languages.scss.parser.NBScssParser.ScssEditorParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.scss.lib.api.Node;
import org.netbeans.modules.scss.lib.api.NodeUtil;

/**
 *
 * @author marek.fukala@sun.com
 */
public class ScssBracketCompleter implements KeystrokeHandler {

    private static final char[][] PAIRS = new char[][]{{'{', '}'}, {'"', '"'}, {'\'', '\''}}; //NOI18N
    private char justAddedPair;
    private int justAddedPairOffset = -1;

    private int pairIndex(char ch) {
        for (int i = 0; i < PAIRS.length; i++) {
            char pair = PAIRS[i][0];
            if (pair == ch) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean beforeCharInserted(Document doc, int dot, JTextComponent target, char ch) throws BadLocationException {
        Caret caret = target.getCaret();

        if (justAddedPair == ch && justAddedPairOffset == dot) {
            //skip
            justAddedPair = 0;
            justAddedPairOffset = -1;
            caret.setDot(dot + 1);
            return true;
        }

        justAddedPair = 0;
        justAddedPairOffset = -1;

        if (ch == '}') {
            //handle curly bracket skipping
            //if there is a matching opening bracket and there is no opened unpaired bracket before
            //then just skip the typed char
            TokenSequence<ScssTokenId> ts = getCssTokenSequence(doc, dot);
            if (ts != null) {
                ts.move(dot);
                if (ts.moveNext()) {
                    //ts is already positioned
                    if (ts.token().id().ordinal() == ScssLexer.RBRACE) {
                        //skip it
                        caret.setDot(dot + 1);
                        return true;
                    }
                }
            }
        }

        //test if we care about the typed character
        int pairIdx = pairIndex(ch);
        if (pairIdx == -1) {
            return false;
        }

        if (target.getSelectionStart() != dot) {
            /**
             * @todo implement the adding quotes around selected text
             */
            return false;
        }


        if (ch == '\'' || ch == '"') {
            //handle quotations

            TokenSequence<ScssTokenId> ts = getCssTokenSequence(doc, dot);
            if (ts != null) {
                int diff = ts.move(dot);
                if (ts.moveNext()) {
                    Token t = ts.token();
                    if (t.id().ordinal() == ScssLexer.STRING) {
                        //we are in or at a string
                        char front = t.text().charAt(diff);
                        if (front == ch) {
                            //do not insert, just move caret
                            caret.setDot(dot + 1);
                            return true;
                        } else {
                            //do nothing
                            return false;
                        }
                    }
                }

                //issue 189711 workaround - if the css code is embedde in html attribute value
                //and user types " at the end of the value additional quotation is incorrectly
                //added: <div id="myid| + " => <div id="myid""
                //
                //we need to check if the actuall css code is embedded in an attribute
                //value w/o depending on the html module. An SPI in web.common could do it as well
                LanguagePath langPath = ts.languagePath();
                LanguagePath parentPath = langPath.parent();
                if (parentPath != null) {
                    //we are embedded
                    Language top = parentPath.topLanguage();
                    if ("text/html".equals(top.mimeType())) {
                        //in html
                        TokenHierarchy<Document> hi = TokenHierarchy.get(doc);
                        List<TokenSequence<?>> embedded = hi.embeddedTokenSequences(dot, true);
                        if (embedded.size() > 1) {
                            TokenSequence<?> htmlts = embedded.get(embedded.size() - 2);
                            if (htmlts.languagePath().equals(parentPath)) {
                                //it relly looks like our parent ts
                                htmlts.move(dot);
                                if (htmlts.moveNext() || htmlts.movePrevious()) {
                                    TokenId id = htmlts.token().id();
                                    //XXX !!!! DEPENDENCY to HtmlTokenId !!!!
                                    if (id.name().equals("VALUE_CSS")) { //NOI18N
                                        //we are in a css value, do not complete the quote
                                        return false;
                                    }
                                }
                            }
                        }


                    }
                }


                //cover "text| and user types "
                //in such case just the quotation should be added

                //go back until we find " or ; { or } and test of the 
                //found quotation is a part of a string or not
                ts.move(dot);
                while (ts.movePrevious()) {
                    Token t = ts.token();
                    if (t.text().charAt(0) == ch) {
                        if (t.id().ordinal() == ScssLexer.STRING) {
                            //no unmatched quotation mark
                            break;
                        } else {
                            //found unmatched quotation mark - do nothing
                            return false;
                        }
                    }
                    if (t.id().ordinal() == ScssLexer.LBRACE || t.id().ordinal() == ScssLexer.RBRACE || t.id().ordinal() == ScssLexer.SEMI) {
                        //break the loop, not quotation found - we can complete
                        break;
                    }
                }
            }
        }

        justAddedPair = PAIRS[pairIdx][1];
        justAddedPairOffset = dot + 1;

        doc.insertString(dot, String.valueOf(PAIRS[pairIdx][0]), null);
        doc.insertString(dot + 1, String.valueOf(justAddedPair), null);
        caret.setDot(dot + 1);
        return true;

    }

    @Override
    public boolean afterCharInserted(Document doc, final int caretOffset, JTextComponent target, char ch) throws BadLocationException {
        if ('}' != ch) {
            return false;
        }
        final int lineStart = Utilities.getRowFirstNonWhite((BaseDocument) doc, caretOffset);
        if (lineStart != caretOffset) {
            return false;
        }

        reindentLater((BaseDocument) doc, caretOffset, caretOffset);

        return false;
    }

    @Override
    public boolean charBackspaced(Document doc, int dot, JTextComponent target, char ch) throws BadLocationException {
        if (justAddedPairOffset - 1 == dot) {
            //removed the paired char, remove the pair as well
            doc.remove(dot, 1);
        }

        justAddedPair = 0;
        justAddedPairOffset = -1;

        return false;

    }

    @Override
    public int beforeBreak(final Document doc, final int dot, final JTextComponent jtc) throws BadLocationException {
        if (dot == 0 || dot == doc.getLength()) { //check corners
            return -1;
        }
        String context = doc.getText(dot - 1, 2); //get char before and after

        if ("{}".equals(context)) { //NOI18N
            BaseDocument bdoc = (BaseDocument) doc;

            //smart indent
            doc.insertString(dot, "\n", null); //NOI18N
            //move caret
            jtc.getCaret().setDot(dot);
            //and indent the line
            reindentLater(bdoc, dot - 1, dot + 2);

        }

        return -1;

    }

    @Override
    public OffsetRange findMatching(Document doc, int caretOffset) {
        //XXX returning null or the default should cause GSF to use the IDE default matcher
        return OffsetRange.NONE;
    }

    @Override
    public List<OffsetRange> findLogicalRanges(ParserResult info, int caretOffset) {
        ArrayList<OffsetRange> ranges = new ArrayList<OffsetRange>(2);

        Node root = ((ScssEditorParserResult) info).getParseTree();
        Snapshot snapshot = info.getSnapshot();

        if (root != null) {
            //find leaf at the position
            Node node = NodeUtil.findNodeAtOffset(root, snapshot.getEmbeddedOffset(caretOffset));
            if (node != null) {
                //go through the tree and add all parents with, eliminate duplicate nodes
                do {
                    //filter some unwanted node types
                    switch (node.type()) {
                        case declarations:
                        case token:
                            continue;
                    }

                    //use trimmed node range so nodes containing whitespaces at the start
                    //or at the end of their range can be considered as duplicate nodes
                    //of their children.
                    int[] trimmedNodeRange = NodeUtil.getTrimmedNodeRange(node);

                    int from = snapshot.getOriginalOffset(trimmedNodeRange[0]);
                    int to = snapshot.getOriginalOffset(trimmedNodeRange[1]);

                    if (from == -1 || to == -1) {
                        continue;
                    }

                    OffsetRange last = ranges.isEmpty() ? null : ranges.get(ranges.size() - 1);
                    //skip duplicated ranges
                    if (last == null || ((last.getEnd() - last.getStart()) < (to - from))) {
                        ranges.add(new OffsetRange(from, to));
                    }
                } while ((node = node.parent()) != null);
            }
        }


        return ranges;
    }

    @Override
    public int getNextWordOffset(Document doc, int caretOffset, boolean reverse) {
        return -1;
    }
    public static boolean unitTestingSupport = false;

    //since the code runs under document atomic lock, we cannot lock the
    //indentation infrastructure directly. Instead of that create a new
    //AWT task and post it for later execution.
    private void reindentLater(final BaseDocument doc, int start, int end) throws BadLocationException {
        final Position from = doc.createPosition(Utilities.getRowStart(doc, start));
        final Position to = doc.createPosition(Utilities.getRowEnd(doc, end));
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                final Indent indent = Indent.get(doc);
                indent.lock();
                try {
                    doc.runAtomic(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                indent.reindent(from.getOffset(), to.getOffset());
                            } catch (BadLocationException ex) {
                                //ignore
                            }
                        }
                    });
                } finally {
                    indent.unlock();
                }
            }
        };
        if (unitTestingSupport) {
            rn.run();
        } else {
            SwingUtilities.invokeLater(rn);
        }
    }

    private static TokenSequence<ScssTokenId> getCssTokenSequence(Document doc, int offset) {
        TokenHierarchy hi = TokenHierarchy.get(doc);

        //if we are at the border of the tokensequence then,
        //try to look ahead
        TokenSequence<ScssTokenId> ts = tokenSequenceList(hi, offset, false);

        //and back
        if (ts == null) {
            ts = tokenSequenceList(hi, offset, true);
        }

        if (ts == null) {
            //token sequence neither in forward nor in backward direction, give up
            return null;
        }

        //check boundaries of the token sequence - if the skip lenghts are used the token 
        //sequence is returned even for offsets outside of the tokenSequence content

        //test beginning
        ts.moveStart();
        if (ts.moveNext()) {
            if (ts.offset() > offset) {
                return null;
            }
        }

        //test end
        ts.moveEnd();
        if (ts.movePrevious()) {
            if (ts.offset() + ts.token().length() < offset) {
                return null;
            }
        }

        //seems to be ok
        return ts;


    }

    @SuppressWarnings("unchecked")
    private static TokenSequence<ScssTokenId> tokenSequenceList(TokenHierarchy hi, int offset, boolean backwardBias) {
        List<TokenSequence> tsl = hi.embeddedTokenSequences(offset, backwardBias);
        if (tsl.size() > 0) {
            TokenSequence ts = tsl.get(tsl.size() - 1);
            if (ts.language() != ScssTokenId.language()) {
                return null;
            } else {
                return (TokenSequence<ScssTokenId>) ts;
            }
        }
        return null;
    }
}
