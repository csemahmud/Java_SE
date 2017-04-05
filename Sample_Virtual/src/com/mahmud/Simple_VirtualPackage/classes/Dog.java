/**
 * 
 */
package com.mahmud.Simple_VirtualPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class Dog {

	/**
	 * 
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public final void bark() {               //bark() is not virtual because it is 
        System.out.println("\n\twoof");   //final and if you tried to override it
    }                                 //you would get a compile time error.

    public abstract void jump();

}
