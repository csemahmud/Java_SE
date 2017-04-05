/**
 * 
 */
package com.mahmud.Gn02WildcardsAppPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private static class Util {

		public static void elementSwap(List<?> list){
			swapHelper(list);
		}
		
		public static void elementSwap(List<?> list1, List<?> list2){
			swapHelper(list1, list2);
		}

		@SuppressWarnings("unchecked")
		private static <T, U> void swapHelper(List<T> list1, List<U> list2) {
			// TODO Auto-generated method stub
			T temp;
			temp = list1.get(0);
			list1.set(0, (T) list2.get(0));
			list2.set(0, (U) temp);
		}

		private static <T> void swapHelper(List<T> list) {
			// TODO Auto-generated method stub
			T temp;
			temp = list.get(0);
			list.set(0, list.get(1));
			list.set(1, temp);
		}

	}

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}
	
	private static double sumOfList(List<? extends Number> numberList) {
	    double sum = 0.0;
	    for (Number number : numberList) {
	    	if(number != null) {
	    		sum += number.doubleValue();
	    	}
		}
	    return sum;
	}
	
	private static void addNumbers(List<? super Number> numberList) {
		for(int i = 0; i < 10; i++){
			numberList.add(i);
		}
	}
	
	private static void printList(List<?> list) {
		System.out.print("\t{");
		Iterator<?> iterator = list.iterator();
		while (true) {
			System.out.print("\t" + iterator.next());
			if(iterator.hasNext()){
				System.out.print(",");
			} else {
				break;
			}
		}
		System.out.println("\t}");
	}
	
//	private static void printList(List<Object> list) {
//		System.out.print("\tElements of the List is = {");
//		Iterator<Object> iterator = list.iterator();
//		while (true) {
//			System.out.print("\t" + iterator.next());
//			if(iterator.hasNext()){
//				System.out.print(",");
//			} else {
//				break;
//			}
//		}
//		System.out.println("\t}");
//	}
//	
//	This code will generate error
//	Because List<Integer> is not derived from List<Object>

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		List<Integer> integerList = new ArrayList<>();
		// addNumbers(integerList); // Error
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		System.out.print("\tElements of integerList are =");
		printList(integerList);
		System.out.println("\tSum of integerList is = "
				+ sumOfList(integerList));
		List<Double> doubleList = new ArrayList<>();
		// addNumbers(doubleList); // Error
		doubleList.add(3.0);
		doubleList.add(Math.PI);
		doubleList.add(Math.E);
		System.out.print("\tElements of doubleList are =");
		printList(doubleList);
		System.out.println("\tSum of doubleList is = "
				+ sumOfList(doubleList));
		
		System.out.println();
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Mahmud");
		stringList.add("Alia");
		stringList.add("Shraddha");
		System.out.print("\tElements of the stringList are =");
		printList(stringList);
		
		System.out.println();

		List<Object> objectList = new ArrayList<>();
		addNumbers(objectList);
		System.out.print("\tElements of the objectList are =");
		printList(objectList);
		// sumOfList(objectList); // Error
		
		System.out.println();

		List<Number> numberList = new ArrayList<>();
		addNumbers(numberList);
		System.out.print("\tElements of the numberlist are =");
		printList(numberList);
		System.out.println("\tSum of numberList is = "
				+ sumOfList(numberList));
		Util.elementSwap(numberList);
		System.out.println("\tAfter Swaping first two elements,");
		System.out.print("\tElements of the numberlist are =");
		printList(numberList);
		
		System.out.println();
		
		List<? extends Number> numIntList = integerList;
		// addNumbers(numIntList); // Error
		// numIntList.add(35); // error
		numIntList.add(null);
		integerList.add(10);
		System.out.print("\tElements of the numIntList are =");
		printList(numIntList);
		System.out.println("\tSum of numIntList is = "
				+ sumOfList(numIntList));
		
		System.out.println();
		
		Util.elementSwap(stringList, integerList);
		System.out.println(
				"\tAfter Swaping First Element of stringList and integerList ");
		System.out.print("\tElements of stringList are =");
		printList(stringList);
		System.out.print("\tElements of integerList are =");
		printList(integerList);
		try {
			System.out.println("\tSum of integerList is = "
					+ sumOfList(integerList));	
		} catch (Exception ex) {
			// TODO: handle exception
			System.err.println("\t" + ex.getMessage());
		}

	}

}
