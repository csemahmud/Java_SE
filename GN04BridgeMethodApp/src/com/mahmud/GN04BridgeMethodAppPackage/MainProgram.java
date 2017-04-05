/**
 * 
 */
package com.mahmud.GN04BridgeMethodAppPackage;

import com.mahmud.GN04BridgeMethodAppPackage.classes.IntNode;
import com.mahmud.GN04BridgeMethodAppPackage.classes.Node;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.err.println("\n\n");
		IntNode anIntNode = new IntNode(5);
		
		@SuppressWarnings("rawtypes")
		Node aNode = anIntNode;
		
		try {
			aNode.setData("Hello"); // unchecked
		} catch (ClassCastException ex) {
			// TODO: handle exception
			ex.printStackTrace();
			System.out.println(
					"\n\tException occured in Bridge Method : IntNode.setData(Object)");
		}
		
		Integer i = anIntNode.getData();
		System.out.println("\n\ti = " + i);	

	}

}
