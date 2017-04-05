/**
 * 
 */
package com.mahmud.BS11AccessAppPackage;

import com.mahmud.BS11AccessAppPackage.classes.Derived1;
import com.mahmud.BS11AccessAppPackage.classes.Derived2;
import com.mahmud.BS11AccessAppPackage.classes.Parent;
import com.mahmud.BS11AccessAppPackage.classes.ViewPackage;
import com.mahmud.BS11AccessAppPackage.cls2.Derived3;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private final Parent parent;
	private final Derived1 derived1;
	private final Derived2 derived2;
	private final Derived3 derived3;
	private final ViewPackage viewPackage;

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
		
		parent = new Parent(10, 20, 30);
		derived1 = new Derived1(parent);
		derived2 = new Derived2(derived1);
		derived3 = new Derived3(derived2);
		viewPackage = new ViewPackage(parent, derived1,
				derived2, derived3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		MainProgram x = new MainProgram();

		
		System.out.println("\tInside main()");
		
		System.out.println("\tparent = " + x.parent);
		System.out.println("\tparent.getX() = " + x.parent.getX());
		System.out.println("\tderived1 = " + x.derived1);
		System.out.println("\tderived1.getX() = " + x.derived1.getX());
		System.out.println("\tderived2 = " + x.derived2);
		System.out.println("\tderived2.getX() = " + x.derived2.getX());
		System.out.println("\tderived3 = " + x.derived3);
		System.out.println("\tderived3.getX() = " + x.derived3.getX());
		
		System.out.println();
		
		x.viewPackage.ViewProperties();

	}

}
