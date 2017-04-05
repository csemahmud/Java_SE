/**
 * 
 */
package com.mahmud.IO07TokensAppPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
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
        double sum = 0;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader("docs/input.txt")));
            scanner.useLocale(Locale.US);
            
            System.out.print("\n\n\n\t");

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                	double num = scanner.nextDouble();
                	System.out.print(num);
                    sum += num;
                    break;
                } else {
                    scanner.next();
                }
            }

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                	double num = scanner.nextDouble();
                	System.out.print(" + " + num);
                    sum += num;
                } else {
                    scanner.next();
                }
            }
        } finally {
        	if(scanner != null) {
        		scanner.close();
        	}
        }

        System.out.println(" = " + sum);

	}

}
