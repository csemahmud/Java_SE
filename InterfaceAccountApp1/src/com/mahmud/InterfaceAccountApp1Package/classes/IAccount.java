/**
 * 
 */
package com.mahmud.InterfaceAccountApp1Package.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface IAccount {
	
	String getAccNo();
	double getBalance();
	String deposit(double amount);
	String withdraw(double amount);

}
