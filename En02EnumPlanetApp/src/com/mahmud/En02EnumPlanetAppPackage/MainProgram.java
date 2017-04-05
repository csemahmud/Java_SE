/**
 * 
 */
package com.mahmud.En02EnumPlanetAppPackage;

import java.util.EnumSet;

import com.mahmud.En02EnumPlanetAppPackage.classes.Planet;

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
        double earthWeight = 85;
        double mass = earthWeight/Planet.EARTH.surfaceGravity();
        
        System.out.println("\tYour mass is = " + mass);
        System.out.println("\tDisplaying you weight in every planet : ");
        for (Planet planet : Planet.values()) {
           System.out.printf("\tYour weight on %s is %f%n",
                             planet, planet.surfaceWeight(mass));
        }
        
        earthWeight = 70;
        mass = earthWeight/Planet.EARTH.surfaceGravity();
        displayPlanets(mass, Planet.EARTH, Planet.SATURN);
	}

	private static void displayPlanets(double mass, Planet from, Planet to) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("\tYour mass is = " + mass);
        System.out.println("\tDisplaying you weight from " 
        		+ from + " to " + to + " : ");
		
		for (Planet planet : EnumSet.range(from, to)) {
			System.out.printf("\tYour weight on %s is %f%n",
                    planet, planet.surfaceWeight(mass));
		}
		
	}

}
