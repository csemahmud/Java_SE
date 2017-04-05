/**
 * 
 */
package com.mahmud.GN08ComparatorAppPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import com.mahmud.GN08ComparatorAppPackage.classes.PairNumber;

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
		
		List<PairNumber<Number, Number>> pairNumberList = new ArrayList<>();
		
		Random random = new Random();
		
		pairNumberList.add(new PairNumber<>());
		
		pairNumberList.add(new PairNumber<>(
				random.nextFloat()*100,
				random.nextFloat()*100));
		
		for(int i = 0; i < 4; i++) {
			
			pairNumberList.add(new PairNumber<>(
					random.nextInt(100),
					Math.pow(Math.PI, random.nextDouble() * 4)));
			
		}
		
		pairNumberList.add(new PairNumber<>());
		
		for(int i = 0; i < 4; i++) {
			
			pairNumberList.add(new PairNumber<>(
					Math.pow(Math.PI, random.nextDouble() * 4),
					random.nextInt(100)));
			
		}
		
		System.out.println("\n\n");
		System.out.println("\tpairNumberList = ");
		printList(pairNumberList);
		
		Collections.sort(pairNumberList);
		
		System.out.println();
		System.out.println("\tAfter Sorting, pairNumberList = ");
		printList(pairNumberList);
		
		Collections.sort(pairNumberList, PairNumber.U_ORDER);
		
		System.out.println();
		System.out.println(""
				+ "\tAfter Sorting by U_ORDER, pairNumberList = ");
		printList(pairNumberList);

	}

	private static void printList(List<PairNumber<Number, Number>> pairNumberList) {
		// TODO Auto-generated method stub
		
		System.out.print("\t{");
		int counter = 0;
		
		for(ListIterator<PairNumber<Number, Number>> listIterator
				= pairNumberList.listIterator(); ; ){			
			
			System.out.print("\t" + listIterator.next());
			if(listIterator.hasNext()) {
				System.out.print(",");
			} else {
				break;
			}
			
			if(counter == 3) {
				System.out.print("\n\t");
			}
			counter = (counter + 1) % 4;
		}
		
		System.out.println("\t}");
	}

}
