/**
 * 
 */
package com.mahmud.OC041Whiz08Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	static int x;
	
	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param $
	 */
	public static void main(String... $) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		System.out.println(
				"\tCalling Main(String[] args) ");
		
		MainProgram.Main($);
		
		System.out.println(
				"\tAfter Main(String[] args) ");
		
		System.out.println();
		
		System.out.print("\t");
		
//		for(int $ = 'Z'; x  < $; $--){
//			System.out.printf("%c ", $);
//			if(($ + 'Z' + 1) % 26 == 0){
//				System.out.println();
//				System.out.printf("\t");
//			}
//		} 
		
		// Compiler Error
		// Duplicate local variable $ 
		
		for(int $_ = 'Z'; x  < $_; $_--){
			System.out.printf("%c ", $_);
			if(($_ + 'Z' + 1) % 26 == 0){
				System.out.println();
				System.out.printf("\t");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void Main(String[] args){
		
		System.out.println(
				"\tMessage from Main(String[] args)");
		
	}

}
