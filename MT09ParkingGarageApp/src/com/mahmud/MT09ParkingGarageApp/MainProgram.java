/**
 * 
 */
package com.mahmud.MT09ParkingGarageApp;

import com.mahmud.MT09ParkingGarageApp.classes.Car;
import com.mahmud.MT09ParkingGarageApp.classes.ParkingGarage;

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
		
		System.out.println("\n\n");
		ParkingGarage parkingGarage = new ParkingGarage(10);
		for (int i=1; i<= 40; i++) {
			new Car("Car "+i, parkingGarage);
		}

	}

}
