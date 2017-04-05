/**
 * 
 */
package com.mahmud.GN01GenericsAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Box<T> {
	
	private T price;
	private T volume;
	private T weight;

	/**
	 * @param price
	 * @param volume
	 * @param weight
	 */
	public Box(T price, T volume, T weight) {
		this();
		this.price = price;
		this.volume = volume;
		this.weight = weight;
	}

	/**
	 * 
	 */
	public Box() {
		// TODO Auto-generated constructor stub
		
		volume = null;
		weight = null;
		price = null;
	}

	/**
	 * @return the price
	 */
	public T getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(T price) {
		this.price = price;
	}

	/**
	 * @return the volume
	 */
	public T getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(T volume) {
		this.volume = volume;
	}

	/**
	 * @return the weight
	 */
	public T getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(T weight) {
		this.weight = weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [price=").append(price).append(", volume=").append(volume).append(", weight=")
				.append(weight).append("]");
		return builder.toString();
	}
	
	public <U extends Number> void inspect(U u){
        System.out.println("\tT: " + price.getClass().getName());
        System.out.println("\tU: " + u.getClass().getName());
    }

}
