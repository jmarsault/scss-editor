package org.netbeans.modules.languages.scss.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author marsaultj
 */
public class ScssTokenId implements TokenId {

    private static final Language<ScssTokenId> language = new ScssLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public ScssTokenId(String name, String primaryCategory, int id) {
	this.name = name;
	this.primaryCategory = primaryCategory;
	this.id = id;
    }

    public String primaryCategory() {
	return primaryCategory;
    }

    public int ordinal() {
	return id;
    }

    public String name() {
	return name;
    }

    public static final Language<ScssTokenId> language() {
	return language;
    }

    public String toString() {
	return this.name;
    }
}
