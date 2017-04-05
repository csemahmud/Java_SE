/**
 * 
 */
package com.mahmud.MT01MultiThreadingAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Counter implements Runnable {
	
	private final App1 mainApp;
	private final int loopLimit;

	/**
	 * @param mainApp
	 * @param loopLimit
	 */
	public Counter(App1 mainApp, int loopLimit) {
		this.mainApp = mainApp;
		this.loopLimit = loopLimit;
	}

	/**
	 * 
	 */
	public Counter() {
		// TODO Auto-generated constructor stub
		this(null, 0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=loopLimit; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("\tApp1 %s: %s%n", threadName, i);
			mainApp.pause(Math.random());
			}

	}

}
