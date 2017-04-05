/**
 * 
 */
package com.mahmud.En02EnumPlanetAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public enum Planet implements IPlanet {
	MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters

	/**
	 * @param mass
	 * @param radius
	 */
	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	private Planet() {
		// TODO Auto-generated constructor stub
		this(0,0);
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return mass;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public double surfaceGravity() {
		// TODO Auto-generated method stub
		return G * mass / (radius * radius);
	}

	@Override
	public double surfaceWeight(double otherMass) {
		// TODO Auto-generated method stub
		return otherMass * surfaceGravity();
	}

}
