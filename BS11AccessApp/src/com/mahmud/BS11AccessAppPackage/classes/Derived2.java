/**
 * 
 */
package com.mahmud.BS11AccessAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Derived2 extends Derived1 {

	/**
	 * @param parent
	 */
	public Derived2(Parent parent) {
		this(parent.getX(), parent.getY(), parent.getZ());
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Derived2(int x, int y, int z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Derived2() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Derived2 [getX()=").append(getX()).append(", getY()=").append(getY()).append(", getZ()=")
				.append(getZ()).append("]");
		return builder.toString();
	}

}
