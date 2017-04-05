/**
 * 
 */
package com.mahmud.RE04QuantifierAppPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		matchRegex("a?", "");
		matchRegex("a*", "");
		matchRegex("a+", "");
		matchRegex("a?", "a");
		matchRegex("a*", "a");
		matchRegex("a+", "a");
		matchRegex("a?", "aaaaa");
		matchRegex("a*", "aaaaa");
		matchRegex("a+", "aaaaa");

	}

	private static void matchRegex(String regex, String searchStr) {
		// TODO Auto-generated method stub
		
		Pattern pattern =
	            Pattern.compile(regex);
		Matcher matcher = 
	            pattern.matcher(searchStr);

        boolean found = false;
        while (matcher.find()) {
        	System.out.format("\t%s : \"%s\" found from " 
        			+ "%d to %d in \"%s\".%n",
        			regex,
	                matcher.group(),
	                matcher.start(),
	                matcher.end(),
	                searchStr);
            found = true;
        }
        if(!found){
        	System.out.format("\t\"%s\" NOT found in \"%s\".%n",
        			regex, searchStr);
        }
		
	}

}