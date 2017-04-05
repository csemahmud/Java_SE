/**
 * 
 */
package com.mahmud.MT12ThreadPriorityAppPackage;

import com.mahmud.MT12ThreadPriorityAppPackage.classes.MyRunnable;

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
		
		System.out.println("\n\n");
		doIt();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MainProgram();

	}

	private void doIt() {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new MyRunnable("Thread One: "));
		t1.setPriority(t1.getPriority() - 1); //Default Priority is 5

		Thread t2 = new Thread(new MyRunnable("Thread Two: "));
		t2.setPriority(t2.getPriority() - 2);
		
		Thread t3 = new Thread(new MyRunnable("Thread Three: "));
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
