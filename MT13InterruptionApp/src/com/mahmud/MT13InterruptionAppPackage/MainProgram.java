/**
 * 
 */
package com.mahmud.MT13InterruptionAppPackage;

import com.mahmud.MT13InterruptionAppPackage.classes.Timer;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram extends Thread {
	
	private Timer timer;
	private Thread thread;

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public MainProgram() {
		// TODO Auto-generated constructor stub
		Thread.currentThread().setName("Main Thread");
		
		timer = new Timer();
		thread = new Thread(timer);
		thread.start();
		try {
			System.out.println("\t" + Thread.currentThread().getName()
					+ " is going to sleep for 10 ms");
			Thread.currentThread().sleep(10); // enough to init Timer
			System.out.println("\t" + Thread.currentThread().getName()
					+ " has finished sleeping after 10 ms");
		} catch (InterruptedException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		System.out.println("\tIn MainProgram, Is Interrupted ? " 
				+ thread.isInterrupted());
		thread.interrupt();
		System.out.println("\tIn MainProgram, Is Interrupted ? " 
				+ thread.isInterrupted());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n\n\tStarting MainProgram()");
		new MainProgram();
		System.out.println("\tFinishing MainProgram()");
	}

}
