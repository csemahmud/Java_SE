/**
 * 
 */
package com.mahmud.OC031Ch06Q03Pkg;

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
		try {
			
			int x = Integer.parseInt("two");
			System.out.println("\tx = " + x);
			
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			System.err.println(
			"\tNumberFormatException is instance of "
			+ "IllegalArgumentException : "
			+ (ex instanceof IllegalArgumentException));
			
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			
		} catch (RuntimeException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			
		}
		
		try {
			
			int x = Integer.parseInt("two");
			System.out.println("\tx = " + x);
			
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\tCaught by, IllegalArgumentException");
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());

			System.err.println(
			"\tNumberFormatException is instance of "
			+ "RuntimeException : "
			+ (ex instanceof RuntimeException));
			
		} 
		
//		catch (NumberFormatException ex) {
//			// TODO: handle exception
//			
//			System.err.println(
//					"\t" + ex + " : " + ex.getMessage());
//			
//		}	
		
		// Compiler Error
		// Unreachable catch block for 
		// NumberFormatException. 
		// It is already handled by the catch block 
		// for IllegalArgumentException

		System.err.println("\n\n");
		try {
			
			int x = 10 / 0;
			System.out.println("\tx = " + x);
			
		} catch (ArithmeticException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			System.err.println(
			"\tArithmeticException is instance of "
			+ "RuntimeException : "
			+ (ex instanceof RuntimeException));
			
		} catch (RuntimeException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			
		}

		try {
			
			int x = 10 / 0;
			System.out.println("\tx = " + x);
			
		} catch (RuntimeException ex) {
			// TODO: handle exception
			
			System.err.println(
					"\tCaught by, RuntimeException");
			System.err.println(
					"\t" + ex + " : " + ex.getMessage());
			
		}
	}

}
