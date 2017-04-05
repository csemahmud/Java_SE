/**
 * 
 */
package com.mahmud.CL05HeapSortAppPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
        
		List<Number> numberList = new ArrayList<>();
		numberList.add(0.0);
		numberList.add(3.0);
		numberList.add(-5.0);
		numberList.add(3.0);
		numberList.add(0.0);
		numberList.add(0.0);
		numberList.add(Math.pow(Math.PI, Math.E));
		numberList.add(-2.5);
		numberList.add(Double.MAX_VALUE);
		numberList.add(Double.MIN_VALUE);
		
		System.out.println("\tnumberList : " + numberList);
		heapSort(numberList);
		System.out.println("\tAfter heapSort() : ");
		System.out.println("\tnumberList : " + numberList);

	}
	
	private static <E> void heapSort(Collection<E> collection) {
	    Queue<E> queue = new PriorityQueue<>(collection);
	    
	    collection.clear();

	    while (!queue.isEmpty()) {
	    	collection.add(queue.remove());
	    }
	}

}
