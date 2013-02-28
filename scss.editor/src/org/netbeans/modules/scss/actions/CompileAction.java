package org.netbeans.modules.scss.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.modules.scss.engine.Engine;
import org.netbeans.modules.scss.options.ScssSettings;
import org.netbeans.spi.editor.document.OnSaveTask;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
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
public final class CompileAction implements OnSaveTask, ActionListener {

    @Override
    public void actionPerformed(ActionEvent ev) {
        compile();
    }

    private void compile() {
        DataObject dobj = Utilities.actionsGlobalContext().lookup(DataObject.class);
        final FileObject fo = dobj.getPrimaryFile();
        Engine.getDefault().compile(fo);
    }

    @Override
    public void performTask() {
        compile();
    }

    @Override
    public void runLocked(Runnable r) {
        compile();
    }

    @Override
    public boolean cancel() {
        return false;
    }

    @MimeRegistration(mimeType = "text/x-scss", service = Factory.class)
    public static class TaskFactory implements OnSaveTask.Factory {

        @Override
        public OnSaveTask createTask(Context context) {
            OnSaveTask saveTask = null;
            if (ScssSettings.getDefault().isCompileOnSave()) {
                saveTask = new CompileAction();
            }
            return saveTask;
        }
    }
}
