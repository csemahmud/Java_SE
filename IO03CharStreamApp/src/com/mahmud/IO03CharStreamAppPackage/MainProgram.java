/**
 * 
 */
package com.mahmud.IO03CharStreamAppPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try(FileReader inputFile = new FileReader("docs/input.txt");
        		FileWriter outputFile = new FileWriter("docs/output.txt")) {
            int charInt;

            while ((charInt = inputFile.read()) != -1) {
                outputFile.write(charInt);
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.print("\n\n\n\t");

        try(FileReader inputFile = new FileReader("docs/output.txt")) {
            int charInt;

            while ((charInt = inputFile.read()) != -1) {
            	System.out.format("%c", charInt);
            }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
