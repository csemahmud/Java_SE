/**
 * 
 */
package com.mahmud.En02EnumPlanetAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface IPlanet {
	// universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;
    double getMass();
    double getRadius();
    double surfaceGravity();
    double surfaceWeight(double otherMass);
}
