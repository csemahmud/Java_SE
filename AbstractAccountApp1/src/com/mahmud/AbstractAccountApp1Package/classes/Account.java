/**
 * 
 */
package com.mahmud.AbstractAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public abstract class Account {
	
	private final String accNo;
	private double balance;
	
	/**
	 * @param accNo
	 */
	public Account(String accNo) {
		
		this.accNo = accNo;
		System.out.println("\n\tBase Constructor has been called .");
	}

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
		
		this("");
	}

	/**
	 * @param balance the balance to set
	 */
	protected final void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accNo
	 */
	public final String getAccNo() {
		return accNo;
	}

	/**
	 * @return the balance
	 */
	public final double getBalance() {
		return balance;
	}
	
	public final String deposit(double amount) {
		balance += amount;
		return "\n\tDeposited " + amount + " BDT successfully .";
	}
	
	public abstract String withdraw(double amount);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tAccount [accNo = ").append(accNo).append("; balance = ").append(balance).append(" BDT only]");
		return builder.toString();
	}

}
