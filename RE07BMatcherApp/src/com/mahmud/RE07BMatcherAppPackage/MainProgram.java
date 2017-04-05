/**
 * 
 */
package com.mahmud.RE07BMatcherAppPackage;

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
		matchRegex("(\\d\\d)\\1", "1212");
		matchRegex("(\\d\\d)\\1", "1234");
		matchRegex("^dog$", "dog");
		matchRegex("^dog$", "dog       ");
		matchRegex("^dog$", "       dog");
		matchRegex("\\s*dog$", "       dog");
		matchRegex("^dog\\w*", "dogblahblah");
		matchRegex("\\bdog\\b", "The dog plays in the yard");
		matchRegex("\\bdog\\b", "The doggie plays in the yard");
		matchRegex("\\bdog\\B", "The dog plays in the yard");
		matchRegex("\\bdog\\B", "The doggie plays in the yard");
		matchRegex("dog", "dog dog");
		matchRegex("\\Gdog", "dog dog");
		matchRegex("\\Gdog", " dog dog");
		matchRegex("(?i)foo", "FOOfooFoOfoO");

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
