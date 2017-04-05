/**
 * 
 */
package com.mahmud.MT14InterruptApp2Package;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class TimeControl2 {
	Timer timer;
	
	TimeControl2() {
		timer = new Timer("Timer Thread");
		timer.start();
		try {
			Thread.sleep(10); // enough to init Timer
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\tTimeControl2 " + timer.isInterrupted());
		timer.interrupt();
		System.out.println("\n\tTimeControl2 " + timer.isInterrupted());
		try {
			Thread.sleep(10); // enough to init Timer
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n\tTimeControl2 " + timer.isInterrupted());
	}
	
	public static void main(String args[]) {
		new TimeControl2();
	}

	private class Timer extends Thread {
		public Timer(String threadName){
			setName(threadName);
		}
		public void run() {
			try {
				sleep(10000); // sleeps for a long time
			} catch (Exception ex) {
				System.out.println("\n\t" 
						+ Thread.currentThread().getName()
						+ " : " +  ex.getMessage());
			}
		}
	}
}