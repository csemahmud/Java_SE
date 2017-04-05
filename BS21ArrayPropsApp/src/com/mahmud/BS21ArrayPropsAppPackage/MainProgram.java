/**
 * 
 */
package com.mahmud.BS21ArrayPropsAppPackage;

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
		
		double[] doubleArray 
						= { 8.4, 9.3, 0.2, -7.9, 3.4 };
		System.out.println("\tdoubleArray : "
				+ Arrays.toString(doubleArray));
		Arrays.sort(doubleArray);
		System.out.println("\tAfter Sorting,");
		System.out.println("\tdoubleArray : "
				+ Arrays.toString(doubleArray));
		int filledIntArray[] = new int[10];
		Arrays.fill(filledIntArray, 7);
		System.out.println("\tfilledIntArray : "
				+ Arrays.toString(filledIntArray));
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int intArrayCopy[] = new int[intArray.length];
		System.arraycopy(intArray, 0, 
				intArrayCopy, 0, intArray.length);
		System.out.println("\tintArray : "
				+ Arrays.toString(intArray));
		System.out.println("\tintArrayCopy : "
				+ Arrays.toString(intArrayCopy));
		
		System.out.println();
		
		boolean isEqual = Arrays.equals(
				intArray, intArrayCopy);
		System.out.printf("\tintArray %s intArrayCopy%n", 
				isEqual ? "==" : "!=");
		
		isEqual = Arrays.equals(
				intArray, filledIntArray);
		System.out.printf(
				"\tintArray %s filledIntArray%n", 
				isEqual ? "==" : "!=");
		
		int location = Arrays.binarySearch(intArray, 5);
		if(location >= 0) {
			System.out.println("\t5 was Found at index "
					+ location + " in intArray .");
		} else {
			System.out.println(
					"\t5 was not found in intArray .");
		}
		
		location = Arrays.binarySearch(intArray, 9876);
		if(location >= 0) {
			System.out.println(
					"\t9876 was Found at index "
					+ location + " in intArray .");
		} else {
			System.out.println(
					"\t9876 was not found in intArray .");
		}
	}

}
