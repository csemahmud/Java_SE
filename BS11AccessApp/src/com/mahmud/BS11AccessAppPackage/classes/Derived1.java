/**
 * 
 */
package com.mahmud.BS11AccessAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Derived1 extends Parent {

	/**
	 * @param parent
	 */
	public Derived1(Parent parent) {
		this(parent.getX(), parent.getY(), parent.getZ());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Derived1(int x, int y, int z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Derived1() {
		// TODO Auto-generated constructor stub
	}
	
//	public synchronized final int getX() {
//		return 10;
//	}
	// Error
	
	private synchronized final int getSum() {
		return getX() + getY() + getZ();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Derived1 [getSum()=").append(getSum()).append(", getX()=").append(getX()).append(", getY()=")
				.append(getY()).append(", getZ()=").append(getZ()).append("]");
		return builder.toString();
	}

}
