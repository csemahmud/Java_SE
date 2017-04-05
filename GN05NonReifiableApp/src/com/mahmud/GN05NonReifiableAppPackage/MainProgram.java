/**
 * 
 */
package com.mahmud.GN05NonReifiableAppPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mahmud.GN05NonReifiableAppPackage.classes.ArrayBuilder;

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
		
		List<String> stringListA = new ArrayList<>();
	    List<String> stringListB = new ArrayList<>();

	    ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
	    ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
	    List<List<String>> listOfStringLists = new ArrayList<>();
	    ArrayBuilder.addToList(listOfStringLists,
	      stringListA, stringListB);
	    
	    System.out.println("\n\n\n\t" + listOfStringLists);

	    ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));

	}

}
