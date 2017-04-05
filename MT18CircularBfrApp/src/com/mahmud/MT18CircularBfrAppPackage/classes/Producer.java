/**
 * 
 */
package com.mahmud.MT18CircularBfrAppPackage.classes;

import java.util.Random;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Producer implements Runnable {
	
	private final Buffer sharedBuffer;
	private int start;
	private static int producerNo;
	private String threadName;
	private static long sum;

	/**
	 * @param sharedBuffer
	 * @param start
	 */
	public Producer(Buffer sharedBuffer, int start) {
		
		this.sharedBuffer = sharedBuffer;
		this.start = start;
		producerNo++;
		threadName = "Producer" + producerNo;
	}

	/**
	 * 
	 */
	public Producer() {
		// TODO Auto-generated constructor stub
		
		this(null, 0);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(threadName);
		
		for(int i = start; i < start + 20; i++) {
			try {
				Thread.currentThread().sleep(
						new Random().nextInt(3000));
				
				synchronized (sharedBuffer) {
					sharedBuffer.set(i);
					sum += i;
					System.out.printf("\tProducer sum = %d%n%n", sum);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
