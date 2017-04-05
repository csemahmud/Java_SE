/**
 * 
 */
package com.mahmud.MT06BankOperationAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class CheckingAccount extends Account {
	
	private int noOfTransactions;
	private double serviceCharge;

	/**
	 * @param accNo
	 * @param savingsCharge
	 */
	public CheckingAccount(String accNo, double serviceCharge) {
		super(accNo);
		this.serviceCharge = serviceCharge;
	}

	/**
	 * @return the noOfTransactions
	 */
	public int getNoOfTransactions() {
		return noOfTransactions;
	}

	/**
	 * @return the savingsCharge
	 */
	public double getServiceCharge() {
		return serviceCharge;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AbstractAccountApp1Package.classes.Account#withdraw(double)
	 */
	@Override
	public String withdraw(double amount) {
		// TODO Auto-generated method stub
		
		setBalance(getBalance() - amount);
		
		return getAccNo() + ": Withdrawn " + amount + " BDT successfully .";
	}

}
