/**
 * 
 */
package com.mahmud.GN06AllowedAppPackage.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class Allowed {

	/**
	 * 
	 */
	public Allowed() {
		// TODO Auto-generated constructor stub
	}
	
	public static <T extends Exception , E> void append(List<E> list, Class<E> cls, Class<T> exp) 
			throws T, InstantiationException, IllegalAccessException {
	    E elem = cls.newInstance();   // OK
	    list.add(elem);
	    
	    if(list instanceof ArrayList<?>) {
	    	
	    	@SuppressWarnings("unchecked")
			ArrayList<String> list2 = (ArrayList<String>) list;
	    	System.out.println("\tArrayList is : " + list2);
	    } else {
	    	throw exp.newInstance();
	    }
	}

}
