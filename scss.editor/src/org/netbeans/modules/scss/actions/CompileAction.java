package org.netbeans.modules.scss.actions;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.netbeans.modules.scss.engine.Engine;
import org.openide.cookies.EditCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Utilities;

public final class CompileAction implements ActionListener {

    public CompileAction(EditCookie context) {
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
	DataObject dobj = Utilities.actionsGlobalContext().lookup(DataObject.class);
	final FileObject fo = dobj.getPrimaryFile();
	Engine.getDefault().compile(fo);
    }
}
