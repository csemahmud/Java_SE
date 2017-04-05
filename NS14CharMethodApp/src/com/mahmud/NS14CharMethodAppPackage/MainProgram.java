/**
 * 
 */
package com.mahmud.NS14CharMethodAppPackage;

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
		
		System.out.println("\n\n");
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("\tEnter a character : ");
			char ch = scanner.next().charAt(0);
			
			System.out.println();
			
			System.out.printf("\tisDefined = %b%n", Character.isDefined(ch));
			System.out.printf("\tisDigit = %b%n", Character.isDigit(ch));
			System.out.printf("\tis First Character of a Java Identifier = %b%n", 
					Character.isJavaIdentifierStart(ch));
			System.out.printf("\tis Part of a Java Identifier = %b%n", 
					Character.isJavaIdentifierPart(ch));
			System.out.printf("\tisLetter = %b%n", Character.isLetter(ch));
			System.out.printf("\tisLetterOrDigit = %b%n", 
					Character.isLetterOrDigit(ch));
			System.out.printf("\tisLowerCase = %b%n", Character.isLowerCase(ch));
			System.out.printf("\tisUpperCase = %b%n", Character.isUpperCase(ch));
			System.out.printf("\ttoLowerCase = %c%n", Character.toLowerCase(ch));
			System.out.printf("\ttoUpperCase = %c%n", Character.toUpperCase(ch));
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
