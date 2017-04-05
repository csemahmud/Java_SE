/**
 * 
 */
package com.mahmud.RE02SampleRegExAppPackage;

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
		matchRegex("foo", "foofoofoo");
		matchRegex("cat", "cats");
		matchRegex("[bcr]at", "cat");
		matchRegex("[bcr]at", "hat");
		matchRegex("[^bcr]at", "cat");
		matchRegex("[^bcr]at", "hat");
		matchRegex("[a-c]", "db");
		matchRegex("[a-c]", "dd");
		matchRegex("foo[1-5]", "foo1");
		matchRegex("foo[1-5]", "foo6");
		matchRegex("foo[^1-5]", "foo1");
		matchRegex("foo[^1-5]", "foo6");
		matchRegex("[0-4[6-8]]", "1");
		matchRegex("[0-4[6-8]]", "7");
		matchRegex("[0-4[6-8]]", "5");
		matchRegex("[0-6&&[4-8]]", "5");
		matchRegex("[0-6&&[4-8]]", "3");
		matchRegex("[0-6&&[4-8]]", "7");
		matchRegex("[0-6&&[^4-8]]", "5");
		matchRegex("[0-6&&[^4-8]]", "3");
		matchRegex("[0-6&&[^4-8]]", "7");

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
