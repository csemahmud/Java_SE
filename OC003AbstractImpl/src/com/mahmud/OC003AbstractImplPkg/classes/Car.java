/**
 * 
 */
package com.mahmud.OC003AbstractImplPkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class Car {

	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void startEngine(){
		System.out.println("\tStarting Engine .....");
	}
	
	public abstract void goForward();
	public abstract void reverse();
	
	public final void stop(){
		System.out.println("\tStopping .....");
	}
	
	public abstract void turn(int whichWay);

}
