package org.netbeans.modules.scss.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.modules.scss.engine.Engine;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Utilities;

@ActionID(category = "BpelNodes",
id = "org.netbeans.modules.scss.actions.ConvertAction")
@ActionRegistration(displayName = "#CTL_ConvertAction")
@ActionReferences({
    @ActionReference(path = "Loaders/text/x-css/Actions", position = 860, separatorBefore = 855, separatorAfter = 865)
})
public final class ConvertAction implements ActionListener {

    public ConvertAction(DataObject context) {
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        DataObject dobj = Utilities.actionsGlobalContext().lookup(DataObject.class);
        FileObject fo = dobj.getPrimaryFile();
        Engine.getDefault().convert(fo);
    }
}
