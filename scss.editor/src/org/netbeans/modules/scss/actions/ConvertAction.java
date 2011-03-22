package org.netbeans.modules.scss.actions;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.netbeans.modules.scss.engine.Engine;
import org.openide.cookies.EditCookie;
import org.openide.loaders.DataObject;
import org.openide.util.Utilities;
import org.openide.filesystems.FileObject;

public final class ConvertAction implements ActionListener {

    public ConvertAction(EditCookie context) {
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
	DataObject dobj = Utilities.actionsGlobalContext().lookup(DataObject.class);
	FileObject fo = dobj.getPrimaryFile();
	Engine.getDefault().convert(fo);
    }
}
