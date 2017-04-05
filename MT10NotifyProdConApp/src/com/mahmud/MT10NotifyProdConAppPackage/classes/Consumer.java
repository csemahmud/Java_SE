/**
 * 
 */
package com.mahmud.MT10NotifyProdConAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Consumer implements Runnable {
	
	private Buffer buffer;
	private static int consumerNo;
	private String threadName;
	private static long sum;
	
	/**
	 * @param buffer
	 */
	public Consumer(Buffer buffer) {
		this();
		this.buffer = buffer;
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(threadName);
		
		for(int i = 0; i < 100; i++) {
			int data = buffer.get();
			sum += data;
			System.out.println("\t" + Thread.currentThread().getName()
					+" Gets \t" + data + "\t" + sum);
		}

	}

}
