/**
 * 
 */
package com.mahmud.Ch01Q09Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Frodo extends Hobbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		int myGold = 7;
		
		// System.out.println(
				// "\t" + countGold(myGold, 6));
		
		// Compiler Error
		// Cannot make a static reference 
		// to the non-static method 
		// countGold(int, int) from the type Hobbit
		
		Hobbit x = new Frodo();
		System.out.println(
				"\t" + x.countGold(myGold, 6));
	}

}
