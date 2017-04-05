/**
 * 
 */
package com.mahmud.RE08MethodsAppPackage;

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
		matchRegex("\\bdog\\b", "DoG DOg doggie dogg dog", "cat");
		System.out.println();
		matchRegex("\\bdog\\b", "DoG");
		System.out.println();
		matchRegex("\\bdog\\B", "DoG");
		System.out.println();
		matchRegex("a*b", "aabfooaabfooabfoob", "-");
		alternateReplaceAll("a*b", "aabfooaabfooabfoob", "-");
		System.out.println();
		splitString(":", "one:two:three:four:five");
		System.out.println();
		splitString("\\d", "six9seven4eight7nine1ten");

	}

	private static void splitString(String regex, String string) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile(regex);
        String[] items = pattern.split(string);
        int count = 0;
        for(String str : items) {
        	count++;
            System.out.print("\t[" + count + "]" + str + ";");
        }
	}

	private static void matchRegex(String regex, String searchStr, String replacement) {
		// TODO Auto-generated method stub
		
		Matcher matcher = matchRegex(regex, searchStr);
		searchStr = matcher.replaceAll(replacement);
		System.out.println("\tAfter Replacing by \"" 
						+ replacement + "\" => \"" 
						+ searchStr + "\"");
	}

	private static void alternateReplaceAll(String regex, String searchStr, String replacement) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(searchStr); // get a matcher object
		StringBuffer stringBuffer = new StringBuffer();
        while(matcher.find()){
        	matcher.appendReplacement(stringBuffer,replacement);
        }
        matcher.appendTail(stringBuffer);
        searchStr = stringBuffer.toString();
		System.out.println("\tReplacing \"" + regex 
				+ "\" by \"" + replacement + "\" => \"" 
				+ searchStr + "\"");
	}

	private static Matcher matchRegex(String regex, String searchStr) {
		// TODO Auto-generated method stub
		
		Pattern pattern =
	            Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = 
	            pattern.matcher(searchStr);

        boolean found = false;
        int count = 0;
        while (matcher.find()) {
        	count++;
        	System.out.format("\t[%d] %s : \"%s\" found start() = " 
        			+ "%d end() = %d in \"%s\".%n",
        			count,
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
        
    	System.out.println("\tlookingAt() = " + matcher.lookingAt()
		+ "; matches() = " + matcher.matches());
		
        return matcher;
	}

}
