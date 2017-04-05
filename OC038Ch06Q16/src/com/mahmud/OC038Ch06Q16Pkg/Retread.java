/**
 * 
 */
package com.mahmud.OC038Ch06Q16Pkg;

import java.util.Random;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Retread extends Tire {

	/**
	 * 
	 */
	public Retread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		try {
			
			new Retread().doStuff();
			
		} catch (ArithmeticException | NullPointerException ex) {
			// TODO: handle exception
			
			if(ex instanceof RuntimeException) {
				System.err.println("\tRuntimeException");
			}
			
			if(ex instanceof NullPointerException) {
				System.err.println("\tNullPointerException");
			}
			
			if(ex instanceof ArithmeticException) {
				System.err.println("\tArithmeticException");
			}
		}
		
		System.out.println("\tException handled successfully");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC038Ch06Q16Pkg.Tire#doStuff()
	 */
	@SuppressWarnings("null")
	@Override
	void doStuff() 
	// throws MyExceprion
	// Compilation Error
	// Exception MyExceprion is not compatible 
	// with throws clause in Tire.doStuff()
	throws RuntimeException, 
		ArithmeticException,
		NullPointerException
	{
		// TODO Auto-generated method stub
		switch(new Random().nextInt(2)){
		case 0:
			System.out.println("\t" + 3/0);
		case 1:
			String string = null;
			System.out.println(
					"\t" + string.toLowerCase());
		}
	}

}
