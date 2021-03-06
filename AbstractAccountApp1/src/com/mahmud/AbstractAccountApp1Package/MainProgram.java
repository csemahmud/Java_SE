/**
 * 
 */
package com.mahmud.AbstractAccountApp1Package;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.AbstractAccountApp1Package.classes.Account;
import com.mahmud.AbstractAccountApp1Package.classes.CheckingAccount;
import com.mahmud.AbstractAccountApp1Package.classes.SavingsAccount;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public final class MainProgram {

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
		
		System.out.println("\n\n\n\tAbstractAccountApp1 .....");
		
		SavingsAccount aSavingsAccount = new SavingsAccount("SV:001", 4500);
		CheckingAccount aCheckingAccount = new CheckingAccount("CK:001", 2500);
		
		List<Account> accountList = new ArrayList<>();
		accountList.add(aSavingsAccount);
		accountList.add(aCheckingAccount);
		accountList.add(new Account("SV:002"){

			@Override
			public final String withdraw(double amount) {
				// TODO Auto-generated method stub
				
				if(getBalance() - amount >= 1000) {
					
					setBalance(getBalance() - amount);
					return "\n\tWithdrawn " + amount + " BDT successfully .";
				}
				
				return "\n\tUnderflow !!! Insufficient Balance .";
			}
			
		});
		
		showTransactions(accountList);

	}

	private final static void showTransactions(List<Account> accountList) {
		// TODO Auto-generated method stub
		
		accountList.stream().forEach(currentAccount -> {
			
			System.out.println(currentAccount.deposit(5000));
			System.out.println(currentAccount.withdraw(1000));
			System.out.println(currentAccount.withdraw(10000));
			
			System.out.println(currentAccount);
		});
	}

}
