/**
 * 
 */
package com.mahmud.MT12ThreadPriorityAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MyRunnable implements Runnable {
	
	private static String spacerString = "";
	private String filler, threadName;

	/**
	 * @param threadName
	 */
	public MyRunnable(String threadName) {
		
		this();
		this.threadName = threadName;
	}

	/**
	 * 
	 */
	public MyRunnable() {
		// TODO Auto-generated constructor stub

		this.filler = spacerString;
		spacerString += "                          ";
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

		Thread.currentThread().setName(threadName);
		for (int i=0; i < 5; i++) {
			System.out.println("\t" + filler + Thread.currentThread().getName()
					+ " Iteration = " + Integer.toString(i) ) ;
		}
		System.out.println("\t" + filler + Thread.currentThread().getName()
				+ " Priority = " + Thread.currentThread().getPriority() );
	}

	/**
	 * @return the filler
	 */
	public String getFiller() {
		return filler;
	}

	/**
	 * @param filler the filler to set
	 */
	public void setFiller(String filler) {
		this.filler = filler;
	}

}
