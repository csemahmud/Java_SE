/**
 * 
 */
package com.mahmud.RE11NameDateAppPackage;

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
		matchRegex("J.*\\d[0-35-9]-\\d\\d-\\d\\d", 
				"Jane's Birthday is 05-12-75");
		matchRegex("J.*\\d[0-35-9]-\\d\\d-\\d\\d", 
				"Dave's Birthday is 11-04-64");
		matchRegex("J.*\\d[0-35-9]-\\d\\d-\\d\\d", 
				"John's Birthday is 04-28-73");
		matchRegex("J.*\\d[0-35-9]-\\d\\d-\\d\\d", 
				"Jane's Birthday is 45-12-75");
		matchRegex("J.*\\d[0-35-9]-\\d\\d-\\d\\d", 
				"Joe's Birthday is 12-17-77");

	}

	private static void matchRegex(String regex, String searchStr) {
		// TODO Auto-generated method stub
		
		Pattern pattern =
	            Pattern.compile(regex);
		Matcher matcher = 
	            pattern.matcher(searchStr);

        boolean found = false;
        while (matcher.find()) {
        	System.out.format("\t%s : \"%s\"%n\tfound from " 
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
