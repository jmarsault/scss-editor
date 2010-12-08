package org.netbeans.modules.languages.scss;

import org.netbeans.modules.csl.spi.CommentHandler;

/**
 *
 * @author marsaultj
 */
public class ScssComment extends CommentHandler.DefaultCommentHandler {

    private static final String COMMENT_START_DELIMITER = "/*";
    private static final String COMMENT_END_DELIMITER = "*/";

    @Override
    public String getCommentStartDelimiter() {
	return COMMENT_START_DELIMITER;
    }

    @Override
    public String getCommentEndDelimiter() {
	return COMMENT_END_DELIMITER;
    }
}
