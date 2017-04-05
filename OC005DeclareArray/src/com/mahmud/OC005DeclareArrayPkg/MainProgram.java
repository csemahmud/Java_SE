/**
 * 
 */
package com.mahmud.OC005DeclareArrayPkg;

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
		
		int matrix[][] = new int[5][3];
		
		for(int row = 0, counter = 0; row < 5; row++){
			for(int column = 0; column < 3; column++){
				matrix[row][column] = ++counter;
			}
		}
		
		int[] anotherMatrix [] = matrix;
		
		for (int[] integers : anotherMatrix) {
			System.out.println("\t" 
					+ Arrays.toString(integers));
		}

	}

}
