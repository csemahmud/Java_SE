/**
 * 
 */
package com.mahmud.MT05GuessANumberAppPackage;

import com.mahmud.MT05GuessANumberAppPackage.classes.DisplayMessage;
import com.mahmud.MT05GuessANumberAppPackage.classes.GuessANumber;

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
		Runnable hello = new DisplayMessage("Hello");
		Thread thread0 = new Thread(hello);
		thread0.setDaemon(true); // It breaks infinite Looping thread
		System.out.print("\t" + thread0.getName() + " Changes it Name to : ");
		thread0.setName("hello");
		System.out.println(thread0.getName());
		System .out.println("\tStarting hello thread...");
		thread0.start();
		Runnable bye = new DisplayMessage("GOOD BYE .....");
		Thread thread1 = new Thread(bye);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.setDaemon(true); // It breaks infinite Looping thread
		System .out.println("\tStarting goodbye thread...");
		thread1.start();
		System .out.println("\tStarting thread2...");
		Thread thread2 = new GuessANumber(27);
		thread2.start();
		try {
			thread2.join();
			// thread2 joins with main()
		} catch(InterruptedException e) {
			System .out.println("\tThread interrupted.");
		}
		// thread3 will start when thread2 is finished
		System.out.println("\tStarting thread3...");
		Thread thread3 = new GuessANumber(75);
		thread3.start();
		System.out.println("\tmain() is ending...");
	}

}
