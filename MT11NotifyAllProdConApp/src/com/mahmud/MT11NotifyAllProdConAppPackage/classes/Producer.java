/**
 * 
 */
package com.mahmud.MT11NotifyAllProdConAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Producer implements Runnable {
	
	private Buffer buffer;
	private int start;
	private static int producerNo;
	private String threadName;

	/**
	 * @param buffer
	 * @param start
	 */
	public Producer(Buffer buffer, int start) {
		this();
		this.buffer = buffer;
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(threadName);
		
		for(int i = start; i < start + 100; i++) {
			buffer.put(i);
		}

	}

}
