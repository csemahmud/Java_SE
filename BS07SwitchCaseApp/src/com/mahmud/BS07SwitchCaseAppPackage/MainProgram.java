/**
 * 
 */
package com.mahmud.BS07SwitchCaseAppPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		
		List<String> futureMonths = new ArrayList<>();
		
		int currentMonth = 1;

		switch (currentMonth) {
	        case 1:  futureMonths.add("January");
	        case 2:  futureMonths.add("February");
	        case 3:  futureMonths.add("March");
	        case 4:  futureMonths.add("April");
	        case 5:  futureMonths.add("May");
	        case 6:  futureMonths.add("June");
	        case 7:  futureMonths.add("July");
	        case 8:  futureMonths.add("August");
	        case 9:  futureMonths.add("September");
	        case 10: futureMonths.add("October");
	        case 11: futureMonths.add("November");
	        case 12: futureMonths.add("December");
	                 break;
	        default: break;
		}
		
		System.out.println("\tFuture Months wuth days : ");
		
		int year = 2000 + new Random().nextInt(21);
		
		for (String month : futureMonths) {
			switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
            	System.out.println("\t"
            			+ month + " has 31 days");
            	break;
            case "april":
            case "june":
            case "september":
            case "november":
            	System.out.println("\t"
            			+ month + " has 30 days");
            	break;
            case "february":
                if (((year % 4 == 0) && 
                        !(year % 100 == 0))
                        || (year % 400 == 0)) {
                	System.out.println("\t"
                			+ month + " has 29 days in " + year);
                } else {
                	System.out.println("\t"
                			+ month + " has 28 days in " + year);
                }
                break;
            default: 
            	System.out.println("\tInvalid Month !!!");
                break;
			}
		}

	}

}
