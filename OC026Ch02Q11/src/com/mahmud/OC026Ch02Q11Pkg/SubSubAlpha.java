/**
 * 
 */
package com.mahmud.OC026Ch02Q11Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class SubSubAlpha extends Alpha {

	/**
	 * 
	 */
	private SubSubAlpha() {
		// TODO Auto-generated constructor stub
		
		s += "subsub ";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new SubSubAlpha();
		System.out.println("\ts = " + s);
		
		// Alpha alpha = new SubAlpha();
		// Compiler Error
		// The constructor SubAlpha() is not visible
	}

}
