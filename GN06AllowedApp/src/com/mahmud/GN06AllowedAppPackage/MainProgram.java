/**
 * 
 */
package com.mahmud.GN06AllowedAppPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.mahmud.GN06AllowedAppPackage.classes.Allowed;
import com.mahmud.GN06AllowedAppPackage.classes.NotArrayListException;

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
		List<String> stringList = new ArrayList<>();
		stringList.add("Mahmud");
		stringList.add("Alia");
		
		try {
			Allowed.append(stringList, String.class, NotArrayListException.class);
		} catch (InstantiationException | IllegalAccessException | NotArrayListException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		System.out.println();
		List<String> stringList2 = new LinkedList<>();
		stringList2.add("Shraddha");
		stringList2.add("Kapoor");
		
		try {
			Allowed.append(stringList2, String.class, NotArrayListException.class);
		} catch (InstantiationException | IllegalAccessException | NotArrayListException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
