/**
 * 
 */
package com.mahmud.MT06BankOperationAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class Account {
	
	private String accNo;
	private double balance;
	
	/**
	 * @param accNo
	 */
	public Account(String accNo) {
		this();
		this.accNo = accNo;
	}

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
		
		balance = 0.0000;
	}

	/**
	 * @param balance the balance to set
	 */
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public final String deposit(double amount) {
		balance += amount;
		return accNo + ": Deposited " + amount + " BDT successfully .";
	}
	
	public abstract String withdraw(double amount) throws UnderflowException;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accNo = ").append(accNo).append("; balance = ").append(balance).append(" BDT only]");
		return builder.toString();
	}

}
