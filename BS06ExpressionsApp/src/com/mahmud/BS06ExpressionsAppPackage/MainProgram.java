/**
 * 
 */
package com.mahmud.BS06ExpressionsAppPackage;

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
		
		int a = 5;
		int b = -3;
		int c = 26;
		int d = 10;
		int e = 100;
		double f = 13;
		double g = 10;
		
		int result = (int) (a+-b+c*d/e-f%g);
		System.out.printf("\t%d + -(%d) + %d*%d/%d - %.0f%s%.0f = %d",
				a, b, c, d, e, f, "%", g, result);

	}

}
