/**
 * 
 */
package com.mahmud.SingletonApp1Package;

import com.mahmud.SingletonApp1Package.classes.Singleton;

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
		
		// Singleton singleton = new Singleton(); Invalid
		Singleton singleton1 = Singleton.getUniqueInstance();
		singleton1.setNumber1(3);
		singleton1.setText1("Super Man");
		
		Singleton singleton2 = Singleton.getUniqueInstance();
		singleton2.setNumber1(5);
		singleton2.setText1("Iron Man");
		
		System.out.println("\n");
		System.out.println(singleton1);
		System.out.println(singleton2);

	}

}
