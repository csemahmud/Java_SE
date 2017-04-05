/**
 * 
 */
package com.mahmud.OC003AbstractImplPkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class AcmeRover extends SUV {

	/**
	 * 
	 */
	public AcmeRover() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.SUV#goOfRoad()
	 */
	@Override
	public void goOfRoad() {
		// TODO Auto-generated method stub

		System.out.println("\tGoing Of Road .....");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.OC003AbstractImplPkg.classes.Car#turn(int)
	 */
	@Override
	public void turn(int whichWay) {
		// TODO Auto-generated method stub

		switch(whichWay){
		case 0:
			System.out.println("\tTurning Left .....");
			break;
		case 1:
			System.out.println("\tTurning Right .....");
			break;
		default:
			System.out.println("\tTuring Default Way .....");
		}
	}

}
