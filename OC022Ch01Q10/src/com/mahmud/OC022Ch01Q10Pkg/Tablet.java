/**
 * 
 */
package com.mahmud.OC022Ch01Q10Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Tablet extends Electronic implements Gadget {

//	/* (non-Javadoc)
//	 * @see com.mahmud.OC022Ch01Q10Pkg.Gadget#doStuff()
//	 */
//	@Override
//	void doStuff() {
//		// TODO Auto-generated method stub
//
//		System.out.print("\tshow book ");
//	}
	
	// Compiler Error
	// Cannot reduce the visibility 
	// of the inherited method from Gadget
	
	/* (non-Javadoc)
	 * @see com.mahmud.OC022Ch01Q10Pkg.Gadget#doStuff()
	 */
	@Override
	public void doStuff() {
		// TODO Auto-generated method stub

		System.out.print("\tshow book ");
	}

	// void doStuff() must be public
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new Tablet().getPower();
		new Tablet().doStuff();
	}

}
