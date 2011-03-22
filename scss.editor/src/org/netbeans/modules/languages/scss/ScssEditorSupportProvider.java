package org.netbeans.modules.languages.scss;

import org.openide.loaders.DataObject;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.InstanceContent.Convertor;

public final class ScssEditorSupportProvider extends ScssCookieProvider {

    static final ScssEditorSupportFactory staticFactory = new ScssEditorSupportFactory();

    @Override
    public void addLookup(DataObject dao, InstanceContent ic) {
	ScssDataObject sdao = (ScssDataObject) dao;
	ic.add(sdao, staticFactory);
    }

    private static class ScssEditorSupportFactory implements Convertor<ScssDataObject, ScssEditorSupport> {

	public ScssEditorSupportFactory() {
	}

	@Override
	public ScssEditorSupport convert(ScssDataObject obj) {
	    return new ScssEditorSupport(obj);
	}

	@Override
	public Class<? extends ScssEditorSupport> type(ScssDataObject obj) {
	    return ScssEditorSupport.class;
	}

	@Override
	public String id(ScssDataObject obj) {
	    return ScssEditorSupport.class.getName() + obj.getPrimaryFile().getPath();
	}

	@Override
	public String displayName(ScssDataObject obj) {
	    return id(obj);
	}
    }
}
