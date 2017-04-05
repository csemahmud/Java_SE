/**
 * 
 */
package com.mahmud.OC003AbstractImplPkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class SUV extends Car {

	/**
	 * 
	 */
	public SUV() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.Car#startEngine()
	 */
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("\tStarting Engine in SUV .....");
	}
	
	public final void enable4wd(){
		
		System.out.println("\tEnabling Forward .....");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.Car#goForward()
	 */
	@Override
	public void goForward() {
		// TODO Auto-generated method stub

		System.out.println("\tGoing Forward .....");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.Car#reverse()
	 */
	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
		System.out.println("\tReversing .....");
	}
	
	public abstract void goOfRoad();

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.Car#turn(int)
	 */
//	@Override
//	public void turn(int whichWay) {
//		// TODO Auto-generated method stub
//
//	}
	// Not implemented here .....

}
