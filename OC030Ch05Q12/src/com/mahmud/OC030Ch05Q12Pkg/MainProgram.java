/**
 * 
 */
package com.mahmud.OC030Ch05Q12Pkg;

import java.util.List;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		Fortress fortress = new Fortress();
		fortress.addToList(1);
		fortress.addToList(2);
		fortress.addToList(3);
		
		final List<Number> numberList
			= fortress.getNumberList();
		
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		
		System.out.println("\tnumberList (in main()) = " 
						+ numberList);
		System.out.println("\t" + fortress);
	}

}
