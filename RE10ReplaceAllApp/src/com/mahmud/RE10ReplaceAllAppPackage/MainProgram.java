/**
 * 
 */
package com.mahmud.RE10ReplaceAllAppPackage;

import java.util.Arrays;

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
		String firstString = "This sentence ends in 5 stars *****";
		System.out.println("\tOriginal firstString = " + firstString);
		firstString = firstString.replaceAll("\\*", "^");
		System.out.println("\t^ substituted for *: " + firstString);
		firstString = firstString.replaceAll("stars", "carets");
		System.out.println("\t\"carets\" substituted for \"stars\": " 
				+ firstString);
		firstString = firstString.replaceAll("\\w+", "word");
		System.out.println("\tevery word is replaced by \"word\": " 
				+ firstString);
		
		System.out.println();
		
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
		System.out.println("\tOriginal secondString = " + secondString);
		for(int i = 0; i < 3; i++){
			secondString = secondString.replaceFirst("\\d", "digit");
		}
		System.out.println("\tFirst 3 digits replaced by \"digit\": " 
				+ secondString);
		String[] results = secondString.split(",\\s*");
		System.out.println("\tString split at commas: "
				+ Arrays.toString(results));
 
	}

}
