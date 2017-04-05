/**
 * 
 */
package com.mahmud.MT09ParkingGarageApp.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ParkingGarage {
	private int places;

	/**
	 * @param places
	 */
	public ParkingGarage(int places) {
		this();
		if(places < 0){
			places = 0;
		}
		this.places = places;
	}

	/**
	 * 
	 */
	public ParkingGarage() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void enter(Car car) { // enter parking garage
		while (places == 0) {
			try {
				System.out.println("\tGarage is full . " + car.getName()+ ": is waiting to enter");
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		places--;
	}
	
	public synchronized void leave() { // leave parking garage
		places++;
		notify();
	}

}
