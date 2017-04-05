/**
 * 
 */
package com.mahmud.GN04BridgeMethodAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class IntNode extends Node<Integer> {

	/**
	 * 
	 */
	public IntNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param data
	 */
	public IntNode(Integer data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.GN04BridgeMethodAppPackage.classes.Node#getData()
	 */
	@Override
	public Integer getData() {
		// TODO Auto-generated method stub
		return super.getData();
	}

	/* (non-Javadoc)
	 * @see com.mahmud.GN04BridgeMethodAppPackage.classes.Node#setData(java.lang.Object)
	 */
	@Override
	public void setData(Integer data) {
		System.out.println("IntNode.setData(Integer)");
		// TODO Auto-generated method stub
		super.setData(data);
	}

}
