/**
 * 
 */
package com.mahmud.InterfaceAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class CheckingAccount implements IAccount {
	
	private String accNo;
	private double balance;	
	private int noOfTransactions;
	private double serviceCharge;

	/**
	 * @param accNo
	 * @param serviceCharge
	 */
	public CheckingAccount(String accNo, double serviceCharge) {
		this();
		this.accNo = accNo;
		this.serviceCharge = serviceCharge;
	}

	/**
	 * 
	 */
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
		
		balance = 0.0000;
		
		System.out.println("\n\tChecking Constructor has been called .");
	}

	/* (non-Javadoc)
	 * @see com.mahmud.InterfaceAccountApp1Package.classes.IAccount#getAccNo()
	 */
	@Override
	public String getAccNo() {
		// TODO Auto-generated method stub
		return accNo;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.InterfaceAccountApp1Package.classes.IAccount#getBalance()
	 */
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	/**
	 * @return the noOfTransactions
	 */
	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	/**
	 * @return the serviceCharge
	 */
	public double getServiceCharge() {
		return serviceCharge;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.InterfaceAccountApp1Package.classes.IAccount#deposit(double)
	 */
	@Override
	public String deposit(double amount) {
		// TODO Auto-generated method stub
		
		balance += amount;
		return "\n\tDeposited " + amount + " BDT successfully .";
	}

	/* (non-Javadoc)
	 * @see com.mahmud.InterfaceAccountApp1Package.classes.IAccount#withdraw(double)
	 */
	@Override
	public String withdraw(double amount) {
		// TODO Auto-generated method stub
		
		balance -= amount;
		return "\n\tWithdrawn " + amount + " BDT successfully .";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n\tAccount [accNo = ").append(accNo).append("; balance = ").append(balance).append(" BDT only]");
		return builder.toString();
	}

}
