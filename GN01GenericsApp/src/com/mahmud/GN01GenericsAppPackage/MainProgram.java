/**
 * 
 */
package com.mahmud.GN01GenericsAppPackage;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.GN01GenericsAppPackage.classes.Box;
import com.mahmud.GN01GenericsAppPackage.classes.Pair;

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
		
		public static <K, T> void addBox(K key, T price, T volume,
				T weight, List<Pair<K, Box<T>>> pairBoxList){
			pairBoxList.add(new Pair<>(key, 
					new Box<>(price, volume, weight)));
		}
		
		public static <K, T> void addBox(K key, T price, T volume,
				T weight, Box<T> box, List<Pair<K, Box<T>>> pairBoxList){
			box.setPrice(price);
			box.setVolume(volume);
			box.setWeight(weight);
			pairBoxList.add(new Pair<>(key, box));
		}
		
		public static <K, T> void printAllBoxes(List<Pair<K, Box<T>>> pairBoxList){
			System.out.println("\n\tPrinting All Boxes with Key Name : ");
			for (Pair<K, Box<T>> pair : pairBoxList) {
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
		
		public static <K, T extends Comparable<T>> boolean priceIsGreaterThan(Pair <K, Box<T>> pair1, Pair <K, Box<T>> pair2){
			return (pair1.getValue().getPrice().compareTo(pair2.getValue().getPrice()) > 0);
		}
		
		public static <K, T extends Comparable<T>> boolean volumeIsGreaterThan(Pair <K, Box<T>> pair1, Pair <K, Box<T>> pair2){
			return (pair1.getValue().getVolume().compareTo(pair2.getValue().getVolume()) > 0);
		}
		
		public static <K, T extends Comparable<T>> boolean weightIsGreaterThan(Pair <K, Box<T>> pair1, Pair <K, Box<T>> pair2){
			return (pair1.getValue().getWeight().compareTo(pair2.getValue().getWeight()) > 0);
		}
		
		public static <K, T extends Comparable<T>> int countPriceGreaterThan(List<Pair<K, Box<T>>> pairBoxList, T element) {
		    int count = 0;
		    for (Pair<K, Box<T>> pair : pairBoxList) {
		    	if (pair.getValue().getPrice().compareTo(element) > 0) {
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
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// List <Pair<String, Box<Object>>> pairBoxList = new ArrayList<>();
		// List <Pair<String, Box<Number>>> pairBoxList = new ArrayList<>();
		
		// Above code will give errors
		
		List <Pair<String, Box<Integer>>> pairBoxList = new ArrayList<>();
		
		PairDemo.addBox("First Box", 10, 45, 20, pairBoxList);
		
		@SuppressWarnings("rawtypes")
		Box rawBox2 = new Box();
		
		Box<Integer> secondBox = rawBox2; // unchecked
		
		PairDemo.addBox("Second Box", 140, 45, 55, 
				secondBox, pairBoxList);
		
		Box<Integer> thirdBox = new Box<>();
		
		@SuppressWarnings("rawtypes")
		Box rawBox3 = thirdBox;
		
		rawBox3.setPrice(150); // unchecked
		rawBox3.setVolume(50); // unchecked
		rawBox3.setWeight(50); // unchecked
		
		pairBoxList.add(new Pair<>("Third Box", rawBox3));
		
		Box<Integer> fourthBox = createRawBox(130, 60, 45);
		pairBoxList.add(new Pair<>("Fourth Box", fourthBox));
		
		Pair<String, Box<Integer>> mostExpensive = pairBoxList.get(0);
		Pair<String, Box<Integer>> largest = pairBoxList.get(0);
		Pair<String, Box<Integer>> heaviest = pairBoxList.get(0);
		
		for (Pair<String, Box<Integer>> pair : pairBoxList) {
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
		pairBoxList.get(0).getValue().inspect(Math.PI);
		
		// pairBoxList.get(0).getValue().inspect("asd");
		// error: this is still String!
		
		System.out.println("\n\tTotal number of Boxes, where price is higher than 135 is : "
				+ Util.countPriceGreaterThan(pairBoxList, 135));
		
		PairDemo.printAllBoxes(pairBoxList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Box<Integer> createRawBox(int i, int j, int k) {
		// TODO Auto-generated method stub
		return new Box(i, j, k);
	}

}
