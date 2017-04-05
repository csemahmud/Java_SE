/**
 * 
 */
package com.mahmud.GN07DifferentTypeAppPackage;

import java.util.ArrayList;
import java.util.List;

import com.mahmud.GN07DifferentTypeAppPackage.classes.Box;
import com.mahmud.GN07DifferentTypeAppPackage.classes.Pair;

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
				T weight, List<Pair<K, Box<?>>> pairBoxList){
			pairBoxList.add(new Pair<>(key, 
					new Box<>(price, volume, weight)));
		}
		
		public static <K, T> void addBox(K key, T price, T volume,
				T weight, Box<T> box, List<Pair<K, Box<?>>> pairBoxList){
			box.setPrice(price);
			box.setVolume(volume);
			box.setWeight(weight);
			pairBoxList.add(new Pair<>(key, box));
		}
		
		public static <K> void printAllBoxes(List<Pair<K, Box<?>>> pairBoxList){
			System.out.println("\n\tPrinting All Boxes with Key Name : ");
			for (Pair<K, Box<?>> pair : pairBoxList) {
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
		public static <K, T extends Comparable<T>> boolean priceIsGreaterThan(Pair <K, Box<?>> pair1, Pair <K, Box<?>> pair2){
			return (((Comparable<T>) pair1.getValue().getPrice()).compareTo((T)pair2.getValue().getPrice()) > 0);
			// ClassCastException
		}
		
		@SuppressWarnings("unchecked")
		public static <K, T extends Comparable<T>> boolean volumeIsGreaterThan(Pair <K, Box<?>> pair1, Pair <K, Box<?>> pair2){
			return (((Comparable<T>) pair1.getValue().getVolume()).compareTo((T)pair2.getValue().getVolume()) > 0);
		}
		
		@SuppressWarnings("unchecked")
		public static <K, T extends Comparable<T>> boolean weightIsGreaterThan(Pair <K, Box<?>> pair1, Pair <K, Box<?>> pair2){
			return (((Comparable<T>) pair1.getValue().getWeight()).compareTo((T)pair2.getValue().getWeight()) > 0);
		}
		
		@SuppressWarnings("unchecked")
		public static <K, T extends Comparable<T>> int countPriceGreaterThan(List<Pair<K, Box<?>>> pairBoxList, T element) {
		    int count = 0;
		    try{
			    for (Pair<K, Box<?>> pair : pairBoxList) {
			    	if (((Comparable<T>) pair.getValue().getPrice()).compareTo(element) > 0) {
		    		// ClassCastException    
			    		++count;
			        }
				}
		    } catch (ClassCastException ex) {
				// TODO: handle exception
				System.out.print("\n\n\t");
				ex.printStackTrace();
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
		
		List <Pair<String, Box<?>>> pairBoxList = new ArrayList<>();
		
		PairDemo.addBox("First Box", 10.5, 45.3, 20.8, pairBoxList);
		
		@SuppressWarnings("rawtypes")
		Box rawBox2 = new Box();
		
		Box<Integer> secondBox = rawBox2; // unchecked
		
		PairDemo.addBox("Second Box", 140, 45, 55, 
				secondBox, pairBoxList);
		
		Box<Float> thirdBox = new Box<>();
		
		@SuppressWarnings("rawtypes")
		Box rawBox3 = thirdBox;
		
		rawBox3.setPrice(150); // unchecked
		rawBox3.setVolume(50.5); // unchecked
		rawBox3.setWeight(50.5f); // unchecked
		
		pairBoxList.add(new Pair<>("Third Box", rawBox3));
		
		Box<Integer> fourthBox = createRawBox(130, 60, 45);
		pairBoxList.add(new Pair<>("Fourth Box", fourthBox));
		
		Pair<String, Box<?>> mostExpensive = pairBoxList.get(0);
		Pair<String, Box<?>> largest = pairBoxList.get(0);
		Pair<String, Box<?>> heaviest = pairBoxList.get(0);
		
		try {
			for (Pair<String, Box<?>> pair : pairBoxList) {
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
		
		} catch (ClassCastException ex) {
			// TODO: handle exception
			System.out.print("\n\n\t");
			ex.printStackTrace();
		}
		
		System.out.println("\n\n");
		pairBoxList.get(2).getValue().inspect(Math.PI);
		
		// pairBoxList.get(0).getValue().inspect("asd");
		// error: this is still String!
		
		System.out.println("\n\tTotal number of Boxes, where price is higher than 135 is : "
				+ Util.countPriceGreaterThan(pairBoxList, 135));

		System.out.println();
		PairDemo.printAllBoxes(pairBoxList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Box<Integer> createRawBox(int i, int j, int k) {
		// TODO Auto-generated method stub
		return new Box(i, j, k);
	}

}
