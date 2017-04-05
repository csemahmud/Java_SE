/**
 * 
 */
package com.mahmud.AdapterApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class WildTurkey implements ITurkey {

	/**
	 * 
	 */
	public WildTurkey() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AdapterApp1Package.classes.ITurkey#gobble()
	 */
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		
		System.out.print("Gobble Gobble");

	}

	/* (non-Javadoc)
	 * @see com.mahmud.AdapterApp1Package.classes.ITurkey#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.print("Flying .....");

	}

}
