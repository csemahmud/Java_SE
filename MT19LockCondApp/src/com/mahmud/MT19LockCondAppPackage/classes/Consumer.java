/**
 * 
 */
package com.mahmud.MT19LockCondAppPackage.classes;

import java.util.Random;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Consumer implements Runnable {
	
	private Buffer sharedBuffer;
	private static int consumerNo;
	private String threadName;
	private static long sum;
	
	/**
	 * @param sharedBuffer
	 */
	public Consumer(Buffer sharedBuffer) {
		this();
		this.sharedBuffer = sharedBuffer;
	}

	/**
	 * 
	 */
	public Consumer() {
		// TODO Auto-generated constructor stub
		
		consumerNo++;
		threadName = "Consumer" + consumerNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(threadName);
		
		for(int i = 0; i < 100; i++) {
			try {
				Thread.currentThread().sleep(
						new Random().nextInt(100));
				
				int data = sharedBuffer.get();
				sum += data;
				System.out.printf("\tConsumer sum = %d%n%n", sum);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
