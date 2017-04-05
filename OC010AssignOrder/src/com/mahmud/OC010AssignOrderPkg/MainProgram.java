/**
 * 
 */
package com.mahmud.OC010AssignOrderPkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	private class Date {

	}
	
	// private int j, k = m + 3, l, m = 1;
	// Compiler Error : Can not reference a field 
	// Before it is defined

	private int j,  l;
	private final int m = 1, k = m + 3;

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
		
		// int j, k = 1, l, m = l + 3;
		// Error : can not use uninitialized Value
		
		int j;
		final int k = 1, l = 0, m = l + 3;
		
		j = 100;
		if(args.length > 0 && args[0] != null){
			j = 50;
			// Compiler Error
			// j must be initialized before
		}
		System.out.println("\tsum = "
				+ (j + k + l + m));
		
		MainProgram x = new MainProgram();
		System.out.println("\tsum of fields = "
				+ (x.j + x.k + x.l + x.m));
		
		int a = (int) 77.0;
		double dbl = 'M';
		
		byte b = 3;
		b += 5;
		
		// b = b + 13;
		// b = b + (byte)13;
		// Compiler Error
		// Type mismatch: cannot convert from 
		// int to byte
		
		b = (byte) (b + 13);
		
		System.out.printf("\ta = %d, b = %d, dbl = %f%n",
				a, b, dbl);
		short s = new Short("77");
		
		if(s == dbl){
			System.out.printf("\t%d == %c%n",
					s, (char)dbl);
		}
		
		System.out.println();
		
		Date date;
		date = null;
		
		if(date == null) {
			System.out.println(
					"\tdate must be initialized as null");
		}
		
		String str1 = "Java";
		String str2 = str1;
		str1.toUpperCase();
		
		System.out.println("\tstr2 string = " + str2);
		if(str1 == str2){
			System.out.println(
					"\tstr1 and str2 have SAME reference");
		} else {
			System.out.println(
					"\tstr1 and str2 do NOT have same reference");
		}
		
		str1 += " Bean";
		
		System.out.println("\tstr2 string = " + str2);
		if(str1 == str2){
			System.out.println(
					"\tstr1 and str2 have SAME reference");
		} else {
			System.out.println(
					"\tstr1 and str2 do NOT have same reference");
		}
	}

}
