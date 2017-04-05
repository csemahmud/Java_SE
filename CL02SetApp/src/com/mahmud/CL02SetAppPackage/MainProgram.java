/**
 * 
 */
package com.mahmud.CL02SetAppPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
		
		System.out.println("\targs of main() : " + Arrays.toString(args));
		
		Set<String> distinctWords = Arrays.asList(args).stream()
				.collect(Collectors.toSet()); 
		
        System.out.println("\t" + distinctWords.size() + 
        		" distinct words in args of main() : " 
				+ distinctWords);
        
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
		
		System.out.println("\tnumberList : \n\t" + numberList);
		
		Set<Number> numberSet = new HashSet<>();
		numberSet.addAll(numberList);
		
		System.out.println("\tnumberSet : \n\t" + numberSet);
		
		Set<Number> uniqueSet = new HashSet<>();
		Set<Number> duplicatedSet = new HashSet<>();
		
		for (Number number : numberList) {
			if(!uniqueSet.add(number)){
				duplicatedSet.add(number);
			}
		}
		
		uniqueSet.removeAll(duplicatedSet);

		System.out.println("\tuniqueSet : " + uniqueSet);
		System.out.println("\tduplicatedSet : " + duplicatedSet);
		
		Set<Number> number2Set = new HashSet<>();
		number2Set.add(0);
		number2Set.add(null);
		number2Set.add(Double.MAX_VALUE);
		number2Set.add(-500.55);
		number2Set.add(20);
		number2Set.add(-10);
		
		System.out.println("\tnumber2Set : " + number2Set);
		Set<Number> intersectionSet = new HashSet<>(numberSet);
		intersectionSet.retainAll(number2Set);
		
		System.out.println("\tintersectionSet : " + intersectionSet);
		
		SortedSet<Number> sortedSet = new TreeSet<>();
		for (Number number : numberList) {
			if(number != null){
				sortedSet.add(number.doubleValue());
			}
		}
		System.out.println();
		System.out.println("\tsortedSet : " + sortedSet);
		System.out.println("\tsortedSet.headSet(" 
				+ Double.MIN_VALUE + ") : " 
				+ sortedSet.headSet(Double.MIN_VALUE));
		System.out.println("\tsortedSet.tailSet(" 
				+ Double.MIN_VALUE + ") : " 
				+ sortedSet.tailSet(Double.MIN_VALUE));
		System.out.println("\tsortedSet.first(" 
				+ Double.MIN_VALUE + ") : " 
				+ sortedSet.first());
		System.out.println("\tsortedSet.last(" 
				+ Double.MIN_VALUE + ") : " 
				+ sortedSet.last());

	}

}
