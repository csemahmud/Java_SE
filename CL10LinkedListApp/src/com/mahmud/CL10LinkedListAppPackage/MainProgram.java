/**
 * 
 */
package com.mahmud.CL10LinkedListAppPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
		String[] colors =
			{ "yellow", "blue" };
		List<String> colorList = new LinkedList<>(
				Arrays.asList(colors));
		((LinkedList<String>) colorList).addLast("violet");
		((LinkedList<String>) colorList).add("silver");
		((LinkedList<String>) colorList).add(2, "green");
		((LinkedList<String>) colorList).addFirst("black");
		
		colors = colorList.toArray(new String[colorList.size()]);
		System.out.println("\tcolors = " + Arrays.toString(colors));
		
		System.out.println();
		
		String[] colors2 =
			{ "gold", "white", "brown", "blue", "gray", "silver" };
		List<String> tempList = new LinkedList<>();
		for (String color : colors2) {
			tempList.add(color);
		}
		System.out.println("\ttempList = " + tempList);
		
		colorList.addAll(tempList);
		tempList = null;
		System.out.println(
				"\tAdding All tempList into colorList,\tcolorList =");
		System.out.println("\t" + colorList);
		
		convertToUpperCase(colorList);
		System.out.println(
				"\tAfter Converting to Upper Case,\tcolorList =");
		System.out.println("\t" + colorList);
		
		removeItems(colorList, 4, 7);
		System.out.println(
				"\tDeleting elements 4 to 6 ...,\tcolorList =");
		System.out.println("\t" + colorList);
		
		System.out.println();
		
		Collections.shuffle(colorList);
		System.out.println(
				"\tAfter Shuffling,\tcolorList =");
		System.out.println("\t" + colorList);
		Collections.sort(colorList, Collections.reverseOrder());
		System.out.println(
				"\tAfter Sorting in Reverse Order,\tcolorList =");
		System.out.println("\t" + colorList);
		
		printReversedList(colorList);

	}

	private static void printReversedList(List<String> colorList) {
		// TODO Auto-generated method stub
		
		ListIterator<String> listIterator
			= colorList.listIterator(colorList.size());
		System.out.print("\tRverrsied List = \n\t{ ");
		for(;;) {
			System.out.print(listIterator.previous());
			if(listIterator.hasPrevious()){
				System.out.print(" -> ");
			} else {
				break;
			}
		}
		System.out.println(" }");
	}

	private static void removeItems(List<String> colorList, 
			int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		
		colorList.subList(fromIndex, toIndex).clear();
	}

	private static void convertToUpperCase(List<String> colorList) {
		// TODO Auto-generated method stub
		
		ListIterator<String> iterator = colorList.listIterator();
		while(iterator.hasNext()){
			iterator.set(iterator.next().toUpperCase());
		}
	}

}
