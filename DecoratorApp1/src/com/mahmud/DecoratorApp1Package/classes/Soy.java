/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Soy extends CondimentDecorator {
	
	private Beverage beverage;

	/**
	 * @param beverage
	 */
	public Soy(Beverage beverage) {
		super(beverage, "Soy");
		// TODO Auto-generated constructor stub
		
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.DecoratorApp1Package.classes.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.getCost();
	}

}
