/**
 * 
 */
package com.mahmud.MultipleInterfaceApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Derived extends BaseX implements IDerived {
	
	private final int y;
	private final int z;

	/**
	 * @param x
	 */
	public Derived(int x, int y, int z) {
		super(x);
		// TODO Auto-generated constructor stub
		
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 */
	public Derived() {
		// TODO Auto-generated constructor stub
		
		this.y = IBaseY.y;
		this.z = IBaseZ.z;
		
		// IBaseY.y = 800;
		// Illegal
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MultipleInterfaceApp1Package.classes.IBaseY#getY()
	 */
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MultipleInterfaceApp1Package.classes.IBaseZ#getZ()
	 */
	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return z;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MultipleInterfaceApp1Package.classes.IDerived#getLargestValue()
	 */
	@Override
	public int getLargestValue() {
		// TODO Auto-generated method stub
		
		if((getX() > y) && (getX() > z)) {
			return getX();
		} else if(y > z) {
			return y;
		}
		
		return z;
	}

}
