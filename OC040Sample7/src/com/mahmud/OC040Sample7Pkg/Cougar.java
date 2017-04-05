/**
 * 
 */
package com.mahmud.OC040Sample7Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Cougar extends Feline {

	/**
	 * 
	 */
	public Cougar() {
		// TODO Auto-generated constructor stub
		
		System.out.print("cougar ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		new Cougar().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		

		type = "c ";
		String type = "lc ";
		System.out.print(this.type + super.type + type);
	}

}
