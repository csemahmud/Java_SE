/**
 * 
 */
package com.mahmud.NS10AutoBoxingAppPackage;

import java.util.ArrayList;
import java.util.List;

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
		
		// List<int> integerList = new ArrayList<>();
		// Above Code is wrong
		
		List<Integer> integerList = new ArrayList<>();
		for(int i = 0; i < 51; i++){
			integerList.add(i);
			
			// AutoBoxing
			// integerList.add(Integer.valueOf(i));
		}
		
		int sum = sumEven(integerList);
		
		System.out.println("\tSum of Even Numbers = " + sum);
		
		Integer i = new Integer(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        System.out.println("\tabsolute value of " + i + " = " + absVal);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.1416);    // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = doubleList.get(0);
        System.out.println("\tpi = " + pi);

	}

	private static int absoluteValue(Integer i) {
		// TODO Auto-generated method stub
		
		return (i < 0) ? -i : i;
		
		// UnBoxing
		//return (i.intValue() < 0) ? -i.intValue() : i.intValue();
	}

	private static int sumEven(List<Integer> integerList) {
		// TODO Auto-generated method stub
		

		int sum = 0;
		for (Integer integer : integerList) {
			if(integer % 2 == 0){
				sum += integer;
			}
			
			// UnBoxing
			//if(integer.intValue() % 2 == 0){
			//	sum += integer.intValue();
			//}
		}
		
		return sum;
	}

}
