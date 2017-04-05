/**
 * 
 */
package com.mahmud.NS12StartEndAppPackage;

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
		
		String[] trings = {
				"started", "starting", "ended", "ending", "art"
		};
		
		for (String string : trings) {
			if(string.startsWith("st")){
				System.out.printf(
						"\t\"%s\" starts with \"st\"%n", string);
			}
		}
		
		System.out.println();
		
		for (String string : trings) {
			if(string.startsWith("art", 2)){
				System.out.printf(
						"\t\"%s\" starts with \"art\" at position 2%n", 
						string);
			}
		}
		
		System.out.println();
		
		for (String string : trings) {
			if(string.endsWith("ed")){
				System.out.printf(
						"\t\"%s\" ends with \"ed\"%n", 
						string);
			}
		}

	}

}
