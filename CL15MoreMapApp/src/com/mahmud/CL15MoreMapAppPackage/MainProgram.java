/**
 * 
 */
package com.mahmud.CL15MoreMapAppPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

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
		
		Map<String, Integer> myMap = new HashMap<>();
		createMap(myMap);
		displayMap(myMap);

	}

	private static void createMap(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.print("\tEnter a String : \n\t");
			String input = scanner.nextLine();
			String[] tokens = input.trim().split("\\s+");
			for (String token : tokens) {
				
				String word = token.toLowerCase();
				if(map.containsKey(word)){
					int count = map.get(word);
					map.put(word, count + 1);
				} else {
					map.put(word, 1);
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}

	private static void displayMap(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		
		SortedSet<String> sortedKeys
			= new TreeSet<>(map.keySet());
		
		System.out.println();
		System.out.println("\tMap Contains : ");
		System.out.println();
		System.out.printf("\t%4s%-12s   %-10s%n","", "key", "value");
		System.out.printf("\t%4s%-12s   %-10s%n","", "---", "-----");
		int counter = 0;
		for (String key : sortedKeys) {
			counter++;
			System.out.printf("\t(%2d)%-12s : %-10s%n",
					counter, "\"" + key + "\"", 
					map.get(key));
		}
		System.out.println();
		System.out.printf("\tsize : %d%n\tisEmpty = %b%n", 
				map.size(), map.isEmpty());
	}

}
