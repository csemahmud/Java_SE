/**
 * 
 */
package com.mahmud.InheritanceAccountApp1Package.classes;

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
	 * @see com.mahmud.InheritanceAccountApp1Package.classes.Account#withdraw(double)
	 */
	@Override
	public final String withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(getBalance() - amount >= 1000) {
			
			return super.withdraw(amount);
		}
		
		return "\n\tUnderflow !!! Insufficient Balance .";
	}

}
