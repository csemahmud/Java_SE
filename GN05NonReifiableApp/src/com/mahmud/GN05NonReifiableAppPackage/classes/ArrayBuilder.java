/**
 * 
 */
package com.mahmud.GN05NonReifiableAppPackage.classes;

import java.util.Arrays;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class ArrayBuilder {

	/**
	 * 
	 */
	public ArrayBuilder() {
		// TODO Auto-generated constructor stub
	}

	  @SafeVarargs
	public static <T> void addToList (List<T> listArg, T... elements) {
	    for (T x : elements) {
	      listArg.add(x);
	    }
	  }

	  @SafeVarargs
	public static void faultyMethod(List<String>... l) {
	    Object[] objectArray = l;     // Valid
	    
	    System.out.println("\n\t" + l[0].get(0) 
	    		+ " " + l[1].get(0));
	    
	    objectArray[0] = Arrays.asList(42);
	    
	    try {
		    @SuppressWarnings("unused")
			String s1 = l[0].get(0);       // ClassCastException thrown here	
		} catch (ClassCastException ex) {
			// TODO: handle exception
			ex.printStackTrace();
			Object obj = l[0].get(0);
			System.out.println("\n\t" + obj.toString()
					+ " " + l[1].get(0));
		}
	  }

}
