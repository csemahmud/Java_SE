/**
 * 
 */
package com.mahmud.MT07SynchronizedBankAppPackage.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Bank {
	
	private List<Account> accountList;
	private String bankName;

	/**
	 * @param bankName
	 */
	public Bank(String bankName) {
		this();
		this.bankName = bankName;
	}

	/**
	 * 
	 */
	public Bank() {
		// TODO Auto-generated constructor stub
		
		accountList = new ArrayList<>();
		for(int i = 1; i <= 100; i+=2){
			accountList.add(new SavingsAccount("Sav : " + i, Math.random()*100));
			accountList.add(new CheckingAccount("Chk : " + (i+1), Math.random()*100));
		}
	}
	
	public synchronized String transaction(String employeeName, TransactionType type, 
			int accountNo, double amount) throws UnderflowException{
		synchronized (accountList.get(accountNo - 1)) {
			switch (type) {
			case DEPOSIT:
				return "\t" + accountList.get(accountNo - 1).deposit(amount) 
						+ " by " + employeeName + "\n\t" 
						+ accountList.get(accountNo - 1);
			case WITHDRAW:
				try {
					return "\t" + accountList.get(accountNo - 1).withdraw(amount) 
							+ " by " + employeeName + "\n\t" 
							+ accountList.get(accountNo - 1);
				} catch (UnderflowException ex) {
					// TODO Auto-generated catch block
					throw ex;
				}
			default:
				return "\tNo Transaction by " + employeeName;
			}	
		}
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
