/**
 * 
 */
package com.mahmud.MT01MultiThreadingAppPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.mahmud.MT01MultiThreadingAppPackage.classes.App1;
import com.mahmud.MT01MultiThreadingAppPackage.classes.App2;
import com.mahmud.MT01MultiThreadingAppPackage.classes.App3;

/**
 * @author Mahmudul Hasan Khan CSE;
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		new App2(5);
		new App3();
		new App1();
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(() -> {
			// TODO Auto-generated method stub
			
			for(int i=1; i<=5; i++) {
				String threadName = Thread.currentThread().getName();
				System.out.printf("\tMain %s: %s%n", threadName, i);
				pause(Math.random());
				}
		});
		
		taskList.shutdown();

	}

	private static void pause(double seconds) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(Math.round(1000.0 * seconds));
			} catch (InterruptedException ie) { 
				ie.printStackTrace();
			}
	}

}
