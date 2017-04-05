/**
 * 
 */
package com.mahmud.GN03TypeErasureAppPackage;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.GN03TypeErasureAppPackage.classes.Box;
import com.mahmud.GN03TypeErasureAppPackage.classes.Pair;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private static class PairDemo {

		/**
		 * 
		 */
		@SuppressWarnings("unused")
		public PairDemo() {
			// TODO Auto-generated constructor stub
		}
		
		public static void addBox(Object key, Object price, Object volume,
				Object weight, List<Pair> pairBoxList){
			pairBoxList.add(new Pair(key, 
					new Box(price, volume, weight)));
		}
		
		public static void addBox(Object key, Object price, Object volume,
				Object weight, Box box, List<Pair> pairBoxList){
			box.setPrice(price);
			box.setVolume(volume);
			box.setWeight(weight);
			pairBoxList.add(new Pair(key, box));
		}
		
		public static void printAllBoxes(List<Pair> pairBoxList){
			System.out.println("\n\tPrinting All Boxes with Key Name : ");
			for (Pair pair : pairBoxList) {
				System.out.println("\t" + pair);
			}
		}

	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private static class Util {

		/**
		 * 
		 */
		@SuppressWarnings("unused")
		public Util() {
			// TODO Auto-generated constructor stub
		}
		
		@SuppressWarnings("unchecked")
		public static boolean priceIsGreaterThan(Pair pair1, Pair pair2){
			return (((Comparable<Number>)((Box)pair1.getValue()).getPrice()).compareTo((Number)((Box)pair1.getValue()).getPrice()) > 0);
		}
		
		@SuppressWarnings("unchecked")
		public static boolean volumeIsGreaterThan(Pair pair1, Pair pair2){
			return (((Comparable<Number>)((Box)pair1.getValue()).getVolume()).compareTo((Number)((Box)pair1.getValue()).getVolume()) > 0);
		}
		
		@SuppressWarnings("unchecked")
		public static boolean weightIsGreaterThan(Pair pair1, Pair pair2){
			return (((Comparable<Number>)((Box)pair1.getValue()).getWeight()).compareTo((Number)((Box)pair1.getValue()).getWeight()) > 0);
		}
		
		@SuppressWarnings("unchecked")
		public static int countPriceGreaterThan(List<Pair> pairBoxList, Number element) {
		    int count = 0;
		    for (Pair pair : pairBoxList) {
		    	if (((Comparable<Number>)((Box)pair.getValue()).getPrice()).compareTo(element) > 0) {
		            ++count;
		        }
			}
		    return count;
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
		
		List <Pair> pairBoxList = new ArrayList<>();
		
		PairDemo.addBox("First Box", 10, 45, 20, pairBoxList);
		
		Box rawBox2 = new Box();
		
		Box seconBox = rawBox2;
		
		PairDemo.addBox("Second Box", 140, 45, 55, 
				seconBox, pairBoxList);
		
		Box thirdBox = new Box();
		
		Box rawBox3 = thirdBox;
		
		rawBox3.setPrice(150);
		rawBox3.setVolume(50);
		rawBox3.setWeight(50);
		
		pairBoxList.add(new Pair("Third Box", rawBox3));
		
		Box fourthBox = createRawBox(130, 60, 45);
		pairBoxList.add(new Pair("Fourth Box", fourthBox));
		
		Pair mostExpensive = pairBoxList.get(0);
		Pair largest = pairBoxList.get(0);
		Pair heaviest = pairBoxList.get(0);
		
		for (Pair pair : pairBoxList) {
			if(Util.priceIsGreaterThan(pair, mostExpensive)){
				mostExpensive = pair;
			}
			if(Util.volumeIsGreaterThan(pair, largest)){
				largest = pair;
			}
			if(Util.weightIsGreaterThan(pair, heaviest)){
				heaviest = pair;
			}
		}
		
		System.out.println("\n\n\n\tMost Expensive is = " 
				+ mostExpensive);
		System.out.println("\tLargest is = " + largest);
		System.out.println("\tHeaviest is = " + heaviest);
		
		System.out.println();
		((Box)pairBoxList.get(0).getValue()).inspect(Math.PI);
		
		System.out.println("\n\tTotal number of Boxes, where price is higher than 135 is : "
				+ Util.countPriceGreaterThan(pairBoxList, 135));
		
		PairDemo.printAllBoxes(pairBoxList);
	}

	private static Box createRawBox(int i, int j, int k) {
		// TODO Auto-generated method stub
		return new Box(i, j, k);
	}

}
