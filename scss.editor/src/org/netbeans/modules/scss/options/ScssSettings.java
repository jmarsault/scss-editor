package org.netbeans.modules.scss.options;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import org.jruby.embed.ScriptingContainer;
import org.netbeans.api.options.OptionsDisplayer;
import org.openide.filesystems.FileUtil;
import org.openide.modules.InstalledFileLocator;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

public class ScssSettings {

    private static ScssSettings scssSettings = null;
    private static final String PROP_SASS_PATH = "sassPath";
    private static final String PROP_COMPILE_ON_SAVE = "compileOnSave";
    private static final String PROP_COMMENTS_ENABLED = "lineCommentsEnabled";
    private static final String PROP_DEBUG_INFO_ENABLED = "debugInfoEnabled";
    private static final String PROP_OUTPUT_STYLE = "outputStyle";
    private static final String PROP_SYSTEM_SASS = "systemSass";
    private static final String PROP_USE_COMPASS = "useCompass";
    private static final long serialVersionUID = 85176380568174L;
    private static final String PROP_BUNDLE_USED = "bundleUsed";
    private static final String BUNDLE_VERSION = "sass-3.1.20";
    private Preferences prefs = null;
    private static final Logger LOGGER = Logger.getLogger(ScssSettings.class.getName());

    private ScssSettings() {
        prefs = NbPreferences.forModule(ScssSettings.class);
    }

    public static synchronized ScssSettings getDefault() {
        if (scssSettings == null) {
            scssSettings = new ScssSettings();
        }
        return scssSettings;
    }

    public String getBundlePath() {
        File file = InstalledFileLocator.getDefault().locate(BUNDLE_VERSION, "org.netbeans.modules.languages.scss", false); //NoI18N

        if (file != null && file.canRead()) {
            return file.getAbsolutePath();
        } else {
            LOGGER.warning(String.format("Cannot locate the Sass bundled installation '%s'.", BUNDLE_VERSION)); //NOI18N
        }
        return null;
    }

    public boolean isBundleVersion() {
        return prefs.getBoolean(PROP_BUNDLE_USED, true);
    }

    public void setBundle(boolean selected) {
        prefs.putBoolean(PROP_BUNDLE_USED, selected);
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

    public boolean useSystemSass() {
        return prefs.getBoolean(PROP_SYSTEM_SASS, false);
    }

    public void setUseSystemSass(boolean b) {
        prefs.putBoolean(PROP_SYSTEM_SASS, b);
        prefs.put(PROP_SASS_PATH, getRubyLoadPaths(":"));
    }

    public boolean useCompass() {
        return prefs.getBoolean(PROP_USE_COMPASS, false);
    }

    public void setUseCompass(boolean b) {
        prefs.putBoolean(PROP_USE_COMPASS, b);
    }

    protected static String getSassVersion(File file) {
        String version = null;
        try {
            File fileVersion = new File(file, "VERSION");

            if (fileVersion != null && fileVersion.canRead()) {
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

    protected static String getBundleVersion() {
        try {
            return getSassVersion(new File(ScssSettings.getDefault().getBundlePath()));
        }
        catch(Exception e) {
        }
        return "";
    }

    protected static String getSystemSassVersion() {
        StringBuilder result = new StringBuilder();
        List<String> loadPaths = getRubyLoadPaths();

        ScriptingContainer scriptingContainer;
        scriptingContainer = new ScriptingContainer();
        scriptingContainer.setLoadPaths(loadPaths);
        scriptingContainer.setErrorWriter(new StringWriter());
        scriptingContainer.put("@result", result);

        String script = "require 'sass' \n"
                      + "@result.append(::Sass::VERSION)";
        try {
            scriptingContainer.runScriptlet(script);
            scriptingContainer.terminate();
        } catch (Exception e) {
//           String error = scriptingContainer.getErrorWriter().toString();
        }

        return result.toString();
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
        if (!ScssSettings.getDefault().isBundleVersion()) {
            String sassPath = ScssSettings.getDefault().getSassPath();
            Boolean useSystemSass = ScssSettings.getDefault().useSystemSass();
            if ((sassPath == null || sassPath.isEmpty()
                    || ScssSettings.getSassVersion(new File(sassPath)) == null) && !useSystemSass) {
//	    OptionsDisplayer.getDefault().open(OptionsDisplayer.ADVANCED + "/Scss");
                OptionsDisplayer.getDefault().open("Advanced/Scss");
                throw new Exception(NbBundle.getMessage(ScssSettings.class, "ERR_NoValidInstallation"));
            }
        }
    }

    static List<String> getRubyLoadPaths() {
        String[] cmd = {"ruby", "-e", "puts $:"};
        return exec(cmd);
    }
    static String getRubyLoadPaths(String glue) {
        String result = "";
        for(String str : getRubyLoadPaths()) {
            result += str + glue;
        }
        return result.substring(0, result.length()-1);
    }

    static public List<String> exec(String[] command) {
        Runtime r = Runtime.getRuntime();
        List<String> result = new ArrayList<String>();
//        InputOutput io = IOProvider.getDefault().getIO(NbBundle.getMessage(Engine.class, "TITLE_output"), false);

        try {
            Process p = r.exec(command);
            InputStream in = p.getInputStream();
            BufferedInputStream buf = new BufferedInputStream(in);
            InputStreamReader inread = new InputStreamReader(buf);
            BufferedReader bufferedreader = new BufferedReader(inread);

            String line;
            while ((line = bufferedreader.readLine()) != null) {
                    // filter out platform dependend paths
                if(! line.contains("vendor") || line.contains("linux")) {
                    continue;
                }
                result.add(line);
            }
            try {
                if (p.waitFor() != 0) {
//                    io.getOut().println("exit value = " + p.exitValue());
                }
            } catch (InterruptedException e) {
//                io.getOut().println(e.getMessage());
            } finally {
                // Close the InputStream
                bufferedreader.close();
                inread.close();
                buf.close();
                in.close();
            }
        } catch (IOException e) {
//            io.getOut().println(e.getMessage());
        }
        return result;
    }
}
