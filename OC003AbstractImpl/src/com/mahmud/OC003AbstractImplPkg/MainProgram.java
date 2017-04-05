/**
 * 
 */
package com.mahmud.OC003AbstractImplPkg;

import com.mahmud.OC003AbstractImplPkg.classes.AcmeRover;
import com.mahmud.OC003AbstractImplPkg.classes.Car;
import com.mahmud.OC003AbstractImplPkg.classes.SUV;

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
		
		Car car = new AcmeRover();
		car.startEngine();
		car.goForward();
		car.reverse();
		car.stop();
		car.turn(1);
		
		// car.enable4wd();
		// Invalid
		
		System.out.println();
		
		if(car instanceof AcmeRover) {
			((SUV) car).enable4wd();
			((AcmeRover) car).goOfRoad();
		}

	}

}
