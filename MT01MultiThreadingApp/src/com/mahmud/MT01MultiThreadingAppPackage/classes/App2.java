/**
 * 
 */
package com.mahmud.MT01MultiThreadingAppPackage.classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class App2 extends SomeClass implements Runnable {
	
	private final int loopLimit;

	/**
	 * @param loopLimit
	 */
	public App2(int loopLimit) {
		this.loopLimit = loopLimit;
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(this);
		taskList.execute(this);
		taskList.execute(this);
		taskList.shutdown();
	}

	/**
	 * 
	 */
	public App2() {
		// TODO Auto-generated constructor stub
		this(0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=loopLimit; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("\tApp2 %s: %s%n", threadName, i);
			pause(Math.random());
			}
	}

	/* (non-Javadoc)
	 * @see com.mahmud.MT01MultiThreadingAppPackage.classes.SomeClass#pause(double)
	 */
	@Override
	public void pause(double seconds) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(Math.round(1000.0 * seconds));
			} catch (InterruptedException ie) { 
				ie.printStackTrace();
			}
	}

}
