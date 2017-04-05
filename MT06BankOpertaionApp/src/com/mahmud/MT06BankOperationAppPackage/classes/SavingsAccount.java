/**
 * 
 */
package com.mahmud.MT06BankOperationAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class SavingsAccount extends Account {
	
	private double interestAmount;

	/**
	 * @param accNo
	 * @param interestAmount
	 */
	public SavingsAccount(String accNo, double interestAmount) {
		super(accNo);
		this.interestAmount = interestAmount;
	}

	/**
	 * @return the interestAmount
	 */
	public double getInterestAmount() {
		return interestAmount;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.AbstractAccountApp1Package.classes.Account#withdraw(double)
	 */
	@Override
	public String withdraw(double amount) throws UnderflowException {
		// TODO Auto-generated method stub
		
		if(getBalance() - amount >= 1000) {
			
			setBalance(getBalance() - amount);
			return getAccNo() + ": Withdrawn " + amount + " BDT successfully .";
		}
		
		throw new UnderflowException(this);
	}

}
