/**
 * 
 */
package com.mahmud.DecoratorApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class Beverage {
	
	private final String description;

	/**
	 * @param description
	 */
	public Beverage(String description) {
		
		this.description = description;
	}

	/**
	 * 
	 */
	public Beverage() {
		// TODO Auto-generated constructor stub
		
		this("Unknown Beverage");
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tBeverage [description = ").append(description).append(";\n\tCost = ").append(getCost())
				.append("]");
		return builder.toString();
	}

}
