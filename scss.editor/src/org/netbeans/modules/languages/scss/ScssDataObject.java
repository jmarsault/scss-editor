package org.netbeans.modules.languages.scss;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.nodes.CookieSet;
import org.openide.util.Lookup;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.ProxyLookup;
import org.openide.nodes.Node.Cookie;

/**
 *
 * @author marsaultj
 */
public class ScssDataObject extends MultiDataObject {

    private Lookup lookup;
    private InstanceContent ic;
    CookieSet cookies;

    public ScssDataObject(FileObject fo, MultiFileLoader loader) throws DataObjectExistsException, IOException {
	super(fo, loader);
	cookies = getCookieSet();
    }

    @Override
    protected Node createNodeDelegate() {
	final DataNode node = new DataNode(this, Children.LEAF, getLookup());
	return node;
    }

    @Override
    public final synchronized Lookup getLookup() {
	if (lookup == null) {
	    ic = new InstanceContent();
	    ic.add(this);
	    ic.add(getPrimaryFile());
	    ic.add(this, ScssEditorSupportProvider.staticFactory);
	    lookup = new ProxyLookup(getCookieSet().getLookup(), new AbstractLookup(ic));
	}
	return lookup;
    }

    final InstanceContent getInstanceContent() {
	return ic;
    }

    @Override
    public final <T extends Cookie> T getCookie(Class<T> type) {
	if (!Cookie.class.isAssignableFrom(type)) {
	    Exception exception = new Exception("Class " + Cookie.class.getName() + " does not AssignableFrom " + type.getName()); //NOI18N
//	    LOG.log(Level.INFO, exception.getMessage(), exception);
	    return null;
	}
	Object lookupResult = getLookup().lookup(type);
	if (lookupResult != null) {
	    if (!type.isInstance(lookupResult)) {
		Exception exception = new Exception("Class " + lookupResult.getClass().getName() + " is not instance of " + type.getName()); //NOI18N
//		LOG.log(Level.INFO, exception.getMessage(), exception);
		return null;
	    }
	}
	@SuppressWarnings("unchecked")
	T res = (T) lookupResult;
	return res;
    }
}
