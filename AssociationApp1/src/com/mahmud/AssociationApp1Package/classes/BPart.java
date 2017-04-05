/**
 * 
 */
package com.mahmud.AssociationApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class BPart {
	
	private int number1;
	private String text1;
	private static int sId;
	private int id;

	/**
	 * 
	 */
	public BPart() {
		// TODO Auto-generated constructor stub
		sId++;
		id = sId;
	}

	/**
	 * @return the number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * @param number1 the number1 to set
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * @return the text1
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @param text1 the text1 to set
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tBPart").append(id).append(" :\t[number1=").append(number1).append(";\ttext1=").append(text1).append("]");
		return builder.toString();
	}

}
