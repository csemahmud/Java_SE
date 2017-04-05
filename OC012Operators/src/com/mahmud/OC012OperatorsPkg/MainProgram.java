/**
 * 
 */
package com.mahmud.OC012OperatorsPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	// private int a *= 2 + 5;
	// Compiler Error
	// Syntax error on token "*=", = expected
	
	private int a;

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
		
		a *= 2 + 5;
	}
	
	{
		a *= 2 + 5;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		// int x *= 2 + 5;
		// Compiler Error
		// Syntax error on token "*=", = expected
		
		int x, y, z;
		
		x = 0;
		
		x *= 2 + 5;
		// Compiler Error
		// The local variable x may not 
		// have been initialized
		
		y = 0;
		y = y * 2 + 5;
		
		z = 0;
		z = z * (2 + 5);
		
		MainProgram mainProgram = new MainProgram();
		
		System.out.printf(
				"\tx = %d, y = %d, z = %d, a = %d%n",
				x, y, z, mainProgram.a);
		
		System.out.println();
		
		boolean b = false;
		if(b = true) {
			System.out.printf("\tb = %b%n", true);
		} else {
			System.out.printf("\tb = %b%n", false);
		}
		
		System.out.println();
		
		final int num = 5;
		System.out.print("\t");
		System.out.println(3 + num + "" + num + 3);
		
		// num++;
		// Compiler Error
		// The final local variable num cannot be assigned. 
		// It must be blank and not using a compound assignment
		
		System.out.println();
		
		x = 2;
		y = 3;
		if((y == ++x)|(1 == y++ - x)){
			System.out.println("\tx = " + x + ", y = " + y);
		}
		
		x = 2;
		y = 3;
		if((y == ++x)||(1 == y++ - x)){
			System.out.println("\tx = " + x + ", y = " + y);
		}
	}

}
