/**
 * 
 */
package com.mahmud.IO06ScanningAppPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner scanner = null;
		
		System.out.println("\n\n");

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("docs/input.txt")));

            while (scanner.hasNext()) {
                System.out.println("\t" + scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

	}

}
