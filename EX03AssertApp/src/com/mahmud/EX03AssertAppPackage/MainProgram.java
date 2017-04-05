/**
 * 
 */
package com.mahmud.EX03AssertAppPackage;

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
		
		int number;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("\tEnter a number between 0 and 10 : ");
		number = scanner.nextInt();
		
		System.out.println();
		
		assert (number >= 0 && number <= 10) : ("\tBadnumber : " + 10);
		System.out.println("\tYou have Entered : " + number);

	}

}
