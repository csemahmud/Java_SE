/**
 * 
 */
package com.mahmud.AdapterApp1Package;

import com.mahmud.AdapterApp1Package.classes.IDuck;
import com.mahmud.AdapterApp1Package.classes.TurkeyAdapterToDuck;
import com.mahmud.AdapterApp1Package.classes.WildTurkey;

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
		 
		IDuck duck 
		= new TurkeyAdapterToDuck(
				new WildTurkey());
		
		System.out.print("\n\n\n\t");
		duck.quack();
		System.out.print("\n\n\t");
		duck.fly();

	}

}
