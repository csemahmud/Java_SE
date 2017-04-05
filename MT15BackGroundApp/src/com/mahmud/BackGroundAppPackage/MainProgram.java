/**
 * 
 */
package com.mahmud.BackGroundAppPackage;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.BackGroundAppPackage.classes.BackGroundThread;
import com.mahmud.BackGroundAppPackage.classes.Counter;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private static final int LIST_SIZE = 100000;
	private static final int NUMBER_OF_SERVERS = 100;

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
		Thread backGroundThread = new Thread(new BackGroundThread());
		backGroundThread.setDaemon(true);
		backGroundThread.start();
		
		// start time
		long startTime = System.currentTimeMillis();
		
		// list creation, init with random boolean values
		List<Boolean> booleanList = new ArrayList<>();
		int localResult = 0;
		for(int i = 0; i < LIST_SIZE; i++) {
			if(Math.random() < 0.1) {
				localResult++;
				booleanList.add(true);
			} else {
				booleanList.add(false);
			}
		}
		
		// creation of list for counter objects and threads
		List<Counter> counterList = new ArrayList<>();
		List<Thread> serverThreadList = new ArrayList<>();
		int start = 0;
		int end;
		int howMany = booleanList.size() / NUMBER_OF_SERVERS;
		
		// creation of counters and threads
		for(int i = 0; i < NUMBER_OF_SERVERS; i++) {
			end = start + howMany;
			counterList.add(new Counter(booleanList.subList(start, end)));
			serverThreadList.add(new Thread(counterList.get(i)));
			serverThreadList.get(i).start(); // start thread i
			start = end;
		}
		
		// wait for termination of each counter (thread)
		try{
			for (Thread thread : serverThreadList) {
				thread.join();
			}
		} catch (InterruptedException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		// accumulate counter results
		int result = 0;
		for (Counter counter : counterList) {
			result += counter.getResult();
		}
		
		// end time
		long endTime = System.currentTimeMillis();
		float time = (endTime-startTime) / 1000.0f;
		System.out.println("\tcomputation time: " + time);
		
		// print result
		System.out.println("\tresult: " + result);
		if(result == localResult){
			System.out.println("\tCounting is Successfull");
		} else {
			System.out.println("\tCounting is NOT Successfull . Differece = "
					+ (localResult - result));
		}

	}

}
