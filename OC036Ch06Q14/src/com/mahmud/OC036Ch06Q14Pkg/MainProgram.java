/**
 * 
 */
package com.mahmud.OC036Ch06Q14Pkg;

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
		@SuppressWarnings("unused")
		String[] sa = {"a", "bob"};
		@SuppressWarnings("unused")
		String s = "bob";
		final String s2 = "bob";
		final String s3 = "bob";
		@SuppressWarnings("unused")
		StringBuilder sb = new StringBuilder("bob");
		
		// switch (sa[1]) {
		// Valid
		
		switch ("b" + "ob") {
		
		// switch (sb.toString()) {
		// Valid
		
		// switch (sb) {
		// Compiler Error
		// Cannot switch on a value of type 
		// StringBuilder. Only convertible int values, 
		// strings or enum variables are permitted
		
		case "ann":
			System.out.println("\tI am ann");
			break;
			
//		case s:
//			System.out.println("\tI am " + s);
//			break;
			
		// Compiler Error
		// case expressions must be constant expressions
			
		case s2:
			System.out.println("\tI am " + s2);
			break;
			
//		case s3:
//			System.out.println("\tI am " + s3);
//			break;
			
			// Compiler Error
			// Duplicate case
		}
		
		if(s2 == s3){
			System.out.println("\ts2 == s3 : " 
					+ (s2 == s3));
		}
	}

}
