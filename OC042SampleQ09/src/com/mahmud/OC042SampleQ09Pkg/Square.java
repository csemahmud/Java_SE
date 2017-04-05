/**
 * 
 */
package com.mahmud.OC042SampleQ09Pkg;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Square {
	
	private double side;
	
	// private double area;
	// This field is redundant
	// area = size*size;
	// when size is updated,
	// area may be obsolete

	/**
	 * @param side
	 */
	public Square(double side) {
		super();
		this.side = side;
	}

	/**
	 * 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
		
		this(0);
	}

	/**
	 * @return the side
	 */
	public synchronized final double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public synchronized final void setSide(double side) {
		this.side = side;
	}

	/**
	 * @return the area
	 */
	public synchronized final double getArea() {
		return side*side;
	}

}
