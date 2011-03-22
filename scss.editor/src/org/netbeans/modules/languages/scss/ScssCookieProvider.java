package org.netbeans.modules.languages.scss;

import java.util.Collection;
import org.openide.loaders.DataObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.InstanceContent;

public abstract class ScssCookieProvider {

    public abstract void addLookup(DataObject dao, InstanceContent ic);
    private static ScssCookieProvider DEFAULT;

    public static synchronized ScssCookieProvider getDefault() {
	if (DEFAULT == null) {
	    DEFAULT = new Default();
	}
	return DEFAULT;
    }

    private static final class Default extends ScssCookieProvider {

	private final Collection<? extends ScssCookieProvider> providers;

	public Default() {
	    providers = Lookup.getDefault().lookupAll(ScssCookieProvider.class);
	}

	@Override
	public void addLookup(DataObject dao, InstanceContent ic) {
	    for (ScssCookieProvider provider : providers) {
		provider.addLookup(dao, ic);
	    }
	}
    }
}
