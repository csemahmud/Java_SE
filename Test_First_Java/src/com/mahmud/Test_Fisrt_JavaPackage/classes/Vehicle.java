/**
 * 
 */
package com.mahmud.Test_Fisrt_JavaPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Vehicle implements DiagnoseStartStop {

	private String name;
	private boolean started;

	/**
	 * @param name
	 */
	public Vehicle(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public synchronized final String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.Test_Fisrt_JavaPackage.classes.StartStop#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		started = DiagnoseStartStop.STARTED;

	}

	/* (non-Javadoc)
	 * @see com.mahmud.Test_Fisrt_JavaPackage.classes.StartStop#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		started = DiagnoseStartStop.NOT_STARTED;

	}
	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return started;
	}

}
