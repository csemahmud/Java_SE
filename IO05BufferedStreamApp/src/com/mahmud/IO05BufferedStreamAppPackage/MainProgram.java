/**
 * 
 */
package com.mahmud.IO05BufferedStreamAppPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

        try(BufferedReader inputFile = new BufferedReader(new FileReader("docs/input.txt"));
        		BufferedWriter outputFile = new BufferedWriter(new FileWriter("docs/output.txt"))) {
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

        try(BufferedReader inputFile = new BufferedReader(new FileReader("docs/output.txt"))) {
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
