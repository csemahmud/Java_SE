/**
 * 
 */
package com.mahmud.InheritanceAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public final class CheckingAccount extends Account {
	
	private int noOfTransactions;
	private double serviceCharge;

	/**
	 * @param accNo
	 * @param serviceCharge
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
	 * @return the serviceCharge
	 */
	public final double getServiceCharge() {
		return serviceCharge;
	}

}
