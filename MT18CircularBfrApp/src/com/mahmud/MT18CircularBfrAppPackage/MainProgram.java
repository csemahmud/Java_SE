/**
 * 
 */
package com.mahmud.MT18CircularBfrAppPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.mahmud.MT18CircularBfrAppPackage.classes.Buffer;
import com.mahmud.MT18CircularBfrAppPackage.classes.CircularBuffer;
import com.mahmud.MT18CircularBfrAppPackage.classes.Consumer;
import com.mahmud.MT18CircularBfrAppPackage.classes.Producer;

/**
 * @author Mahmudul Hasan Khan CSE
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
		
		Buffer sharedBuffer = new CircularBuffer();
		Consumer consumer1 = new Consumer(sharedBuffer);
		Consumer consumer2 = new Consumer(sharedBuffer);
		Producer producer1 = new Producer(sharedBuffer, 1);
		Producer producer2 = new Producer(sharedBuffer, 101);
		
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(consumer1);
		taskList.execute(consumer2);
		taskList.execute(producer1);
		taskList.execute(producer2);
		taskList.shutdown();
		
		try {
			
			boolean taskended = taskList.awaitTermination(
					6, TimeUnit.MINUTES);
			if(taskended){
				System.out.println("\tThis program is NOT under deadlock");
			} else {
				System.err.println("\tThis program is under DEADLOCK");
				System.exit(1);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!taskList.isTerminated());
		System.out.println("\tFinishing Main ....");

	}

}
