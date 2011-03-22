package org.netbeans.modules.scss.engine;

import java.awt.Color;
import org.netbeans.api.progress.ProgressHandleFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import org.jruby.embed.ScriptingContainer;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.queries.FileEncodingQuery;
import org.netbeans.modules.scss.options.ScssSettings;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.filesystems.FileChangeAdapter;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.windows.IOColorLines;
import org.openide.windows.IOProvider;
import org.openide.windows.InputOutput;

public class Engine {

    private static final InputOutput io = IOProvider.getDefault().getIO(NbBundle.getMessage(Engine.class, "TITLE_output"), false);
    private static ScriptingContainer scriptingContainer;
    private static Engine engine;

    public static synchronized Engine getDefault() {
	if (engine == null) {
	    engine = new Engine();
	}
	return engine;
    }

    private static synchronized ScriptingContainer initScriptingContainer() throws Exception {
	if (scriptingContainer == null) {
	    ScssSettings.checkInstall();
	    File root = new File(ScssSettings.getDefault().getSassPath());
	    String libPath = root.getAbsolutePath() + File.separator + "lib";
	    List<String> loadPaths = new ArrayList();
	    loadPaths.add(libPath);
	    scriptingContainer = new ScriptingContainer();
	    scriptingContainer.setLoadPaths(loadPaths);
	}
	scriptingContainer.setErrorWriter(new StringWriter());
	return scriptingContainer;
    }

    public void compile(final FileObject fo) {
	RequestProcessor.getDefault().post(new Runnable() {

	    @Override
	    public void run() {
		ProgressHandle handle = ProgressHandleFactory.createSystemHandle(NbBundle.getMessage(Engine.class, "MSG_compile_scss"));

		try {
		    handle.start();
		    initScriptingContainer();
		    scssToCss(fo);
		} catch (Exception ex) {
		    io.getErr().println(ex.getMessage());
		} finally {
		    handle.finish();
		}
	    }
	});
    }

    public void convert(final FileObject fo) {
	RequestProcessor.getDefault().post(new Runnable() {

	    @Override
	    public void run() {
		ProgressHandle handle = ProgressHandleFactory.createSystemHandle(NbBundle.getMessage(Engine.class, "MSG_convert_to_scss"));
		try {
		    handle.start();
		    String extFrom = fo.getExt();

		    initScriptingContainer();
		    if ("css".equalsIgnoreCase(extFrom)) {
			cssToScss(fo);
		    } else if ("sass".equalsIgnoreCase(extFrom)) {
			sassToScss(fo);
		    }

		} catch (Exception ex) {
		    io.getErr().println(ex.getMessage());
		} finally {
		    handle.finish();
		}
	    }
	});
    }

    public void scssToCss(FileObject fo) {
	StringBuilder result = new StringBuilder();
	String cssFilePath = fo.getPath();

	try {
	    io.getOut().reset();
	    io.setFocusTaken(false);
	    io.getOut().println(NbBundle.getMessage(Engine.class, "FMT_compilation_started", fo.getNameExt()));

	    scriptingContainer.put("@result", result);
	    String script = "require 'sass'\n";
	    script += "options = {}\n";
	    script += "options[:load_paths] = " + findDependencies(fo) + "\n";
	    script += "options[:style] = :" + ScssSettings.getDefault().getOutputStyle().name + "\n";
	    script += "options[:line_comments] = " + (ScssSettings.getDefault().isLineCommentsEnabled() ? "true" : "false") + "\n";
	    script += "options[:debug_info] = " + (ScssSettings.getDefault().isDebugInfoEnabled() ? "true" : "false") + "\n";
	    script += "options[:syntax] = " + (cssFilePath.endsWith(".scss") ? ":scss" : ":sass") + "\n";
	    script += "input = File.new('" + cssFilePath + "', 'r')\n";
	    script += "tree = ::Sass::Engine.new(input.read(), options).to_tree\n";
	    script += "@result.append(tree.render)" + "\n";
	    scriptingContainer.runScriptlet(script);

	    String newfilename = fo.getParent().getPath() + File.separator + fo.getName() + ".css";
	    FileObject cssFo = Engine.write(newfilename, result.toString(), FileEncodingQuery.getEncoding(fo));
	    cssFo.refresh(true);

	    IOColorLines.println(io, NbBundle.getMessage(Engine.class, "FMT_compilation_OK"), Color.GREEN.darker().darker());

	} catch (Exception e) {
	    io.setFocusTaken(true);
	    String error = scriptingContainer.getErrorWriter().toString();
	    if (error != null && !error.isEmpty()) {
		io.getErr().println(error);
	    } else {
		io.getErr().println(e.getMessage());
	    }
	    io.getErr().println(NbBundle.getMessage(Engine.class, "FMT_compilation_failed"));
	}
    }

