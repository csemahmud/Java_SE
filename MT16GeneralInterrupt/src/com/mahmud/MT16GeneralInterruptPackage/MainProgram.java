/**
 * 
 */
package com.mahmud.MT16GeneralInterruptPackage;

import com.mahmud.MT16GeneralInterruptPackage.classes.GeneralInterrupt;

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
		GeneralInterrupt si = new GeneralInterrupt();
	      Thread t = new Thread(si);
	      t.start();
	      try {
	         Thread.sleep(2000);
	      } catch (InterruptedException x) {
	      }
	      System.out.println("\tin main() - interrupting other thread");
	      t.interrupt();
	      System.out.println("\tin main() - leaving");
	   
	}

}
