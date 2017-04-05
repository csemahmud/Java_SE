/**
 * 
 */
package com.mahmud.SingletonApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	private static int id = 0;
	
	private int number1;
	private String text1;

	/**
	 * 
	 */
	private Singleton() {
		// TODO Auto-generated constructor stub
		
		id++;
	}

	/**
	 * @param number1 the number1 to set
	 */
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	/**
	 * @param text1 the text1 to set
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}

	/**
	 * @return the number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * @return the text1
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @return the uniqueInstance
	 */
	public static Singleton getUniqueInstance() {
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tSingleton : ").append(id).append(" : [number1 = ").append(number1).append(";\ttext1 = ").append(text1).append("]");
		return builder.toString();
	}

}
