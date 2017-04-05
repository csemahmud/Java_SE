/**
 * 
 */
package com.mahmud.Test_Fisrt_JavaPackage;

import com.mahmud.Test_Fisrt_JavaPackage.classes.Car;
import com.mahmud.Test_Fisrt_JavaPackage.classes.StartStop;

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
		Car c = new Car ("Lamboghini");
		c.start ();
		System.out.println (c.toString ());
		c.stop ();
		System.out.println (c.toString ());
		StartStop ss = c;
		ss.start ();
		System.out.println (ss.toString ());
		ss.stop ();
		System.out.println (ss.toString ());
	}

}
