/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Expresso extends Beverage {

	/**
	 * 
	 */
	public Expresso() {
		// TODO Auto-generated constructor stub
		super("Expresso");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.DecoratorApp1Package.classes.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
