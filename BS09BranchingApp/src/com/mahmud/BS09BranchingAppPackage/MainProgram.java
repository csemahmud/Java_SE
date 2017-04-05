/**
 * 
 */
package com.mahmud.BS09BranchingAppPackage;

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
		
		int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        int searchfor = 12;

	        int row;
	        int col = 0;
	        boolean foundIt = false;

	    search:
	        for (row = 0; row < arrayOfInts.length; row++) {
	            for (col = 0; col < arrayOfInts[row].length;
	            		col++) {
	                if (arrayOfInts[row][col] == searchfor) {
	                    foundIt = true;
	                    break search;
	                }
	            }
	        }

	        if (foundIt) {
	            System.out.println("\tFound " + searchfor 
	            		+ " at " + row + ", " + col);
	        } else {
	            System.out.println("\t" + searchfor 
	            		+ " not in the array");
	        }
	        
	        System.out.println();
	        
	        String searchMe = "peter piper picked a " 
	        		+ "peck of pickled peppers";
	        int max = searchMe.length();
	        int numPs = 0;

	        for (int i = 0; i < max; i++) {
	            // interested only in p's
	            if (searchMe.charAt(i) != 'p') {
	                continue;
	            }

	            // process p's
	            numPs++;
	        }
	        System.out.println("\tFound " + numPs 
	        		+ " p's in the string.");
	        
	        System.out.println();
	        
	        searchMe = "Look for a substring in me";
	        String substring = "sub";
	        foundIt = false;

	        max = searchMe.length() - 
	                  substring.length();
	        
	        int i = 0;
	    test:
	        for (i = 0; i <= max; i++) {
	            int n = substring.length();
	            int j = i;
	            int k = 0;
	            while (n-- != 0) {
	                if (searchMe.charAt(j++) != substring.charAt(k++)) {
	                    continue test;
	                }
	            }
	            foundIt = true;
	                break test;
	        }
	        System.out.println(foundIt ? 
	        		"\tFound it at position : " + i : "Didn't find it");
	        
	        System.out.println();
	        
	        outer:
	        	for(;;) {
	        		System.out.println("\tBefore While");
	        		while(true){
	        			System.out.println("\tInside While");
	        			break outer;
	        		}
//	        		System.out.println(
//	        				"\tThis will never be printed");
	        		
	        		// Compiler Error
	        		// Unreachable code
	        	}
	        
	        System.out.println("\tOut side for");
	        
	        System.out.println();
	        
	        outer:
	        	for(i = 0;i < 3; i++) {
	        		System.out.println("\tBefore While");
	        		while(true){
	        			System.out.println("\tInside While");
	        			continue outer;
	        		}
//	        		System.out.println(
//	        				"\tThis will never be printed");
	        		
	        		// Compiler Error
	        		// Unreachable code
	        	}
	        
	        System.out.println("\tOut side for");

	}

}
