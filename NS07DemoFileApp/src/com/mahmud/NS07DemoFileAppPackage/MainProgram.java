/**
 * 
 */
package com.mahmud.NS07DemoFileAppPackage;

import com.mahmud.NS07DemoFileAppPackage.classes.Filename;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	public static final String FPATH 
		= "/home/user.new/index.new.html";

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("\tExtension = " + myHomePage.getExtension());
        System.out.println("\tFilename = " + myHomePage.getFilename());
        System.out.println("\tPath = " + myHomePage.getPath());

	}

}
