/**
 * 
 */
package com.mahmud.NS05StringsAppPackage;

import java.util.Locale;

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
		
		String string = "Hello, ".concat("I am Mahmudul !");
        int length = string.length();
        char[] tempCharArray = new char[length];
        char[] reverseCharArray = new char[length];
        
        // put original string in an 
        // array of chars
        string.getChars(0, length, tempCharArray, 0); 
        
        String s = String.valueOf(tempCharArray, 12, 6);
        System.out.printf("\n\tPart of charArray : %s%n", 
        		s);
        
        // reverse array of chars
        for (int j = 0; j < length; j++) {
            reverseCharArray[j] =
                tempCharArray[length - 1 - j];
        }
        
        String reverseString =
            new String(reverseCharArray);
        System.out.println("\tReverse : " + reverseString);
        
        s = string.substring(string.indexOf('M')); 
        System.out.println("\n\tSubstring : " + s);
        s = string.substring(string.indexOf('M'), 
        		string.indexOf('d') + 1);
        System.out.println("\tSubstring : " + s);
        
        s = string.replace('l', 'L'); 
        System.out.println("\tReplace 'l' with 'L' : \n\t" + s);
        s = string.toLowerCase();
        System.out.println("\tLowerCase : " + s);
        s = string.toUpperCase();
        System.out.println("\tUpperCase : " + s);
        s = string.concat(" I am a programmer");
        System.out.println("\tConcat : \n\t" + s.toString());
        System.out.println("\tAfter Concat : " + string);
        System.out.printf("\tThe last character = '%c'%n",
        		string.charAt(length - 1));
        
        System.out.println();
        
        String string2 = "\t spaces \t";
        s = string2.trim();
        System.out.printf("\tstring2.trim() = \"%s\"%n", 
        		s);
        System.out.printf("\tstring2 = \"%s\"%n", string2);
        System.out.println("\tstring2 to Character Array : ");
        System.out.print("\t{");
        for (char ch : string2.toCharArray()) {
			System.out.printf(" '%c',", ch);
		}
        System.out.println(" }");
        
        Float floatVar = 10.5f;
		Integer intVar = 10;
		String stringVar = "\"Ten\"";
		
		String formattedString 
			= String.format(Locale.FRANCE,
			    "\tThe value of the float " 
	    		+ "variable is %f,%n\twhile the " +
			    "value of the integer variable " 
	    		+ "is %d,%n\tand the string is %s%n", 
			    floatVar, intVar, stringVar);
		
		System.out.println();
		System.out.println(formattedString);

		if(string.length() == tempCharArray.length){
			System.out.printf("\tLength : %d == %d",
					string.length(),
					tempCharArray.length);
		}
		
//		if(string.length == tempCharArray.length()){
//			System.out.printf("\tLength : %d == %d",
//					string.length(),
//					tempCharArray.length);
//		}
		
		// Compiler Error
		// string.length : 
		// length cannot be resolved or is not a field
		// tempCharArray.length()
		// Cannot invoke length() on the array type char[]
	}

}
