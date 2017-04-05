/**
 * 
 */
package com.mahmud.BS11AccessAppPackage.cls2;

import com.mahmud.BS11AccessAppPackage.classes.Parent;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Derived3 extends Parent {

	/**
	 * @param parent
	 */
	public Derived3(Parent parent) {
		this(parent, 0, 0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parent
	 * @param y
	 * @param z
	 */
	public Derived3(Parent parent, int y, int z) {
		this(parent.getX(), y, z);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Derived3(int x, int y, int z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Derived3() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Derived3 [getX()=").append(getX()).append(", getY()=").append(getY())
		// .append(", getZ()=").append(getZ())
		// Error : Access Not Allowed
		.append("]");
		return builder.toString();
	}

}
