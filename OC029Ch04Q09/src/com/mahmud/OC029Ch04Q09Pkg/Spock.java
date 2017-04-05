/**
 * 
 */
package com.mahmud.OC029Ch04Q09Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Spock {

	/**
	 * 
	 */
	public Spock() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		int mask = 0;
		int count = 0;
		if(((5 < 7) || (++count < 10)) | mask++ < 10)
			mask += 1;
		if((6 < 8) ^ false)
			mask += 10;
		if(!(mask > 1) && ++count > 1)
			mask += 100;
		
		System.out.println("\t" + mask + " " + count);
		System.out.println("\tfalse ^ false = " 
				+ (false ^ false));
		System.out.println("\tfalse ^ true = " 
				+ (false ^ true));
		System.out.println("\ttrue ^ false = " 
				+ (true ^ false));
		System.out.println("\ttrue ^ true = " 
				+ (true ^ true));
	}

}
