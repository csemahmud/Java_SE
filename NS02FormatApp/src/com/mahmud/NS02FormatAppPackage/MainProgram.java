/**
 * 
 */
package com.mahmud.NS02FormatAppPackage;

import java.text.DecimalFormat;
import java.util.Calendar;
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
		
		Float floatVar = 10.5f;
		Integer intVar = 10;
		String stringVar = "\"Ten\"";
		
		System.out.format(Locale.FRANCE,
			    "\tThe value of the float " 
	    		+ "variable is %f,%n\twhile the " +
			    "value of the integer variable " 
	    		+ "is %d,%n\tand the string is %s%n%n", 
			    floatVar, intVar, stringVar);
		
		long numLong = 461012;
		System.out.format("\tnumLong = %d%n", numLong);       //  -->  "461012"
		System.out.format("\tnumLong = %09d%n", numLong);     //  -->  "000461012"
		System.out.format("\tnumLong = %+9d%n", numLong);     //  -->  "  +461012"
		System.out.format("\tnumLong = %,9d%n", numLong);     //  -->  "  461,012"
		System.out.format("\tnumLong = %+,09d%n%n", numLong); //  -->  "+0461,012"
	     
		double pi1000 = Math.PI * 1000;
	
		System.out.format("\tpi * 1000 = %f;%n", pi1000);         // -->  "3141.592654"
		System.out.format("\tpi * 1000 = %.3f;%n", pi1000);       // -->  "3141.593"
		System.out.format("\tpi * 1000 = %15.3f;%n", pi1000);     // -->  "       3141.593"
		System.out.format("\tpi * 1000 = %-15.3f;%n", pi1000);    // -->  "3141.593       "
		System.out.format("\tpi * 1000 = %+,-15.3f;%n", pi1000);  // -->  "+3,141.593     "
		System.out.format(Locale.FRANCE,
				"\tpi * 1000 = %+,-15.3f;%n%n", pi1000);          // -->  "+3 141,593     "
	
		Calendar calendar = Calendar.getInstance();
		System.out.format("\t%tB %te, %tY%n", 
				calendar, calendar, calendar); // -->  "May 29, 2006"
	
		System.out.format("\t%tl:%tM %tp%n", 
				calendar, calendar, calendar);  // -->  "2:34 pm"
	
		System.out.format("\t%tH:%tM%n", 
				calendar, calendar, calendar);  // -->  "14:34"
	
		System.out.format("\t%tD%n%n", calendar);    // -->  "05/29/06"
		
		customFormat("#,#,#,#,##.###", 123456.789);
		customFormat("#####,#.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);

	}

	private static void customFormat(String pattern, double value) {
		// TODO Auto-generated method stub
		
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println("\t" + value + "  " + pattern + "  " + output);
	}

}
