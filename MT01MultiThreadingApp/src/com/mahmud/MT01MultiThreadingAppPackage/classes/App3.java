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
public class App3 extends SomeClass {

	/**
	 * 
	 */
	public App3() {
		// TODO Auto-generated constructor stub
		
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(new Counter(6));
		taskList.execute(new Counter(5));
		taskList.execute(new Counter(4));
		taskList.shutdown();
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
	
	/**
	 * @author Mahmudul Hasan Khan CSE
	 *
	 */
	private class Counter implements Runnable { // Inner class
		private final int loopLimit;
		public Counter(int loopLimit) {
			this.loopLimit = loopLimit;
		}
		public void run() {
			for(int i=1; i<=loopLimit; i++) {
				String threadName = Thread.currentThread().getName();
				System.out.printf("\tApp3 %s: %s%n", threadName, i);
				pause(Math.random());
			}
		}
	}

}
