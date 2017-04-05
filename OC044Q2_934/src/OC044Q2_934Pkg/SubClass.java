/**
 * 
 */
package OC044Q2_934Pkg;

import OC044Q2_934Pkg.classes.SuperClass;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class SubClass extends SuperClass {


	protected SubClass() {
		
		// super(0);
		// Compiler Error
		// The constructor SuperClass(int) 
		// is not visible
		
		super("");
		// TODO Auto-generated constructor stub
	}
	
	// Must Implicit super constructor SuperClass() 
	// is undefined for default constructor. 
	// Must define an explicit constructor

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		SuperClass obj1 = new SubClass();
		
		// SuperClass obj2 = new SubClass("Mahmud");
		
		// Compiler Error
		// The constructor SubClass(String) is undefined
		
		// SuperClass obj3 = new SubClass("Mahmud", 1);
		
		// Compiler Error
		// The constructor SubClass(String, int) is undefined
		
		SuperClass obj4 = new SuperClass("Mahmud", 1);
		
		// SuperClass obj5 = new SuperClass("Mahmud");
		// Compiler Error
		
		// The constructor SuperClass(String) 
		// is not visible
		
		System.out.println("\t" + obj1);
		System.out.println();
		System.out.println("\t" + obj4);
	}

}
