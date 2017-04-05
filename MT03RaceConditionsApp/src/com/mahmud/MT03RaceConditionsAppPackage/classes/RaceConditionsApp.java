/**
 * 
 */
package com.mahmud.MT03RaceConditionsAppPackage.classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class RaceConditionsApp implements Runnable {
	
	private final static int LOOP_LIMIT = 5;
	private final static int POOL_SIZE = 10;
	private int latestThreadNum = 0;

	/**
	 * 
	 */
	public RaceConditionsApp() {
		// TODO Auto-generated constructor stub
		
		ExecutorService taskList;
		taskList = Executors.newFixedThreadPool(POOL_SIZE);
		for (int i=0; i<POOL_SIZE; i++) {
			taskList.execute(this);
		}
		taskList.shutdown();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int currentThreadNum;
		synchronized (this) {
			currentThreadNum = latestThreadNum;
			System.out.println("\tcond01 Set currentThreadNum to " + currentThreadNum);
			latestThreadNum = latestThreadNum + 1;
			for (int i=0; i<LOOP_LIMIT; i++) {
				doSomethingWith(currentThreadNum);
			}	
		}
	}

	private void doSomethingWith(int currentThreadNum) {
		// TODO Auto-generated method stub
		
		// Blah Blah
	}

}
