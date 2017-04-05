/**
 * 
 */
package com.mahmud.Test_Fisrt_JavaPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Car extends Vehicle {

	/**
	 * @param name
	 */
	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mahmud.Test_Fisrt_JavaPackage.classes.Vehicle#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println ("\n\n\n\tInsert key into ignition and turn.");
		super.start();
	}

	/* (non-Javadoc)
	 * @see com.mahmud.Test_Fisrt_JavaPackage.classes.Vehicle#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println ("\n\tTurn key and remove from ignition.");
		super.stop();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\t").append(getName()).append(" : Is Started ? ").append(isStarted());
		return builder.toString();
	}

}
