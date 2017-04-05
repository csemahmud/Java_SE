/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class DarkRoast extends Beverage {

	/**
	 * 
	 */
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		super("DarkRoast");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.DecoratorApp1Package.classes.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
