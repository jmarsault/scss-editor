/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.scss.completion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.netbeans.modules.scss.property.parser.ValueGrammarElement;
import org.netbeans.modules.scss.spi.Property;

/**
 *
 * @author marsaultj
 */
public class Filters {

    protected static Collection<String> filterStrings(Collection<String> values, String propertyNamePrefix) {
        propertyNamePrefix = propertyNamePrefix.toLowerCase();
        List<String> filtered = new ArrayList<String>();
        for (String value : values) {
            if (value.toLowerCase().startsWith(propertyNamePrefix)) {
                filtered.add(value);
            }
        }
        return filtered;
    }

    protected static Collection<ValueGrammarElement> filterElements(Collection<ValueGrammarElement> values, String propertyNamePrefix) {
        propertyNamePrefix = propertyNamePrefix.toLowerCase();
        List<ValueGrammarElement> filtered = new ArrayList<ValueGrammarElement>();
        for (ValueGrammarElement value : values) {
            if (value.toString().toLowerCase().startsWith(propertyNamePrefix)) {
                filtered.add(value);
            }
        }
        return filtered;
    }

    protected static Collection<Property> filterProperties(Collection<Property> props, String propertyNamePrefix) {
        propertyNamePrefix = propertyNamePrefix.toLowerCase();
        List<Property> filtered = new ArrayList<Property>();
        for (Property p : props) {
            if (p.getName().toLowerCase().startsWith(propertyNamePrefix)) {
                filtered.add(p);
            }
        }
        return filtered;
    }
}
