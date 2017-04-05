/**
 * 
 */
package com.mahmud.OC001StaticConstructorPkg.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Person {
	
	{
		setPersonCount(3);
		personCount += 3;
		
		System.out.println(
				"\tInside first Initilizer, personCount = " 
				+ personCount);
	}
	
	static {
		setPersonCount(10);
		personCount = 5;
		
		// personCount += 5;
		// Compiler Error
		// Cannot reference a field 
		// before it is defined
		
		System.out.println(
				"\tInside first static, personCount = " 
						+ getPersonCount());
		// System.out.println("\t" + personCount);
		// Compiler Error : Can not reference a field
		// Before it was defined
	}
	
	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println(
				"\tInside Constructor, personCount = " 
						+ personCount);
	}

	private static int personCount = 1000;
	
	{
		personCount += 6;
		
		System.out.println(
				"\tInside second Initilizer, personCount = " 
				+ personCount);
	}

	static {
		personCount += 20;
		System.out.println(
				"\tInside second static, personCount = " 
						+ getPersonCount());
	}
	
	{
		personCount += 9;
		
		System.out.println(
				"\tInside third Initilizer, personCount = " 
				+ personCount);
	}
	
	static {
		personCount += 30;
		System.out.println(
				"\tInside third static, personCount = " 
						+ getPersonCount());
	}

	/**
	 * @return the personCount
	 */
	public static int getPersonCount() {
		return personCount;
	}

	/**
	 * @param personCount the personCount to set
	 */
	public static void setPersonCount(int personCount) {
		Person.personCount = personCount;
	}

}