    public void cssToScss(FileObject fo) {
	StringBuilder result = new StringBuilder();

	try {
	    io.getOut().reset();
	    io.setFocusTaken(false);
	    io.getOut().println(NbBundle.getMessage(Engine.class, "FMT_conversion_started", fo.getNameExt()));

	    String filename = fo.getParent().getPath() + File.separator + fo.getName() + ".scss";
	    File outputFile = new File(filename);
	    NotifyDescriptor confirmOverwrite = new NotifyDescriptor.Confirmation(NbBundle.getMessage(Engine.class, "MSG_OverwriteFile", outputFile.getName()), NotifyDescriptor.YES_NO_OPTION);

	    if (!outputFile.exists()
		    || DialogDisplayer.getDefault().notify(confirmOverwrite) == NotifyDescriptor.YES_OPTION) {

		scriptingContainer.put("@result", result);
		String script = "require 'sass/css' \n";
		script += "input = File.new('" + fo.getPath() + "', 'r') \n";
		script += "options = {} \n";
		script += "options[:to] = :scss \n";
		script += "tree = ::Sass::CSS.new(input.read(), options) \n";
		script += "@result.append(tree.render(options[:to])) \n";
		scriptingContainer.runScriptlet(script);

		FileObject cssFo = Engine.write(filename, result.toString(), FileEncodingQuery.getEncoding(fo));
		cssFo.refresh(true);

		IOColorLines.println(io, NbBundle.getMessage(Engine.class, "FMT_conversion_OK"), Color.GREEN.darker().darker());

	    } else {
		io.setFocusTaken(true);
		io.getErr().println(NbBundle.getMessage(Engine.class, "FMT_conversion_canceled"));
	    }
	} catch (Exception e) {
	    io.setFocusTaken(true);
	    String error = scriptingContainer.getErrorWriter().toString();
	    if (error != null && !error.isEmpty()) {
		io.getErr().println(error);
	    } else {
		io.getErr().println(e.getMessage());
	    }
	    io.getErr().println(NbBundle.getMessage(Engine.class, "FMT_conversion_failed"));
	}
    }

    public void sassToScss(FileObject fo) {
	StringBuilder result = new StringBuilder();


	try {
	    io.getOut().reset();
	    io.setFocusTaken(false);
	    io.getOut().println(NbBundle.getMessage(Engine.class, "FMT_conversion_started", fo.getNameExt()));

	    String filename = fo.getParent().getPath() + File.separator + fo.getName() + ".scss";
	    File outputFile = new File(filename);
	    NotifyDescriptor confirmOverwrite = new NotifyDescriptor.Confirmation(NbBundle.getMessage(Engine.class, "MSG_OverwriteFile", outputFile.getName()), NotifyDescriptor.YES_NO_OPTION);

	    if (!outputFile.exists()
		    || DialogDisplayer.getDefault().notify(confirmOverwrite) == NotifyDescriptor.YES_OPTION) {

		scriptingContainer.put("@result", result);
		String script = "require 'sass' \n";
		script += "input = File.new('" + fo.getPath() + "', 'r') \n";
		script += "options = {} \n";
		script += "options[:syntax] = :sass \n";
		script += "tree = ::Sass::Engine.new(input.read, options).to_tree  \n";
		script += "@result.append(tree.send(\"to_scss\")) \n";
		scriptingContainer.runScriptlet(script);

		FileObject cssFo = Engine.write(filename, result.toString(), FileEncodingQuery.getEncoding(fo));
		cssFo.refresh(true);

		IOColorLines.println(io, NbBundle.getMessage(Engine.class, "FMT_conversion_OK"), Color.GREEN.darker().darker());

	    } else {
		io.setFocusTaken(true);
		io.getErr().println(NbBundle.getMessage(Engine.class, "FMT_conversion_canceled"));
	    }
	} catch (Exception e) {
	    io.setFocusTaken(true);
	    String error = scriptingContainer.getErrorWriter().toString();
	    if (error != null && !error.isEmpty()) {
		io.getErr().println(error);
	    } else {
		io.getErr().println(e.getMessage());
	    }
	    io.getErr().println(NbBundle.getMessage(Engine.class, "FMT_conversion_failed"));
	}
    }

    public static FileObject write(String filename, String data, Charset charset) throws IOException {
	FileObject cssFo = FileUtil.createData(new File(filename));
	cssFo.addFileChangeListener(new FileChangeAdapter());
	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(cssFo.getOutputStream(), charset.name()));
	out.write(data);
	out.flush();
	out.close();
	return cssFo;
    }

    private static String findDependencies(FileObject fo) throws IOException {
	StringBuilder deps = new StringBuilder();
	deps.append("['");
	deps.append(fo.getParent().getPath());
	deps.append("'");
	if (fo.asText().contains("@import")) {
	    Enumeration<? extends FileObject> e = fo.getParent().getFolders(true);
	    while (e.hasMoreElements()) {
		FileObject subFolder = e.nextElement();
		deps.append(", '");
		deps.append(subFolder.getPath());
		deps.append("'");
	    }
	}
	deps.append("]");
	return deps.toString();
    }
}
