/**
 * 
 */
package com.mahmud.IO04LineOrientedAppPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputFile = null;
		PrintWriter outputFile = null;

        try {
            inputFile = new BufferedReader(new FileReader("docs/input.txt"));
            outputFile = new PrintWriter(new FileWriter("docs/output.txt"));
            String lineStr;

            while ((lineStr = inputFile.readLine()) != null) {
                outputFile.println(lineStr);
            }
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
            if (outputFile != null) {
                outputFile.close();
            }
        }
        
        System.out.print("\n\n\n\t");

        try {
        	inputFile = null;
            inputFile = new BufferedReader(new FileReader("docs/output.txt"));
            String lineStr;

            while ((lineStr = inputFile.readLine()) != null) {
            	System.out.println(lineStr);
            }
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }

	}

}
