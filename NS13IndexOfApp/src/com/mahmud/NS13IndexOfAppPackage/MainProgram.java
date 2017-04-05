/**
 * 
 */
package com.mahmud.NS13IndexOfAppPackage;

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
		
		String letters = "abcdefghabcdefghabcdefgh";
		//                012345678901234567890123
		
		System.out.printf(
				"\t'c' is located at index %d%n", 
				letters.indexOf('c'));
		System.out.printf(
				"\t'a' is located at index %d%n", 
				letters.indexOf('a', 1));
		System.out.printf(
				"\t'z' is located at index %d%n", 
				letters.indexOf('z'));
		
		System.out.println();
		
		System.out.printf(
				"\t'c' is located at index %d%n", 
				letters.lastIndexOf('c'));
		System.out.printf(
				"\t'a' is located at index %d%n", 
				letters.lastIndexOf('a', 15));
		System.out.printf(
				"\t'z' is located at index %d%n", 
				letters.lastIndexOf('z'));
		
		System.out.println();
		
		System.out.printf(
				"\t\"def\" is located at index %d%n", 
				letters.indexOf("def"));
		System.out.printf(
				"\t\"def\" is located at index %d%n", 
				letters.indexOf("def", 4));
		System.out.printf(
				"\t\"hello\" is located at index %d%n", 
				letters.indexOf("hello"));
		
		System.out.println();
		
		System.out.printf(
				"\t\"def\" is located at index %d%n", 
				letters.lastIndexOf("def"));
		System.out.printf(
				"\t\"def\" is located at index %d%n", 
				letters.lastIndexOf("def", 18));
		System.out.printf(
				"\t\"hello\" is located at index %d%n", 
				letters.lastIndexOf("hello"));

	}

}
