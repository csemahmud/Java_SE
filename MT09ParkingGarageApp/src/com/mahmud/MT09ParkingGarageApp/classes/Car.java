/**
 * 
 */
package com.mahmud.MT09ParkingGarageApp.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Car implements Runnable {
	private ParkingGarage parkingGarage;
	private String name;

	/**
	 * @param parkingGarage
	 */
	public Car(String name, ParkingGarage parkingGarage) {
		this();
		this.parkingGarage = parkingGarage;
		this.name = name;
		Thread thread = new Thread(this);
		thread.setName(this.name);
		thread.start();
	}

	/**
	 * 
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			System.out.println("\t" + Thread.currentThread().getName()+": is driving ....");
			try {
				Thread.currentThread().sleep((int)(Math.random() * 10000)); // drive before parking
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			long startTime = System.currentTimeMillis();
			parkingGarage.enter(this);
			long endTime = System.currentTimeMillis();
			float time = (endTime-startTime) / 1000.0f;
			System.out.println("\t" + Thread.currentThread().getName() 
					+ ": entered after waiting for " + time + "s");
			try {
				Thread.currentThread().sleep((int)(Math.random() * 20000)); // stay within the parking garage
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			parkingGarage.leave();
			System.out.println("\t" + Thread.currentThread().getName()+": left");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
