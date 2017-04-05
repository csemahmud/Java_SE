/**
 * 
 */
package com.mahmud.CL03ListAppPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private static <E> void swap(List<E> list, int index1, int index2) {
	    E temp = list.get(index1);
	    list.set(index1, list.get(index2));
	    list.set(index2, temp);
	}
	
	private static void myShuffle(List<?> list, Random rnd) {
	    for (int i = list.size(); i > 1; i--) {
	        swap(list, i - 1, rnd.nextInt(i));
	    }
	}
	
	private static <E> int indexOf(List<E> list, E e) {
	    for (ListIterator<E> listIterator = list.listIterator(); listIterator.hasNext(); ) {
	        if (e == null ? listIterator.next() == null : e.equals(listIterator.next())) {
	            return listIterator.previousIndex();
	        }
	    }
	    // Element not found
	    return -1;
	}
	
	public static <E> 
    void replace(List<E> list, E val, List<? extends E> newVals) {
    for (ListIterator<E> listIterator = list.listIterator(); listIterator.hasNext(); ){
        if (val == null ? listIterator.next() == null : val.equals(listIterator.next())) {
        	listIterator.remove();
            for (E e : newVals){
            	listIterator.add(e);
            }
        }
    }
}

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
        
		List<Number> numberList = new ArrayList<>();
		numberList.add(0);
		numberList.add(3);
		numberList.add(-5);
		numberList.add(3);
		numberList.add(0);
		numberList.add(0);
		// numberList.add('M');
		// Compiler Error
		// The method add(Number) in the type 
		// List<Number> is not applicable for the 
		// arguments (char)
		numberList.add(null);
		numberList.add(Math.pow(Math.PI, Math.E));
		numberList.add(-2.5f);
		numberList.add(null);
		numberList.add(Double.MAX_VALUE);
		numberList.add(Double.MIN_VALUE);
		
		System.out.println("\tnumberList : " + numberList);
		myShuffle(numberList, new Random());
		System.out.println("\tAfter myShuffle() .....");
		System.out.println("\tnumberList : " + numberList);
		Collections.shuffle(numberList);
		System.out.println("\tAfter Collections.shuffle() .....");
		System.out.println("\tnumberList : " + numberList);
		System.out.println("\tindexOf(numberList, 3) = " 
				+ indexOf(numberList, 3));
		System.out.println("\tindexOf(numberList, null) = " 
				+ indexOf(numberList, null));
		System.out.println("\tindexOf(numberList, 32) = " 
				+ indexOf(numberList, 32));
		List<Number> newVals = new ArrayList<>();
		newVals.add(110);
		newVals.add(120);
		newVals.add(130);
		replace(numberList, null, newVals);
		System.out.println("\tAfter replaceing null by newVals .....");
		System.out.println("\tnumberList : \n\t" + numberList);
		newVals.clear();
		newVals.add(Double.MIN_VALUE);
		newVals.add(null);
		replace(numberList, Double.MAX_VALUE, newVals);
		System.out.println("\tAfter replaceing Double.MAX_VALUE by newVals .....");
		System.out.println("\tnumberList : \n\t" + numberList);
		System.out.println("\tsize = " + numberList.size());
		numberList.subList(3, 8).clear();
		System.out.println("\tAfter clearing from index 3 to 8 .....");
		System.out.println("\tnumberList : " + numberList);
		System.out.println("\tRemoving index 3, Object : " 
					+ numberList.get(3));
		numberList.remove(3);
		System.out.println("\tnumberList : " + numberList);
		System.out.println("\tRemoving Object 3, index : "
				+ numberList.indexOf(3));
		numberList.remove(Integer.valueOf(3));
		System.out.println("\tnumberList : " + numberList);
		if(numberList.contains(120)) {
			numberList.add(numberList.indexOf(120), 119);
			System.out.println("\tPlacing 119 before 120,");
			System.out.println("\tnumberList : " 
					+ numberList);
		}
		System.out.printf("\tnumberList.contains(3) = %b%n",
				numberList.contains(3));

	}

}
