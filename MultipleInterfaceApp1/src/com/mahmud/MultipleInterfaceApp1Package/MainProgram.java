/**
 * 
 */
package com.mahmud.MultipleInterfaceApp1Package;

import com.mahmud.MultipleInterfaceApp1Package.classes.Derived;
import com.mahmud.MultipleInterfaceApp1Package.classes.IBaseX;
import com.mahmud.MultipleInterfaceApp1Package.classes.IBaseY;
import com.mahmud.MultipleInterfaceApp1Package.classes.IBaseZ;

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
		
		Derived derived1 = new Derived(5, 13, 3);		
		Derived derived2 = new Derived();
		System.out.println("\n");
		showValues(derived1);
		showValues(derived2);
		
		System.out.println();
		int sum = IBaseX.x + IBaseY.y + IBaseZ.z;
		System.out.println(
				"\tIBaseX.x + IBaseY.y + IBaseZ.z = "
				+ sum);
		
		// int value = IBaseX.getX();
		// Compiler Error
		// Cannot make a static reference to the 
		// non-static method getX() from the type IBaseX
	}

	private static void showValues(Derived derived) {
		// TODO Auto-generated method stub
		System.out.println("\n\tX = " + derived.getX()
		+ ";\tY = " + derived.getY() + ";\tZ = "
		+ derived.getZ() + ";\tThe Largest Value Is : "
		+ derived.getLargestValue());
	}

}
