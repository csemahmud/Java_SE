/**
 * 
 */
package com.mahmud.OC024Ch02Q02Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Bottom2 extends Top {

	/**
	 * @param str
	 */
	public Bottom2(String str) {
		super(str);
		// TODO Auto-generated constructor stub
		
		// super(str) must be declared
		// without this, Compiler Error
		// Implicit super constructor Top() is undefined. 
		// Must explicitly invoke another constructor
		
		System.out.println("\tD");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new Bottom2("C");
		System.out.println(" ");
	}

}
