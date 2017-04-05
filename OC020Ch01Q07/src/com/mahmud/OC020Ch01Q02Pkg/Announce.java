/**
 * 
 */
package com.mahmud.OC020Ch01Q02Pkg;

import java.util.Arrays;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Announce {

	/**
	 * 
	 */
	public Announce() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		int y = 0;
		for(int __x = 0; __x < 3; y = __x++);
		System.out.println("\ty = " + y);
		
		// int #lb = 7;
		// Compiler Error
		// Syntax error on token "Invalid Character"
		
		// long [] x [5];
		// Compiler Error
		// Syntax error on token "5"
		
		Boolean []ba[] = new Boolean[3][2];
		
		for(int i = 0; i < ba.length; i++) {
			for(int j = 0; j < ba[i].length; j++){
				ba[i][j] = (i + j) % 2 == 0;
			}
		}
		
		for (Boolean[] booleans : ba) {
			System.out.println(
					"\t" + Arrays.toString(booleans));
		}
	}

}
