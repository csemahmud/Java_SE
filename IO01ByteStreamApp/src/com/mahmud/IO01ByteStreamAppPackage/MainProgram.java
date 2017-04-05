/**
 * 
 */
package com.mahmud.IO01ByteStreamAppPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
		
		FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {
            inputFile = new FileInputStream("docs/input.txt");
            outputFile = new FileOutputStream("docs/output.txt");
            int charInt;

            while ((charInt = inputFile.read()) != -1) {
                outputFile.write(charInt);
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
            inputFile = new FileInputStream("docs/output.txt");
            int charInt;

            while ((charInt = inputFile.read()) != -1) {
                System.out.format("%c", charInt);
            }
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }

	}

}
