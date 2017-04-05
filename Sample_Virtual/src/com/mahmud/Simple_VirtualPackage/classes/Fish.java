/**
 * 
 */
package com.mahmud.Simple_VirtualPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Fish extends Animal {

	/**
	 * 
	 */
	public Fish() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * In Java, all non-static methods are by default 
	 * "virtual functions." Only methods marked with the 
	 * keyword final, which cannot be overridden, along 
	 * with private methods, which are not inherited, 
	 * are non-virtual
	 */

	/* (non-Javadoc)
	 * @see com.mahmud.Simple_VirtualPackage.classes.Animal#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("\tI eat like a fish!");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.Simple_VirtualPackage.classes.IAnimal#breathe()
	 */
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("\tI breathe like a fish.");
	}
	
	public static void sleep(){
		System.out.println("\tI sleep like a fish.");
	}
}
