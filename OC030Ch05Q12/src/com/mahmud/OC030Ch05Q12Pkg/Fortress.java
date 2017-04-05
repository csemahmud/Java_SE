/**
 * 
 */
package com.mahmud.OC030Ch05Q12Pkg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Fortress {
	
	private final String name;
	private final List<Number> numberList;

	/**
	 * @param name
	 * @param numberList
	 */
	public Fortress(String name, List<Number> numberList) {
		super();
		this.name = name;
		this.numberList = numberList;
	}

	/**
	 * 
	 */
	public Fortress() {
		// TODO Auto-generated constructor stub
		
		this("Anonymous", new ArrayList<>());
	}

	/**
	 * @return the name
	 */
	public synchronized final String getName() {
		return name;
	}

	/**
	 * @return the numberList
	 */
	public synchronized final List<Number> getNumberList() {
		// return numberList;
		// breaks encapsulation
		
		final List<Number> numberList
			= new ArrayList<>();
		numberList.addAll(this.numberList);
		return numberList;
	}
	
	public boolean addToList(Number number) {
		return numberList.add(number);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fortress [name=").append(name).append(", numberList=").append(numberList).append("]");
		return builder.toString();
	}

}
