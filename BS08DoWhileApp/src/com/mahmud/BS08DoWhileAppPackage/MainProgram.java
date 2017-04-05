/**
 * 
 */
package com.mahmud.BS08DoWhileAppPackage;

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
		
		int count = 1;
        
		while (count < 11) {
            System.out.println("\tWhile : Count is: " + count);
            count++;
        }
		
		System.out.println();
		
        while (count < 11) {
            System.out.println("\tWhile : Count is: " + count);
            count++;
        }
		
        do {
            System.out.println("\tDo - While : Count is: " + count);
            count++;
        } while (count < 11);

	}

}
