package org.netbeans.modules.languages.scss;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.util.Lookup;
import org.openide.util.lookup.InstanceContent;

/**
 *
 * @author marsaultj
 */
public class ScssDataObject extends MultiDataObject {
    
    public static final String MIME_TYPE = "text/x-scss";

    public ScssDataObject(FileObject fo, MultiFileLoader loader) throws DataObjectExistsException, IOException {
        super(fo, loader);
        registerEditor(MIME_TYPE, true);
    }

}
