/**
 * 
 */
package com.mahmud.CL11TimeCmprAppPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mahmud.CL11TimeCmprAppPackage.classes.MyTime;
import com.mahmud.CL11TimeCmprAppPackage.classes.TimeComparator;

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
		List<MyTime> list = new ArrayList<>();
		list.add(new MyTime(6, 24, 34));
		list.add(new MyTime(18, 14, 58));
		list.add(new MyTime());
		list.add(new MyTime(new MyTime(6, 05, 34)));
		list.add(new MyTime(12, 14, 58));
		list.add(new MyTime(6, 24, 22));
		
		System.out.println("\tUnsorted MyTime List = ");
		System.out.printf("\t%s", list);
		
		Collections.sort(list, new TimeComparator());
		
		System.out.println("\n\tSorted MyTime List = ");
		System.out.printf("\t%s", list);

	}

}
