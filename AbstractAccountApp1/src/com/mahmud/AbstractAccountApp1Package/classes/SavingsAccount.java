/**
 * 
 */
package com.mahmud.AbstractAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public final class SavingsAccount extends Account {
	
	private double interestAmount;

	/**
	 * @param accNo
	 * @param interestAmount
	 */
	public SavingsAccount(String accNo, double interestAmount) {
		super(accNo);
		this.interestAmount = interestAmount;
		
		System.out.println("\n\tSavings Constructor has been called .");
	}

	/**
	 * @return the interestAmount
	 */
	public final double getInterestAmount() {
		return interestAmount;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AbstractAccountApp1Package.classes.Account#withdraw(double)
	 */
	@Override
	public final String withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(getBalance() - amount >= 1000) {
			
			setBalance(getBalance() - amount);
			return "\n\tWithdrawn " + amount + " BDT successfully .";
		}
		
		return "\n\tUnderflow !!! Insufficient Balance .";
	}

}
