/**
 * 
 */
package com.mahmud.OC004ConstructorsPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private final Double dbl;

	/**
	 * @param dbl
	 * @param intArray
	 * 
	 */
	private MainProgram(double dbl, int... intArray) {
		// TODO Auto-generated constructor stub
		System.out.println("\tprivate MainProgram(double x, int... y)");
		double sum = dbl;
		for (int i : intArray) {
			sum += i;
		}
		System.out.println("\tsum = " + sum);
		this.dbl = dbl;
	}
	
	// private MainProgram(int integer);
	// Illegal Must have body

	/**
	 * @param dbl
	 * 
	 */
	private MainProgram(double dbl) {
		// TODO Auto-generated constructor stub
		
		this(dbl, 1, 2, 3, 4, 5);
		System.out.println("\tprivate MainProgram(double dbl)");
	}

	/**
	 * 
	 */
	private MainProgram() {
		// TODO Auto-generated constructor stub
		
		// this.dbl = 0;
		// Compiler Error
		// Type mismatch: cannot convert 
		// from int to Double
		
		double dbl = 0;
		this.dbl = dbl;
	}
	
	/**
	 * 
	 */
//	private static MainProgram() {
//		// TODO Auto-generated constructor stub
//		
//		this(2.5, 1, 2, 3, 4, 5);
//		System.out.println("\tprivate MainProgram()");
//	}
	
	/**
	 * 
	 */
//	private final MainProgram() {
//		// TODO Auto-generated constructor stub
//		
//		this(2.5, 1, 2, 3, 4, 5);
//		System.out.println("\tprivate MainProgram()");
//	}
	
	/**
	 * 
	 */
//	private abstract MainProgram();
	
	// Invalid modifiers static, final, abstract

	/**
	 * 
	 */
	private MainProgram MainProgram() {
		// TODO Auto-generated constructor stub
		System.out.println(
				"\tprivate void MainProgram() dbl = " + dbl);
		return this;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		MainProgram x = new MainProgram(2.5);
		System.out.println("\tAfter Declaring Constructors .....");
		MainProgram y = x.MainProgram();
		y.MainProgram();
		
		System.out.println();
		
		if(y.equals(x)){
			System.out.println("\tx and y are EQUAL");
		} else {
			System.out.println("\tx and y are NOT equal");
		}
		
		y = new MainProgram();
		if(y.equals(x)){
			System.out.println("\tx and y are EQUAL");
		} else {
			System.out.println("\tx and y are NOT equal");
		}

	}

}
