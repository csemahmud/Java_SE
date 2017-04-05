/**
 * 
 */
package com.mahmud.EX01IndexOutAppPackage.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ListOfNumbers {
	
	private final List<Long> oddFibonacciPrimeList;
    private final int SIZE;

	/**
	 * @param size
	 */
	public ListOfNumbers(int size) {
		super();
		SIZE = size;
		
		oddFibonacciPrimeList = new ArrayList<>(SIZE);
		
	    long ofpNum1 = 3, ofpNum2 = 5, ofpNum3;
	    boolean isPrime;
	    if(SIZE>=2) {
	    	oddFibonacciPrimeList.add(ofpNum1);
	    	oddFibonacciPrimeList.add(ofpNum2);
	    } else if(SIZE==1) {
	    	oddFibonacciPrimeList.add(ofpNum1);
	    }
	    
		int count = 2;
	    while(count < SIZE) {
	        ofpNum3 = ofpNum1 + ofpNum2;
	        isPrime = true;
	        if(ofpNum3%2 == 0) {
	           isPrime = false;
	        } else {
	            for(long i = 3; i <= Math.sqrt((double)ofpNum3); i+=2) {
	                if(ofpNum3%i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        if(isPrime) {
	        	oddFibonacciPrimeList.add(ofpNum3);
	            count++;
	        }
	        ofpNum1 = ofpNum2;
	        ofpNum2 = ofpNum3;
	    }
	}

	/**
	 * 
	 */
	public ListOfNumbers() {
		// TODO Auto-generated constructor stub
		
		this(11);
	}

    public void writeList(String pathFileStr) throws SQLException, IOException {
	// The FileWriter constructor throws IOException, which must be caught.
    	
    	PrintWriter out = null;
        try {
        	
            System.out.println("\tEntered try statement .....");
            out = new PrintWriter(new FileWriter(pathFileStr));
            for (int i = 0; i <= SIZE; i++) {
                out.println("Value at: " + i + " = " 
                		+ oddFibonacciPrimeList.get(i));
            }
            
        } finally {
            if (out != null) { 
                System.out.println("\tClosing PrintWriter");
                out.close(); 
            } else { 
                System.out.println("\tPrintWriter not open");
            } 
        }
    }

}
