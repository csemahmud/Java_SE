/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Whip extends CondimentDecorator {
	
	private Beverage beverage;

	/**
	 * @param beverage
	 */
	public Whip(Beverage beverage) {
		super(beverage, "Whip");
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.DecoratorApp1Package.classes.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.10 + beverage.getCost();
	}

}
