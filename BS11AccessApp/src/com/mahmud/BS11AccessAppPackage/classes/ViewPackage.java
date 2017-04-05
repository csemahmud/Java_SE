/**
 * 
 */
package com.mahmud.BS11AccessAppPackage.classes;

import com.mahmud.BS11AccessAppPackage.cls2.Derived3;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ViewPackage {
	
	private final Parent parent;
	private final Derived1 derived1;
	private final Derived2 derived2;
	private final Derived3 derived3;

	/**
	 * @param parent
	 * @param derived1
	 * @param derived2
	 * @param derived3
	 */
	public ViewPackage(Parent parent, Derived1 derived1, 
			Derived2 derived2, Derived3 derived3) {
		super();
		this.parent = parent;
		this.derived1 = derived1;
		this.derived2 = derived2;
		this.derived3 = derived3;
	}

	/**
	 * 
	 */
	public ViewPackage() {
		// TODO Auto-generated constructor stub
		
		this(new Parent(), new Derived1(), 
				new Derived2(), new Derived3());
	}
	
	public void ViewProperties(){
		
		System.out.println("\tInside ViewPackage.ViewProperties()");
		
		System.out.println();
		
		System.out.println("\tparent = " + parent);
		System.out.println("\tparent.getX() = " + parent.getX());
		System.out.println("\tparent.getY() = " + parent.getY());
		System.out.println("\tparent.getZ() = " + parent.getZ());
		
		System.out.println();
		System.out.println("\tderived1 = " + derived1);
		System.out.println("\tderived1.getX() = " + derived1.getX());
		System.out.println("\tderived1.getY() = " + derived1.getY());
		System.out.println("\tderived1.getZ() = " + derived1.getZ());
		
		System.out.println();
		System.out.println("\tderived2 = " + derived2);
		System.out.println("\tderived2.getX() = " + derived2.getX());
		System.out.println("\tderived2.getY() = " + derived2.getY());
		System.out.println("\tderived2.getZ() = " + derived2.getZ());
		
		System.out.println();
		System.out.println("\tderived3 = " + derived3);
		System.out.println("\tderived3.getX() = " + derived3.getX());
		System.out.println("\tderived3.getY() = " + derived3.getY());
	}

}
