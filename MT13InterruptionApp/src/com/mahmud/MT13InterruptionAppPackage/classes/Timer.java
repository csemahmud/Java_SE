/**
 * 
 */
package com.mahmud.MT13InterruptionAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Timer implements Runnable {

	/**
	 * 
	 */
	public Timer() {
		// TODO Auto-generated constructor stub
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("Timer Thread");
		
		try {
	         System.out.println("\tin run(), before throwInterruption()");
	         throwInterruption();
	         System.out.println("\tin run(), after throwInterruption()");
		} catch (InterruptedException ex) {
			// TODO Auto-generated catch block
			System.out.println("\tC: Is " + Thread.currentThread().getName()
					+ " interrupted ? " + Thread.currentThread().isInterrupted());
		}
	}

	private void throwInterruption() throws InterruptedException {
		// TODO Auto-generated method stub
		
		while (true) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("\tA: Is " + Thread.currentThread().getName()
						+ " interrupted ? " + Thread.currentThread().isInterrupted());
				System.out.println("\t" + Thread.currentThread().getName()
						+ " is going to sleep for 1 ms");
	            Thread.sleep(1);
				System.out.println("\t" + Thread.currentThread().getName()
						+ " has finished sleeping after 1 ms");
				System.out.println("\tB: Is " + Thread.currentThread().getName()
						+ " interrupted ? " + Thread.currentThread().isInterrupted());
            }
		}
	}

}
