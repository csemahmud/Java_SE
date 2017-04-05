/**
 * 
 */
package com.mahmmud.CL01CollectionsAppPackage;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
		numberList.add(0);
		numberList.add(3);
		numberList.add(-5);
		numberList.add(3);
		numberList.add(0);
		numberList.add(0);
		numberList.add(null);
		numberList.add(Math.pow(Math.PI, Math.E));
		numberList.add(-2.5f);
		numberList.add(null);
		numberList.add(Double.MAX_VALUE);
		numberList.add(Double.MIN_VALUE);
		
		System.out.println("\tnumberList : " + numberList);
		
		Set<Number> numberSet = new HashSet<>();
		numberSet.addAll(numberList);
		
		System.out.println("\tnumberSet : " + numberSet);
		
		Queue<Number> numberQueue = new LinkedList<>();
		
		System.out.println("\n\tAdding inside of numberQueue : ");
		
		System.out.print("\t");
		for(Iterator<Number> iterator = numberList.iterator(); true;){
			Number num = iterator.next();
			System.out.print(num);
			numberQueue.add(num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(iterator.hasNext()){
				System.out.print(" -> ");
			} else {
				break;
			}
		}
		
		System.out.println();
		System.out.println("\tRemoving from numberQueue : ");
		System.out.print("\t");
		while(true){
			System.out.print(numberQueue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			
			if(numberQueue.isEmpty()){
				System.out.println("\n\tnumberQueue is Empty !!!");
				break;
			} else {
				System.out.print(" -> ");
			}
		}
		
		Deque<Number> numberDeque = new LinkedList<>();
		System.out.println("\n\taddFirst() in numberDeque : ");
		for (Number number : numberList) {
			numberDeque.addFirst(number);
		}
		System.out.println("\tnumberDeque : " + numberDeque);

		System.out.println("\tremoveFirst() from numberQueue : ");
		System.out.print("\t");
		while(true){
			System.out.print(numberDeque.removeFirst());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(numberDeque.isEmpty()){
				System.out.println("\n\tnumberDeque is Empty !!!");
				break;
			} else {
				System.out.print(" -> ");
			}
		}

		System.out.println("\n\taddLast() in numberDeque : ");
		for (Number number : numberList) {
			numberDeque.addLast(number);
		}
		System.out.println("\tnumberDeque : " + numberDeque);

		System.out.println("\tremoveLast() from numberQueue : ");
		System.out.print("\t");
		while(true){
			System.out.print(numberDeque.removeLast());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			if(numberDeque.isEmpty()){
				System.out.println("\n\tnumberDeque is Empty !!!");
				break;
			} else {
				System.out.print(" -> ");
			}
		}
	}

}
