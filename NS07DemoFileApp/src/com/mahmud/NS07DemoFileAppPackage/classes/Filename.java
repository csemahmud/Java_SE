/**
 * 
 */
package com.mahmud.NS07DemoFileAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Filename {
	
	private String fullPath;
    private char pathSeparator, 
                 extensionSeparator;
    
    

	/**
	 * @param fullPath
	 * @param pathSeparator
	 * @param extensionSeparator
	 */
	public Filename(String fullPath, char pathSeparator, char extensionSeparator) {
		this();
		this.fullPath = fullPath;
		this.pathSeparator = pathSeparator;
		this.extensionSeparator = extensionSeparator;
	}



	/**
	 * 
	 */
	public Filename() {
		// TODO Auto-generated constructor stub
	}

    public String getExtension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // gets filename without extension
    public String getFilename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String getPath() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }

}
