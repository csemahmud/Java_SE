/**
 * 
 */
package com.mahmud.IO16LinkAppPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

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
		
		Path newLink = Paths.get("docs/mahmud/example/new_link.txt");
		Path target = Paths.get("docs/others/example/target.txt");
		try {
		    Files.createSymbolicLink(newLink, target);
		} catch (IOException | UnsupportedOperationException ex) {
		    // Some file systems do not support symbolic links.
		    System.err.println("\t" + ex);
		}

	}

}
