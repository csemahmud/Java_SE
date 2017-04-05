/**
 * 
 */
package com.mahmud.RE05NTimePatrnAppPackage;

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
		matchRegex("a{3}", "aa");
		matchRegex("a{3}", "aaa");
		matchRegex("a{3}", "aaaa");
		matchRegex("a{3}", "aaaaaaaaa");
		matchRegex("a{3,}", "aaaaaaaaa");
		matchRegex("a{3,6}", "aaaaaaaaa");
		matchRegex("(dog){3}", "dogdogdogdogdogdog");
		matchRegex("dog{3}", "dogdogdogdogdogdog");
		matchRegex("[abc]{3}", "abccabaaaccbbbc");
		matchRegex("abc{3}", "abccabaaaccbbbc");
		matchRegex(".*?foo", "xfooxxxxxxfoo");
		matchRegex(".*+foo", "xfooxxxxxxfoo");

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
