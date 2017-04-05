/**
 * 
 */
package com.mahmud.NS06NumStrAppPackage;

import java.util.InputMismatchException;
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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double num1, num2;
		
		System.out.print("\n\n\n\tEnter a number : ");

		try(Scanner scanner = new Scanner(System.in)) {
			num1 = scanner.nextDouble();
			System.out.print("\n\tEnter another number : ");
			num2 = scanner.nextDouble();
			
			System.out.println("\n\t" + num1 + " + " + num2
					+ " = " + (num1 + num2));
			
			System.out.println("\t" + num1 + " - " + num2
					+ " = " + (num1 - num2));
			
			System.out.println("\t" + num1 + " * " + num2
					+ " = " + (num1 * num2));
			
			System.out.println("\t" + num1 + " / " + num2
					+ " = " + (num1 / num2));
			
			System.out.println("\t" + num1 + " % " + num2
					+ " = " + (num1 % num2));
			
			System.out.print("\n\t");
			
			System.out.println(num1 + num2 + " : " + num1 + num2);
			
			String str1 = String.valueOf(num1);
			String str2 = Double.toString(num2);
			
			System.out.print("\n\tstr1 + str2 = ");
			System.out.println(str1 + str2);
			
			int dot = str1.indexOf(".");
			System.out.println("\n\tIn " + str1 + " : ");
			System.out.print("\t");
			System.out.println(dot 
					+ " digits before dot.");
			System.out.print("\t");
			System.out.println(str1.length() - dot - 1 
					+ " digits after dot.");
			
		} catch (InputMismatchException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\n\tError : Enter Numeric Value Only !!!");
		}
	}

}