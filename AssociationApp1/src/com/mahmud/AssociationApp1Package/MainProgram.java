/**
 * 
 */
package com.mahmud.AssociationApp1Package;

import com.mahmud.AssociationApp1Package.classes.AWhole;
import com.mahmud.AssociationApp1Package.classes.BPart;

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
		
		BPart aBPartObj = new BPart();
		aBPartObj.setNumber1(3);
		aBPartObj.setText1("Mahmud");
		
		AWhole aAWholeObj = new AWhole(aBPartObj);
		System.out.println("\n\n" + aAWholeObj.getStringBPart1());
		
		aBPartObj.setNumber1(5);
		aBPartObj.setText1("Super-Man");
		
		System.out.println(aAWholeObj.getStringBPart1());
		
		System.out.println(aAWholeObj.getStringBPart2());
		
		aAWholeObj.changeBPart2(100, "Alia Bhatt");
		
		System.out.println(aAWholeObj.getStringBPart2());
		
		BPart tempObj1 = new BPart();
		tempObj1.setNumber1(50);
		System.out.println("\n\t" + AWhole.determineOddEven(tempObj1));

	}

}
