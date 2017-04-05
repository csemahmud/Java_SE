/**
 * 
 */
package com.mahmud.CL14ProrityQuAppPackage;

import java.util.Arrays;
import java.util.PriorityQueue;

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
		Number[] numbers = 
			{ 0, null, 3, 3, 12, -2.5f, 10, 
					Double.MAX_VALUE, Double.MIN_VALUE };
		System.out.println("\tnumbers = ");
		System.out.println("\t" + Arrays.toString(numbers));
		PriorityQueue<Number> pQueue = new PriorityQueue<>();
		
		for (Number number : numbers) {
			
			if(number != null) {
				pQueue.offer(number.doubleValue());
			}
			
		}
		
		System.out.println();
		System.out.println("\tPeeking and Polling From Proiroty Queue : ");
		while(pQueue.size() > 0){
			System.out.print("\tPeek = " + pQueue.peek() + ", ");
			System.out.println("Poll = " + pQueue.poll() + ";");
		}

	}

}
