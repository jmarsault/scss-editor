package org.netbeans.modules.languages.scss;

import java.io.IOException;
import org.netbeans.modules.scss.engine.Engine;
import org.netbeans.modules.scss.options.ScssSettings;
import org.openide.loaders.DataObject;
import org.openide.cookies.CloseCookie;
import org.openide.cookies.EditCookie;
import org.openide.cookies.EditorCookie;
import org.openide.cookies.OpenCookie;
import org.openide.cookies.PrintCookie;
import org.openide.cookies.SaveCookie;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.loaders.MultiDataObject;
import org.openide.text.DataEditorSupport;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.CloneableOpenSupport;

public class ScssEditorSupport extends DataEditorSupport implements EditCookie,
	EditorCookie, EditorCookie.Observable, OpenCookie, CloseCookie, PrintCookie {

    private final InstanceContent ic;
    private final SaveCookie saveCookie = new SaveCookie() {

	@Override
	public void save() throws IOException {

	    if (ScssSettings.getDefault().isCompileOnSave()
		    && !ScssEditorSupport.this.getDataObject().getPrimaryFile().getName().startsWith("_")) {
		Engine.getDefault().compile(ScssEditorSupport.this.getDataObject().getPrimaryFile());
	    }
	    ScssEditorSupport.this.saveDocument();
	    ScssEditorSupport.this.getDataObject().setModified(false);
	}
    };

    public ScssEditorSupport(ScssDataObject obj) {
	super(obj, new Environment(obj));
	this.ic = obj.getInstanceContent();
    }

    @Override
    protected boolean notifyModified() {

	if (!super.notifyModified()) {
	    return false;
	}

	addSaveCookie();

	return true;
    }

    @Override
    protected void notifyUnmodified() {
	super.notifyUnmodified();

	removeSaveCookie();
    }

    @Override
    protected boolean asynchronousOpen() {
	return true;
    }

    private void addSaveCookie() {
	ic.add(saveCookie);
    }

    private void removeSaveCookie() {
	ic.remove(saveCookie);
    }

    /** Nested class. Environment for this support. Extends <code>DataEditorSupport.Env</code> abstract class. */
    private static class Environment extends DataEditorSupport.Env {

	private static final long serialVersionUID = 2271955920306414653L;

	/** Constructor. */
	public Environment(DataObject obj) {
	    super(obj);
	}

	/** Implements abstract superclass method. */
	@Override
	protected FileObject getFile() {
	    return getDataObject().getPrimaryFile();
	}

	/** Implements abstract superclass method.*/
	@Override
	protected FileLock takeLock() throws IOException {
	    return ((MultiDataObject) getDataObject()).getPrimaryEntry().takeLock();
	}

	/**
	 * Overrides superclass method.
	 * @return text editor support (instance of enclosing class)
	 */
	@Override
	public CloneableOpenSupport findCloneableOpenSupport() {
	    return getDataObject().getCookie(ScssEditorSupport.class);
	}
    } // End of nested Environment class.
}
