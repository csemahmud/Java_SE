/**
 * 
 */
package com.mahmud.NS03ArithmeticAppPackage;
import static java.lang.Math.*;

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
		
		double numA = (-1) * E / random();		
		// MUST import static java.lang.Math.*;
		
        double numB = (-1) * random();
        int numC = 16, numD = 45;

        System.out.printf("\tThe absolute value " + "of %.3f is %.3f%n", 
        		numA, abs(numA));
        // MUST import static java.lang.Math.*;

        System.out.printf("\tThe ceiling of " + "%.2f is %.0f%n", 
        		numB, ceil(numB));

        System.out.printf("\tThe floor of " + "%.2f is %.0f%n", 
        		numB, floor(numB));

        System.out.printf("\tThe rint of %.2f " + "is %.0f%n", 
        		numB, rint(numB));

        System.out.printf("\tThe max of %d and " + "%d is %d%n",
        		numC, numD, max(numC, numD));

        System.out.printf("\tThe min of of %d " + "and %d is %d%n%n",
        		numC, numD, min(numC, numD));
        
        double radians = PI / (round(random() * 5) + 1);
							// Generates value from 1 to 6 inclusive 
		double degrees = toDegrees(radians);
        
        System.out.format("\tThe value of pi " + "is %.4f%n",
                           PI);

        System.out.format("\tThe sine of %.1f " + "degrees is %.4f%n",
                          degrees, sin(radians));

        System.out.format("\tThe cosine of %.1f " + "degrees is %.4f%n",
                          degrees, cos(radians));

        System.out.format("\tThe tangent of %.1f " + "degrees is %.4f%n",
                          degrees, tan(radians));

        System.out.format("\tThe arcsine of %.4f " + "is %.4f degrees %n", 
                          sin(radians), 
                          toDegrees(asin(sin(radians))));

        System.out.format("\tThe arccosine of %.4f " + "is %.4f degrees %n", 
                          cos(radians),  
                          toDegrees(acos(cos(radians))));

        System.out.format("\tThe arctangent of %.4f " + "is %.4f degrees %n%n", 
                          tan(radians), 
                          toDegrees(atan(tan(radians))));
        
        double e5  = pow(E, 5);
        System.out.format("\te to the power 5 = %f%n", e5);
        System.out.format("\tln(%f) = %f%n", e5, log(e5));
        System.out.format("\tanti-ln(%f) = %f%n", 
        		log(e5), exp(log(e5)));
        double tenP3 = pow(10, 3);
        System.out.format("\t10 to the power 3 = %f%n", tenP3);
        System.out.format("\tlog10(%f) = %f%n", tenP3, log10(tenP3));
        System.out.format("\tsquare root of pi = %f%n", sqrt(PI));
	}

}
