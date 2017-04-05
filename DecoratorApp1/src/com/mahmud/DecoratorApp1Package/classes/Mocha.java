/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;

	/**
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		super(beverage, "Mocha");
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.DecoratorApp1Package.classes.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.getCost();
	}

}
