/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class CondimentDecorator extends Beverage {

	/**
	 * @param beverage
	 * @param condimentName
	 */
	public CondimentDecorator(Beverage beverage, String condimentName) {
		super((((beverage.getDescription().equals("Expresso"))
				||(beverage.getDescription().equals("DarkRoast"))
				||(beverage.getDescription().equals("HouseBlend"))) 
				? beverage.getDescription() + " Coffee" : beverage.getDescription())
				+ ", " + condimentName);
		// TODO Auto-generated constructor stub
	}

}
