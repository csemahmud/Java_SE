/**
 * 
 */
package com.mahmud.DecoratorApp1Package;

import com.mahmud.DecoratorApp1Package.classes.Beverage;
import com.mahmud.DecoratorApp1Package.classes.DarkRoast;
import com.mahmud.DecoratorApp1Package.classes.Expresso;
import com.mahmud.DecoratorApp1Package.classes.HouseBlend;
import com.mahmud.DecoratorApp1Package.classes.Mocha;
import com.mahmud.DecoratorApp1Package.classes.Soy;
import com.mahmud.DecoratorApp1Package.classes.Whip;

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
		
		System.out.println("\n");
		
		Beverage beverage1 = new Expresso();
		System.out.println(beverage1);
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3);
	}

}
