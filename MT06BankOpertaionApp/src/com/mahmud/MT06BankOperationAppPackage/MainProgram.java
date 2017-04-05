/**
 * 
 */
package com.mahmud.MT06BankOperationAppPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.mahmud.MT06BankOperationAppPackage.classes.Bank;
import com.mahmud.MT06BankOperationAppPackage.classes.BankEmployee;

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
		Bank bank = new Bank("Bangladesh Bank");
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(new BankEmployee("ALIA", bank));
		taskList.execute(new BankEmployee("SHRADDHA", bank));
		taskList.shutdown();
		while(!taskList.isTerminated());
		System.out.println("\tFinishing Main ....");
		
	}

}
