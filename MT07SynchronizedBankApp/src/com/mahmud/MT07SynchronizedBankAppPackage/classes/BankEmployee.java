/**
 * 
 */
package com.mahmud.MT07SynchronizedBankAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class BankEmployee implements Runnable {

	private String name;
	private Bank bank;

	/**
	 * @param name
	 * @param bank
	 */
	public BankEmployee(String name, Bank bank) {
		this();
		this.name = name;
		this.bank = bank;
	}

	/**
	 * 
	 */
	public BankEmployee() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName(name);
		
		System.out.println("\tStarting Thread : " + 
				Thread.currentThread().getName());
		
		for(int i = 0; i < 1000; i++){
			try {
				System.out.println(bank.transaction(name, 
						TransactionType.DEPOSIT, 1, 1));
			} catch (UnderflowException ex) {
				// TODO Auto-generated catch block
				System.err.println("\t" + ex.getMessage());
			}
			try {
				Thread.currentThread().sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			System.out.println(bank.transaction(name, 
					TransactionType.WITHDRAW, 100, 1000.51));
		} catch (UnderflowException ex) {
			// TODO Auto-generated catch block
			System.err.println("\t" + ex.getMessage());
		}
		
		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(bank.transaction(name, 
					TransactionType.WITHDRAW, 1, 1000.00));
		} catch (UnderflowException ex) {
			// TODO Auto-generated catch block
			System.err.println("\t" + ex.getMessage());
		}
		
		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\tFinishing Thread : " + 
				Thread.currentThread().getName());
	}

}
