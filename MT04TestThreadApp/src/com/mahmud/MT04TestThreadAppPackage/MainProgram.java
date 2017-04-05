/**
 * 
 */
package com.mahmud.MT04TestThreadAppPackage;

import com.mahmud.MT04TestThreadAppPackage.classes.RunnableDemo;
import com.mahmud.MT04TestThreadAppPackage.classes.ThreadDemo;

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
		new RunnableDemo("Runnable Thread").startThread();
		new ThreadDemo("Thread 2").startThread();

	}

}
