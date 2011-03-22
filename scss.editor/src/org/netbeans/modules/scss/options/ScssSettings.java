package org.netbeans.modules.scss.options;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.prefs.Preferences;
import org.netbeans.api.options.OptionsDisplayer;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

public class ScssSettings {

    private static ScssSettings scssSettings = null;
    private static final String PROP_SASS_PATH = "sassPath";
    private static final String PROP_COMPILE_ON_SAVE = "compileOnSave";
    private static final String PROP_COMMENTS_ENABLED = "lineCommentsEnabled";
    private static final String PROP_DEBUG_INFO_ENABLED = "debugInfoEnabled";
    private static final String PROP_OUTPUT_STYLE = "outputStyle";
    private static final long serialVersionUID = 85176380568174L;
    private Preferences prefs = null;

    private ScssSettings() {
	prefs = NbPreferences.forModule(ScssSettings.class);
    }

    public static synchronized ScssSettings getDefault() {
	if (scssSettings == null) {
	    scssSettings = new ScssSettings();
	}
	return scssSettings;
    }

    public String getSassPath() {
	return prefs.get(PROP_SASS_PATH, null);
    }

    public final void setHamlPath(String path) {
	prefs.put(PROP_SASS_PATH, path);
    }

    public OutputStyle getOutputStyle() {
	String style = prefs.get(PROP_OUTPUT_STYLE, Integer.toString(OutputStyle.EXPANDED.id));
	return OutputStyle.valueOf(Integer.valueOf(style));
    }

    public final void setOutputStyle(Integer style) {
	prefs.put(PROP_OUTPUT_STYLE, style.toString());
    }

    public boolean isCompileOnSave() {
	return prefs.getBoolean(PROP_COMPILE_ON_SAVE, false);
    }

    public void setCompileOnSave(boolean b) {
	prefs.putBoolean(PROP_COMPILE_ON_SAVE, b);
    }

    public boolean isLineCommentsEnabled() {
	return prefs.getBoolean(PROP_COMMENTS_ENABLED, false);
    }

    public void setLineCommentsEnabled(boolean b) {
	prefs.putBoolean(PROP_COMMENTS_ENABLED, b);
    }

    public boolean isDebugInfoEnabled() {
	return prefs.getBoolean(PROP_DEBUG_INFO_ENABLED, false);
    }

    public void setDebugInfoEnabled(boolean b) {
	prefs.putBoolean(PROP_DEBUG_INFO_ENABLED, b);
    }

    protected static String getHamlVersion(File file) {
	String version = null;
	try {
	    File fileVersion = new File(file, "VERSION");

	    if (fileVersion != null) {
		InputStream is = FileUtil.toFileObject(fileVersion).getInputStream();
		try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(is));
		    version = br.readLine();
		} finally {
		    is.close();
		}
	    }
	} catch (IOException x) {
	    // ignore for now
	}
	return version;
    }

    public static enum OutputStyle {

	COMPACT(0, "compact"),
	COMPRESSED(1, "compressed"),
	EXPANDED(2, "expanded"),
	NESTED(3, "nested");
	public int id;
	public String name;

	private OutputStyle(int id, String name) {
	    this.id = id;
	    this.name = name;
	}

	public static OutputStyle valueOf(int id) {
	    OutputStyle[] values = values();
	    for (OutputStyle value : values) {
		if (value.id == id) {
		    return value;
		}
	    }
	    throw new IllegalArgumentException("The id " + id + " is not recognized");
	}
    }

    public static void checkInstall() throws Exception {
	if (ScssSettings.getDefault().getSassPath() == null
		|| ScssSettings.getDefault().getSassPath().isEmpty()) {
//	    OptionsDisplayer.getDefault().open(OptionsDisplayer.ADVANCED + "/Scss");
	    OptionsDisplayer.getDefault().open("Advanced/Scss");
	    throw new Exception(NbBundle.getMessage(ScssSettings.class, "ERR_NoValidInstallation"));
	}
    }
}
