/**
 * 
 */
package com.mahmud.OC008InitPkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Init {
	
	private static final int [] integers = new int[4];

	/**
	 * @param x
	 */
	public Init(int x) {
		// TODO Auto-generated constructor stub
		
		System.out.println("\t1 - arg const x = " + x);
	}

	/**
	 * 
	 */
	public Init() {
		// TODO Auto-generated constructor stub
		
		System.out.println("\t0 - arg const");
	}
	
	static {		
		integers[3] = 1000;
		System.out.println(
				"\t1st static init . integers[3] = " + integers[3]);
	}
	
	{
		System.out.println("\t1st instance init .");
	}
	
	{
		System.out.println("\t2nd instance init .");
	}
	
	static {
		System.out.println("\t2nd static init .");
	}

}
