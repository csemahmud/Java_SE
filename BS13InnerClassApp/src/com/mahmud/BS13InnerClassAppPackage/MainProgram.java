/**
 * 
 */
package com.mahmud.BS13InnerClassAppPackage;

import java.util.Iterator;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
    
    // Create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
	}
    
    public void printEven() {
        
        // Print out values of even indices of the array
    	DataStructureIterator iterator = new EvenIterator();
    	// DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    private interface DataStructureIterator extends Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            int returnValue = arrayOfInts[nextIndex];
            // Auto Boxing
            // Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            
            return returnValue;
            
            // Auto Boxing
            // return Integer.valueOf(returnValue);
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        // Fill the array with integer values and print out only
        // values of even indices
		
		System.out.println("\n\n");
		System.out.print("\t");
		
        MainProgram x = new MainProgram();
        x.printEven();

	}

}
