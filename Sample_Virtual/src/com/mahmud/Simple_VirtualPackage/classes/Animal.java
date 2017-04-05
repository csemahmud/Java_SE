/**
 * 
 */
package com.mahmud.Simple_VirtualPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Animal implements IAnimal {

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.Simple_VirtualPackage.classes.IAnimal#eat()
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("\tI eat like a generic Animal.");

	}

}
