/**
 * 
 */
package com.mahmud.BS11AccessAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Parent {
	
	private final int x, y, z;

	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Parent(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 */
	public Parent() {
		// TODO Auto-generated constructor stub
		
		this(0, 0, 0);
	}

	/**
	 * @return the x
	 */
	public synchronized final int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	protected synchronized final int getY() {
		return y;
	}

	/**
	 * @return the z
	 */
	synchronized final int getZ() {
		return z;
	}
	
	private synchronized final int getSum() {
		return x + y + z;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parent [x=").append(x).append(", y=").append(y).append(", z=").append(z).append(", getSum()=")
				.append(getSum()).append("]");
		return builder.toString();
	}

}
