/**
 * 
 */
package com.mahmud.OC014LogicalOprtrPkg;

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
		
		boolean b1 = false, b2 = false;
		boolean b3 = (b1 == true) && (b2 = true);
		System.out.printf("\t%b : %b%n", b3, b2);
		b1 = !b1;
		b3 = (b1 == true) && (b2 = true);
		System.out.printf("\t%b : %b%n", b3, b2);
		
		System.out.println();
		
		if(isItSmall(3) || isItSmall(7)){
			System.out.println("\tResult is true");
		}
		
		if(isItSmall(6) || isItSmall(9)){
			System.out.println("\tResult is true");
		}
		
		System.out.println();
		
		int z = 5;
		if(++z > 5 || ++z > 6){
			z++;
		}
		
		System.out.println("\tz = " + z);
		
		z = 5;
		if(++z > 5 | ++z > 6){
			z++;
		}
		
		System.out.println("\tz = " + z);
	}

	private static boolean isItSmall(int i) {
		// TODO Auto-generated method stub
		if(i < 5){
			System.out.println("\ti < 5");
			return true;
		}
		
		System.out.println("\ti >= 5");
		return false;
	}

}
