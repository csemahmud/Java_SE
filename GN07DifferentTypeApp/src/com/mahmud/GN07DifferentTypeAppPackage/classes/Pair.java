/**
 * 
 */
package com.mahmud.GN07DifferentTypeAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Pair<K, V> implements IPair<K, V> {
	
	private K key;
    private V value;

	/**
	 * @param key
	 * @param value
	 */
	public Pair(K key, V value) {
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
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.GN01GenericsAppPackage.classes.IPair#getValue()
	 */
	@Override
	public V getValue() {
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
