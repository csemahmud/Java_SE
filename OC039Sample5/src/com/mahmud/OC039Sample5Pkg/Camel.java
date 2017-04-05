/**
 * 
 */
package com.mahmud.OC039Sample5Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Camel implements Rideable {
	
	int weight = 2;

	/**
	 * 
	 */
	public Camel() {
		// TODO Auto-generated constructor stub
	}

//	/* (non-Javadoc)
//	 * @see com.mahmud.OC039Sample5Pkg.Rideable#getGait()
//	 */
//	@Override
//	String getGait() {
//		// TODO Auto-generated method stub
//		
//		return " mph, lope";
//	}
	
	// Compilation Error
	// getGait() must be public
	// Cannot reduce the visibility of 
	// the inherited method from Rideable
	
	/* (non-Javadoc)
	 * @see com.mahmud.OC039Sample5Pkg.Rideable#getGait()
	 */
	@Override
	public String getGait() {
		// TODO Auto-generated method stub
		
		return " mph, lope";
	}	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new Camel().go(8);
	}

	private void go(int speed) {
		// TODO Auto-generated method stub
		
		++speed; weight++; 
		int walkrate = speed * weight; 
		System.out.println("\t" + walkrate + getGait());
	}

}
