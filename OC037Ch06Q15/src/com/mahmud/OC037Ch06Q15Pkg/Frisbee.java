/**
 * 
 */
package com.mahmud.OC037Ch06Q15Pkg;

// import java.io.IOException;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Frisbee {

	/**
	 * 
	 */
	public Frisbee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
			// throws Exception
			// valid
	
			// throws IOException
			// Compiler Error
			// IOException cannot be resolved to a type
			// Must Import 'IOException' (java.io)
	
			// throws RuntimeException
			// valid
	{
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		int x = 0;
		System.out.println("\t" + 10/x);
		
		// throw new Exception();
		// Compiler Error
		// Unhandled exception type Exception
		// Must Add throws declaration
		// or surround with try/catch
		
		throw new RuntimeException();
		// valid
		
	}

}
