/**
 * 
 */
package com.mahmud.MT17BlockBufferAppPackage.classes;

import java.util.Random;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Producer implements Runnable {
	
	private Buffer sharedBuffer;
	private int start;
	private static int producerNo;
	private String threadName;

	/**
	 * @param sharedBuffer
	 * @param start
	 */
	public Producer(Buffer sharedBuffer, int start) {
		this();
		this.sharedBuffer = sharedBuffer;
		this.start = start;
	}

	/**
	 * 
	 */
	public Producer() {
		// TODO Auto-generated constructor stub
		producerNo++;
		threadName = "Producer" + producerNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(threadName);
		
		for(int i = start; i < start + 100; i++) {
			try {
				Thread.currentThread().sleep(
						new Random().nextInt(100));
				sharedBuffer.set(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
