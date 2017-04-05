/**
 * 
 */
package com.mahmud.MT16GeneralInterruptPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class GeneralInterrupt implements Runnable {

	/**
	 * 
	 */
	public GeneralInterrupt() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
	         System.out.println("\tin run() - about to work2()");
	         work2();
	         System.out.println("\tin run() - back from  work2()");
	      }
	      catch (InterruptedException x) {
	         System.out.println("\tin run() - interrupted in work2()");
	         return;
	      }
	      System.out.println("\tin run() - doing stuff after nap");
	      System.out.println("\tin run() - leaving normally");

	}

	private void work2() throws InterruptedException {
		// TODO Auto-generated method stub
		
		while (true) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("\tC isInterrupted()="
	            + Thread.currentThread().isInterrupted());
	            Thread.sleep(2000);
	            System.out.println("\tD isInterrupted()="
	            + Thread.currentThread().isInterrupted());
            }
		}
	}

}
