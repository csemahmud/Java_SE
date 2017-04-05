/**
 * 
 */
package com.mahmud.RE01TestHarnessApp;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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
		
		Console console = System.console();
        if (console == null) {
            System.err.println("\tNo console.");
        }
        
        try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("\n\tEnter your regex: ");
			Pattern pattern =
            Pattern.compile(scanner.nextLine());
            
			System.out.print("\n\tEnter input string to search: ");
			Matcher matcher = 
            pattern.matcher(scanner.nextLine());
            
            System.out.println();

            boolean found = false;
            while (matcher.find()) {
            	System.out.format("\tI found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
            	System.out.format("\tNo match found.%n");
            }
		} catch(PatternSyntaxException pse){
			System.err.format("\n\tThere is a problem" +
                           " with the regular expression!%n");
			System.err.format("\tThe pattern in question is: %s%n",
                           pse.getPattern());
			System.err.format("\tThe description is: %s%n",
                           pse.getDescription());
			System.err.format("\tThe message is: %s%n",
                           pse.getMessage());
			System.err.format("\tThe index is: %s%n",
                           pse.getIndex());
            System.exit(0);
        } catch (Exception ex) {
			// TODO: handle exception
			
			ex.printStackTrace();
		}

	}

}
