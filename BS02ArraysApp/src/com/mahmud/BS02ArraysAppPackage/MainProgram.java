/**
 * 
 */
package com.mahmud.BS02ArraysAppPackage;

import java.util.Arrays;

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
		
		String[][] names = {
	            {"Mr. ", "Mrs. ", "Ms. "},
	            {"Smith", "Jones"}
	        };
	        // Mr. Smith
	        System.out.println("\t" + names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println("\t" + names[0][2] + names[1][1]);
	        
	        // int[] intArray = new int[3]{1, 2, 3};
	        // Compiler Error
	        // Cannot define dimension expressions 
	        // when an array initializer is provided
	        
	        char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				    'h', 'i', 'j', 'k', 'l', 'm' };
	        char copyTo[] = new char[10];

	        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
	        
	        System.out.println("\tcopyTo = " + new String(copyTo));
	        
	        char[] copyfrom = { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 
	        		'r', 'q', 'p', 'o', 'n'};

	        System.arraycopy(copyfrom, 3, copyTo, 5, 5);
	        
	        System.out.println("\tcopyTo = " + new String(copyTo));
	        
	        copyTo = Arrays.copyOfRange(copyFrom, 3, 10);
	        
	        System.out.println("\tcopyTo = " + new String(copyTo));
	        
	        System.out.println();
	        
	        final short s41 = 41;
	        final byte b42 = 42;
	        int[][] numbers = {
	        		{11, 12, 'a'},
	        		{21, 'b', 23},
	        		{'c', 32, 33},
	        		{s41, b42, 43}
	        		};
	        
	        int[][] copyNum = new int[4][3];
	        int[][] result = copyFunction(numbers, copyNum);
	        
	        System.out.println("\tcopyNum = [");
	        int counter = 0;
	        for (int[] numArray : copyNum) {
				System.out.print("\t" + Arrays.toString(numArray));
				counter++;
				if(counter < copyNum.length){
					System.out.println(",");
				}
			}
	        System.out.println();
	        System.out.println("\t]");
	        
	        System.out.println("\tresult = [");
	        counter = 0;
	        for (int[] numArray : result) {
				System.out.print("\t" + Arrays.toString(numArray));
				counter++;
				if(counter < copyNum.length){
					System.out.println(",");
				}
			}
	        System.out.println();
	        System.out.println("\t]");
	        
	        replaceElement(copyNum, 3, 2, 2000);
	        System.out.println();
	        System.out.println("\tcopyNum[3][2] = " + copyNum[3][2]);
	        System.out.println("\tresult[3][2] = " + result[3][2]);
	        
//	        System.out.println(
//					"\tcopyTo[1.0] = " + copyTo[1.0]);
	        // Compiler Error
	        // Type mismatch: cannot convert from 
	        // double to int
	        
	        try {
				System.out.println(
						"\tcopyTo[-1] = " + copyTo[-1]);
			} catch (IndexOutOfBoundsException ex) {
				// TODO: handle exception
				
				System.err.println("\n\tIndex : " 
						+ ex.getMessage() 
						+ " is out of bounds");
			}
	        
//	        char[] charArray = {'a', 'b', 'c'};
//	        numbers[1] = charArray;
	        
	        // Compiler Error 
	        // Type mismatch: cannot convert 
	        // from char[] to int[]
	}

	private static void replaceElement(int[][] copyNum, 
			int row, int column, int newElement) {
		// TODO Auto-generated method stub
		
		copyNum[row][column] = newElement;
	}

	private static int[][] copyFunction(
			int[][] numbers, int[][] copyNum) {
		// TODO Auto-generated method stub
		
		System.arraycopy(numbers, 0, copyNum, 0, 4);
		return copyNum;
	}

}
