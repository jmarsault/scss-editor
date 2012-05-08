package org.netbeans.modules.scss.actions;

import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.netbeans.modules.scss.engine.Engine;
import org.openide.cookies.EditCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Utilities;

@ActionID(category = "Build",
id = "org.netbeans.modules.scss.actions.CompileAction")
@ActionRegistration(displayName = "#CTL_CompileAction")
@ActionReferences({
    @ActionReference(path = "Menu/BuildProject", position = 912, separatorBefore = 906, separatorAfter = 918),
    @ActionReference(path = "Loaders/text/x-scss/Actions", position = 137, separatorBefore = 131, separatorAfter = 143)
})
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
