/**
 * 
 */
package com.mahmud.En01EnumDayAppPackage;

import com.mahmud.En01EnumDayAppPackage.classes.EnumTest;

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
        EnumTest nullDay = new EnumTest();
        nullDay.tellItLikeItIs();
		EnumTest firstDay = new EnumTest(
				EnumTest.Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(
        		EnumTest.Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(
        		EnumTest.Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(
        		EnumTest.Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(
        		EnumTest.Day.SUNDAY);
        seventhDay.tellItLikeItIs();
	}

}
