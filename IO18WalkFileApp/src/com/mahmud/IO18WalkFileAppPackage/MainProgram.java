/**
 * 
 */
package com.mahmud.IO18WalkFileAppPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.mahmud.IO18WalkFileAppPackage.classes.PrintFiles;

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
		
		Path startingDir = Paths.get("docs");

		PrintFiles printFiles = new PrintFiles("*.java", "looking_for.txt");
		// PrintFiles printFiles = new PrintFiles("looking_for.txt");
		// PrintFiles printFiles = new PrintFiles();
		
		try {
			
			Files.walkFileTree(startingDir, printFiles);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
