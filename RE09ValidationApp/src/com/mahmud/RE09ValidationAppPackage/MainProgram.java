/**
 * 
 */
package com.mahmud.RE09ValidationAppPackage;

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
		matchRegex("[A-Z][a-zA-Z]*", "Iliena", "First Name");
		matchRegex("[a-zA-Z]+([ '-][a-zA-Z]+)*", "D'Cruz", "Last Name");
		matchRegex("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)", 
				"123 Some Street", "Address");
		matchRegex("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)", 
				"Some City", "City");
		matchRegex("\\d{5}", "123", "ZIP");
		matchRegex("\\d{5}", "12345", "ZIP");
		matchRegex("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}", 
				"123-456-7890", "Phone");

	}

	private static void matchRegex(
			String regex, String searchStr, String validationType) {
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
		if(searchStr.matches(regex)) {
			System.out.println("\tValid : " + validationType);
		} else {
			System.out.println("\tInValid : " + validationType);
		}
	}

}
