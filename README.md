# Netbeans plugin for Scss language

This project adds support for editing Scss files in Netbeans IDE (Syntax highlighting, format, comment, brace matching).

![Example code](/joonty/scss-editor/raw/master/images/styles.png)
## News

* *2012-03-01* **0.4 BETA** for netbeans 6.9.1 and 7.0, doc block tags in SCSS files overwrite global variables and set output CSS path
* *2011-03-23* **0.3 BETA** for netbeans 6.9.1 and 7.0 BETA with some new features (css conversion and scss compilation)

![Options dialogue](/joonty/scss-editor/raw/master/images/options.png)

## Configuration

The options dialogue (see above) can be used to set global options. If you want to override these options for a given file, you can use the new docblock format at the top of your file. For example:

```css
/**
 * @outputStyle compressed
 * @debugInfo true
 * @lineComments true
 */ 

body {
	/* etc... */
}
```

Also, you can specify the output path for the CSS, using the `@outputFile` tag:

```css
/**
 * @outputFile ../www/css/stylesheet.css
 * @outputStyle compressed
 */
```

The path can be relative to the SCSS file, or absolute to the project path. For instance, if the project path is */home/user/myproject/* and the `@outputFile` is */stylesheet.css*, the stylesheet will be created at */home/user/myproject/stylesheet.css*.

## License

This software was originally authored by [J Marsault], and is released under the [GNU GPL v2] license.

[J Marsault]: jeremy.marsault@gmail.com
[GNU GPL v2]: http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
