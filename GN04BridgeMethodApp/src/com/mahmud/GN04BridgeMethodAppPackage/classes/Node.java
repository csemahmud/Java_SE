/**
 * 
 */
package com.mahmud.GN04BridgeMethodAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Node<T> {
	
	private T data;

	/**
	 * @param data
	 */
	public Node(T data) {
		this();
		this.data = data;
	}

	/**
	 * 
	 */
	public Node() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		System.out.println("\tNode.setData(Object)");
		this.data = data;
	}

}
