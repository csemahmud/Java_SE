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
public class App1 extends SomeClass {

	/**
	 * 
	 */
	public App1() {
		// TODO Auto-generated constructor stub
		
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(new Counter(this, 6));
		taskList.execute(new Counter(this, 5));
		taskList.execute(new Counter(this, 4));
		taskList.shutdown();
	}

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
