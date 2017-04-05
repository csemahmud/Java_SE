/**
 * 
 */
package com.mahmud.Simple_VirtualPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface IAnimal {
	
	void eat() throws Exception;
	
//	void eat() {
//		System.out.println("\n\tI eat like a generic Animal.");
//	} 
//	Error
	
	static void sleep(){
		System.out.println("\tI sleep like a generic Animal.");
	}
	
	static void sleep(String type){
		System.out.println("\tI sleep like a " + type + ".");
	}
	
	default void breathe(){
		System.out.println("\tI breathe like a generic Animal.");
	}
	
	default void breathe(String type){
		System.out.println("\tI breathe like a " + type + ".");
	}

}
