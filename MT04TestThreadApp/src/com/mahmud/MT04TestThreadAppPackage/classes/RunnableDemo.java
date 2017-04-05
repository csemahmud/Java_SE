/**
 * 
 */
package com.mahmud.MT04TestThreadAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class RunnableDemo implements Runnable {
	
	private Thread thisThread;
	private String threadName;

	/**
	 * @param threadName
	 */
	public RunnableDemo(String threadName) {
		this();
		this.threadName = threadName;
	}

	/**
	 * 
	 */
	public RunnableDemo() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System .out.println("\tRunning " + threadName );
		try {
			for(int i = 4; i > 0; i--) {
				System .out.println("\tThread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System .out.println("\tThread " + threadName + " interrupted.");
		}
		System .out.println("\tThread " + threadName + " exiting.");

	}
	
	public void startThread() {
		System .out.println("\tStarting " + threadName );
		if (thisThread == null) {
			thisThread = new Thread (this, threadName);
			thisThread.start();
		}
	}

}
