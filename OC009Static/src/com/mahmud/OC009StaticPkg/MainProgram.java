/**
 * 
 */
package com.mahmud.OC009StaticPkg;

import com.mahmud.OC009StaticPkg.Classes.Animal;
import com.mahmud.OC009StaticPkg.Classes.Dog;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private static int staticInt;
	private int nonStaticInt;

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
		
		staticInt++;
		nonStaticInt++;
	}

	/**
	 * @return the nonStaticInt
	 */
	public synchronized final int getNonStaticInt() {
		return nonStaticInt;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\n");
		
		MainProgram mainProgram = new MainProgram();
		mainProgram = new MainProgram();
		mainProgram = new MainProgram();
		
		System.out.println("\tstaticInt = " + staticInt);
		System.out.println("\tstaticInt = " 
				+ MainProgram.staticInt);
		System.out.println("\tstaticInt = " 
				+ mainProgram.staticInt);
		
//		System.out.println("\tnonStaticInt = " 
//				+ getNonStaticInt());
		// Compiler Error
		// Cannot make a static reference to the 
		// non-static method getNonStaticInt() from 
		// the type MainProgram
				
//		System.out.println("\tnonStaticInt = " 
//				+ nonStaticInt);
		// Compiler Error
		// Cannot make a static reference to the 
		// non-static field nonStaticInt
		
		System.out.println("\tnonStaticInt = " 
					+ mainProgram.getNonStaticInt());
		System.out.println("\tnonStaticInt = " 
				+ mainProgram.nonStaticInt);
		
		System.out.println();
		
		Animal [] animals = {
				new Dog(),
				new Animal(),
				new Dog()
		}; 
		
		for (Animal animal : animals) {
			animal.printType();
		}
		
		Dog.printType();
		
		// ((Dog)animals[0]).printType();
		// Class Cast Exception
		
		((Dog)animals[0]).printType();
	}

}
