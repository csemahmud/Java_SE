/**
 * 
 */
package com.mahmud.IO08FormattingAppPackage;

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
		
		int intNum = 2;
        double sqrt = Math.sqrt(intNum);
        
        System.out.print("\tThe square root of ");
        System.out.print(intNum);
        System.out.print(" is ");
        System.out.print(sqrt);
        System.out.println(".");

        intNum = 5;
        sqrt = Math.sqrt(intNum);
        System.out.println("\tThe square root of " + intNum + " is " + sqrt + ".");
        
        intNum = 2;
        sqrt = Math.sqrt(sqrt);
        
        System.out.format("\tThe square root of %d is %f.%n", intNum, sqrt);
        
        System.out.format("\t%f, %1$+020.10f %n", Math.PI);
        System.out.format("\t%f, 12345678901234567890%n", Math.PI);
        
        System.out.format("\t%f, %<+020.10f %n", Math.PI);

	}

}
