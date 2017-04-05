/**
 * 
 */
package com.mahmud.OC001StaticConstructorPkg;

import com.mahmud.OC001StaticConstructorPkg.classes.Person;

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
		
		System.out.println("\n\n\n");
		
		System.out.println("\tgetPersonCount() = " 
				+ Person.getPersonCount());
		
		@SuppressWarnings("unused")
		Person p = new Person();
		
		System.out.println("\tgetPersonCount() = " 
				+ Person.getPersonCount());
		Person.setPersonCount(100);
		p = new Person();
		System.out.println("\tgetPersonCount() = " 
				+ Person.getPersonCount());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MainProgram();

	}

}
