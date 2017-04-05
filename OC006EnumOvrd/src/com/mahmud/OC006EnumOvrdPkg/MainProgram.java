/**
 * 
 */
package com.mahmud.OC006EnumOvrdPkg;

import com.mahmud.OC006EnumOvrdPkg.enums.CoffeeSize;

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
		for (CoffeeSize coffeeSize : CoffeeSize.values()) {
			
			System.out.println("\t"
					+ coffeeSize + " "
					+ coffeeSize.getOunces() + " "
					+ coffeeSize.getLidCode());
			
		}

	}

}
