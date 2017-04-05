/**
 * 
 */
package com.mahmud.InterfaceAccountApp1Package;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.InterfaceAccountApp1Package.classes.CheckingAccount;
import com.mahmud.InterfaceAccountApp1Package.classes.IAccount;
import com.mahmud.InterfaceAccountApp1Package.classes.SavingsAccount;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n\n\tInterfaceAccountApp1 .....");
		
		SavingsAccount aSavingsAccount = new SavingsAccount("SV:001", 4500);
		CheckingAccount aCheckingAccount = new CheckingAccount("CK:001", 2500);
		
		List<IAccount> accountList = new ArrayList<>();
		accountList.add(aSavingsAccount);
		accountList.add(aCheckingAccount);
		accountList.add(new IAccount(){
			
			private String accNo = "SV:002";
			private double balance = 0.0000;

			@Override
			public String withdraw(double amount) {
				// TODO Auto-generated method stub
				
				if(getBalance() - amount >= 1000) {
					
					balance = getBalance() - amount;
					return "\n\tWithdrawn " + amount + " BDT successfully .";
				}
				
				return "\n\tUnderflow !!! Insufficient Balance .";
			}

			@Override
			public String getAccNo() {
				// TODO Auto-generated method stub
				return accNo;
			}

			@Override
			public double getBalance() {
				// TODO Auto-generated method stub
				return balance;
			}

			@Override
			public String deposit(double amount) {
				// TODO Auto-generated method stub
				
				balance += amount;
				return "\n\tDeposited " + amount + " BDT successfully .";
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
			
		});
		
		showTransactions(accountList);

	}

	private static void showTransactions(List<IAccount> accountList) {
		// TODO Auto-generated method stub
		
		accountList.stream().forEach(currentAccount -> {
			
			System.out.println(currentAccount.deposit(5000));
			System.out.println(currentAccount.withdraw(1000));
			System.out.println(currentAccount.withdraw(10000));
			
			System.out.println(currentAccount);
		});
	}

}
