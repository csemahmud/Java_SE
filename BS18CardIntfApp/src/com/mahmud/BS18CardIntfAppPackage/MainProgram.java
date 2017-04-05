/**
 * 
 */
package com.mahmud.BS18CardIntfAppPackage;

import java.util.Map;

import com.mahmud.BS18CardIntfAppPackage.classes.Deck;
import com.mahmud.BS18CardIntfAppPackage.classes.StandardDeck;

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
		Deck deck = new StandardDeck();
		Map<Integer, Deck> map;
		
		try {
			
			map = deck.deal(4, 14);
			
		} catch (IllegalArgumentException ex) {
			// TODO: handle exception
			
			System.err.println("\t" + ex.getMessage());
			map = deck.deal(4, 4);
		}
		
		
		for (Integer player : map.keySet()) {
			System.out.println("\tPlayer : " + player);
			System.out.println("\t" 
			+ map.get(player).deckToString());
		}

	}

}
