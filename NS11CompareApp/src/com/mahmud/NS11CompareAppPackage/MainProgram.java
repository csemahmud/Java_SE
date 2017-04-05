/**
 * 
 */
package com.mahmud.NS11CompareAppPackage;

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
		
		char[] charGoodbye = {
			'g', 'o', 'o', 'd', 'b', 'y', 'e',	
		};
		
		char[] charArray = {
				'D', 'e', 'a', 'r', ' ', 'A', 'l', 'i', 'a', ',',
				' ', 'H', 'a', 'p', 'p', 'y',
				' ', 'B', 'i', 'r', 't', 'h', 'd', 'a', 'y',
				' ', 't', 'o', ' ', 'y', 'o', 'u', '.'
		};
		
		String helloStr = "hello";
		String string = new String();
		String string1 = new String(helloStr);
		String string2 = new String(charGoodbye);
		int startIndex = 11;
		int length = 14;
		String string3 = new String(charArray, startIndex, length);
		String string4 = string3.toLowerCase();
		
		System.out.printf("\tstring = \"%s\"%n", string);
		System.out.printf("\tstring1 = \"%s\"%n", string1);
		System.out.printf("\tstring2 = \"%s\"%n", string2);
		System.out.printf("\tstring3 = \"%s\"%n", string3);
		System.out.printf("\tstring4 = \"%s\"%n", string4);
		System.out.print("\tReverse string3 = \"");
		
		for(int i = string3.length() - 1; i >= 0; i-- ) {
			System.out.printf("%c", string3.charAt(i));
		}
		
		System.out.println("\"");
		
		System.out.println();
		if(string1.equals("hello")) {
			System.out.println("\tstring1 EQUALS \"hello\"");
		} else {
			System.out.println("\tstring1 does NOT equal \"hello\"");
		}

		if(string1 == "hello") {
			System.out.println(
					"\tstring1 is the SAME object as \"hello\"");
		} else {
			System.out.println(
					"\tstring1 is NOT the same object as \"hello\"");
		}
		
		if(string3.equalsIgnoreCase(string4)){
			System.out.printf(
					"\t\"%s\" equals \"%s\" with CASE IGNORED%n",
					string3, string4);
		} else {
			System.out.printf(
					"\t\"%s\" does NOT equal \"%s\"%n",
					string3, string4);
		}
		
		System.out.println();
		
		System.out.printf("\tstring1.compareTo(string2) = %d%n", 
				string1.compareTo(string2));
		System.out.printf("\tstring2.compareTo(string1) = %d%n", 
				string2.compareTo(string1));
		System.out.printf("\tstring1.compareTo(string1) = %d%n", 
				string1.compareTo(string1));
		System.out.printf("\tstring3.compareTo(string4) = %d%n", 
				string3.compareTo(string4));
		System.out.printf("\tstring4.compareTo(string3) = %d%n", 
				string4.compareTo(string3));
		
		System.out.println();
		
		if(string3.regionMatches(0, string4, 0, 5)){
			System.out.println(
					"\tFirst 5 characters of string3 and string4"
					+ " MATCH");
		} else {
			System.out.println(
					"\tFirst 5 characters of string3 and string4"
					+ " do NOT match");
		}
		
		if(string3.regionMatches(true, 0, string4, 0, 5)){
			System.out.println(
					"\tFirst 5 characters of string3 and string4"
					+ " match with CASE IGNORED");
		} else {
			System.out.println(
					"\tFirst 5 characters of string3 and string4"
					+ " do NOT match");
		}

	}

}
