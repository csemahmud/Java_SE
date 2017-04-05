/**
 * 
 */
package com.mahmud.MultipleInterfaceApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class BaseX implements IBaseX {
	
	private final int x;

	/**
	 * @param x
	 */
	public BaseX(int x) {
		this.x = x;
	}

	/**
	 * 
	 */
	public BaseX() {
		// TODO Auto-generated constructor stub
		
		this(IBaseX.x);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MultipleInterfaceApp1Package.classes.IBaseX#getX()
	 */
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

}
