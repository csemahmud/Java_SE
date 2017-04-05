/**
 * 
 */
package com.mahmud.BackGroundAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class BackGroundThread implements Runnable {

	/**
	 * 
	 */
	public BackGroundThread() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("BackGround Thread");
		
		while(Thread.currentThread().isDaemon()){
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\t" 
					+ Thread.currentThread().getName()
					+ " is running in BackGround .....");
		}
	}

}
