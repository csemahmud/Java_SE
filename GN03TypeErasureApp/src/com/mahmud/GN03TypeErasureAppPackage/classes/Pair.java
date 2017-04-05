/**
 * 
 */
package com.mahmud.GN03TypeErasureAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Pair implements IPair {
	
	private Object key;
    private Object value;

	/**
	 * @param key
	 * @param value
	 */
	public Pair(Object key, Object value) {
		this();
		this.key = key;
		this.value = value;
	}

	/**
	 * 
	 */
	public Pair() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.GN01GenericsAppPackage.classes.IPair#getKey()
	 */
	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.GN01GenericsAppPackage.classes.IPair#getValue()
	 */
	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pair [key=").append(key).append(", value=").append(value).append("]");
		return builder.toString();
	}

}
