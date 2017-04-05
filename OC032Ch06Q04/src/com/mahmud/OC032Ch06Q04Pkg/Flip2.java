/**
 * 
 */
package com.mahmud.OC032Ch06Q04Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Flip2 {

	/**
	 * 
	 */
	public Flip2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param $
	 */
	public static void main(String... $) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		final String[] args 
			= { "RED", "Green", "YeLLow" };
		String o = "-";
		String[] sa = new String[4];
		for(int i = 0; i < args.length; i++)
			sa[i] = args[i];
		try {
			
			for (String string : sa) {
				switch(string.toLowerCase()){
				case "yellow":
					 o += "y";
				case "red":
					o += "r";
				case "green":
					o += "g";
				}
			}
			
		} catch (NullPointerException ex) {
			// TODO: handle exception
			
			System.err.println("\t" + ex 
					+ "\n\t" + ex.getMessage() + "\n");
		} finally {
			System.out.println("\t" + o);
		}
		
	}

}
