/**
 * 
 */
package com.mahmud.MT10NotifyProdConAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Buffer {
	
	private long sum;
	private boolean available;
	private int data;

	/**
	 * 
	 */
	public Buffer() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void put(int x) {
		while(available) { // wait until buffer is empty
			try {
				System.out.println("\t"
						+ Thread.currentThread().getName()
						+ " waits");
				wait();
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		data = x;
		sum += data;
		System.out.println("\t" + Thread.currentThread().getName()
				+" Puts \t"+ data + "\t" + sum);
		available = true;
		notify();
	}
	
	public synchronized int get() {
		while(!available) { // wait until data available
			try {
				System.out.println("\t"
						+ Thread.currentThread().getName()
						+ " waits");
				wait();
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		available = false;
		notify();
		return data;
	}
}
