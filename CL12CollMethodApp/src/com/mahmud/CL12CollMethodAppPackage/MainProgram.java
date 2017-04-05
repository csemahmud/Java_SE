/**
 * 
 */
package com.mahmud.CL12CollMethodAppPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		String[] colors = 
			{ "red", "white", "blue", "black", "yellow", "purple" };
		List<String> list =
				new ArrayList<>(Arrays.asList(colors));
		
		System.out.println("\tlist = " + list);
		
		Collections.reverse(list);
		System.out.println("\tAfter Reversing, list = ");
		System.out.println("\t" + list);
		
		List<String> copyList = Arrays.asList(
				new String[colors.length + 3]);
		Collections.copy(copyList, list);
		System.out.println("\tAfter Copy, copyList = ");
		System.out.println("\t" + copyList);
		
		Collections.fill(copyList, "RED");
		System.out.println("\tAfter Calling fill, copyList = ");
		System.out.println("\t" + copyList);
		
		Collections.sort(list);
		System.out.println("\tAfter Sorting, list = ");
		System.out.println("\t" + list);
		
		System.out.println();
		
		printSearchResults(list, colors[3]);
		printSearchResults(list, colors[0]);
		printSearchResults(list, "aqua");
		
		List<String> list2 = new ArrayList<>();
		list2.add("tan");
		list2.add("purple");
		list2.add("pink");
		
		System.out.println();
		
		System.out.println("\tBefore addAll(), list2 = ");
		System.out.println("\t" + list2);
		
		boolean isDisjoint = Collections.disjoint(list, list2);
		System.out.printf("\tlist and list2 %s elements in common%n",
				(isDisjoint) ? "do NOT have" : "HAVE");
		
		Collections.addAll(list2, colors);
		
		System.out.println("\tAfter addAll(), list2 = ");
		System.out.println("\t" + list2);
		System.out.println("\tFrequency of \"purple\" in list2 = "
				+ Collections.frequency(list2, "purple"));

	}

	private static void printSearchResults(
			List<String> list, String key) {
		// TODO Auto-generated method stub
		
		int result = Collections.binarySearch(list, key);
		if(result >= 0) {
			System.out.printf("\t\"%s\" FOUND at index %d%n",
					key, result);
		} else {
			System.out.printf("\t\"%s\" was NOT found%n", key);
		}
	}

}
