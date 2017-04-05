/**
 * 
 */
package com.mahmud.MT10NotifyProdConAppPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.mahmud.MT10NotifyProdConAppPackage.classes.Buffer;
import com.mahmud.MT10NotifyProdConAppPackage.classes.Consumer;
import com.mahmud.MT10NotifyProdConAppPackage.classes.Producer;

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
		
		Buffer buffer = new Buffer();
		Consumer consumer1 = new Consumer(buffer);
		Consumer consumer2 = new Consumer(buffer);
		Consumer consumer3 = new Consumer(buffer);
		Producer producer1 = new Producer(buffer, 1);
		Producer producer2 = new Producer(buffer, 101);
		Producer producer3 = new Producer(buffer, 201);
		
		System.out.println("\tThread        \tData\tSum");
		
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(consumer1);
		taskList.execute(consumer2);
		taskList.execute(consumer3);
		taskList.execute(producer1);
		taskList.execute(producer2);
		taskList.execute(producer3);
		taskList.shutdown();
		
		try {
			
			boolean taskended = taskList.awaitTermination(
					1, TimeUnit.MINUTES);
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
