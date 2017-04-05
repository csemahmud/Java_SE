/**
 * 
 */
package com.mahmud.AbstractAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public final class CheckingAccount extends Account {
	
	private int noOfTransactions;
	private double serviceCharge;

	/**
	 * @param accNo
	 * @param savingsCharge
	 */
	public CheckingAccount(String accNo, double serviceCharge) {
		super(accNo);
		this.serviceCharge = serviceCharge;
		
		System.out.println("\n\tChecking Constructor has been called .");
	}

	/**
	 * @return the noOfTransactions
	 */
	public final int getNoOfTransactions() {
		return noOfTransactions;
	}

	/**
	 * @return the savingsCharge
	 */
	public final double getServiceCharge() {
		return serviceCharge;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AbstractAccountApp1Package.classes.Account#withdraw(double)
	 */
	@Override
	public final String withdraw(double amount) {
		// TODO Auto-generated method stub
		
		setBalance(getBalance() - amount);
		
		return "\n\tWithdrawn " + amount + " BDT successfully .";
	}

}
