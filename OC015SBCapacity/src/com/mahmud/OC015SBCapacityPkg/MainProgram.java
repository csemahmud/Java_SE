/**
 * 
 */
package com.mahmud.OC015SBCapacityPkg;

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
		
		String arg = "abc".concat("def")
				.toUpperCase().replace('C', 'x');
		StringBuilder stringBuilder
			= new StringBuilder(arg);
		
		System.out.println("\tstringBuilder = "
				+ stringBuilder);
		System.out.println("\tstringBuilder.capacity() = "
				+ stringBuilder.capacity());
		System.out.println("\targ.length() = "
				+ arg.length());
		System.out.printf("\t%d + 16 = %d%n",
				arg.length(),
				stringBuilder.capacity());
		
//		StringBuilder sb2
//			= stringBuilder.append(1234567890123456);
		
		// Compiler Error
		// The literal 1234567890123456 
		// of type int is out of range 
		
		StringBuilder sb2 
			= stringBuilder.append(1234567890123456L);
		
		System.out.println("\tstringBuilder = "
				+ stringBuilder);
		System.out.println("\tstringBuilder.capacity() = "
				+ stringBuilder.capacity());
		System.out.println("\tsb2 = " + sb2);
		
		System.out.println();
		stringBuilder.append(7);
		
		System.out.println("\tAfter append 7,");
		System.out.println("\tstringBuilder = "
				+ stringBuilder);
		System.out.println("\tstringBuilder.capacity() = "
				+ stringBuilder.capacity());
		System.out.println("\tsb2 = " + sb2);
	}

}
