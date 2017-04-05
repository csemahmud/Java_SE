/**
 * 
 */
package com.mahmud.CL04DealAppPackage;

import java.util.ArrayList;
import java.util.Collections;
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
	private enum Suit {
		Spades, Hearts, 
        Diamonds, Clubs
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private enum Rank {
		Ace, Two(2), Three(3), Four(4),
        Five(5), Six(6), Seven(7), Eight(8), 
        Nine(9), Ten(10), Jack, Queen, 
        King;
        
        private Integer value;

		/**
		 * @param value
		 */
		private Rank(Integer value) {
			this();
			this.value = value;
		}

		/**
		 * 
		 */
		private Rank() {
			
		}

		public Integer getValue() {
			return value;
		}
	}

	/**
		 * @author Mahmudul Hasan Khan CSE
		 *
		 */
	private class Card {
		
		private Rank rank;
		private Suit suit;

		/**
		 * @param rank
		 * @param suit
		 */
		public Card(Rank rank, Suit suit) {
			this();
			this.rank = rank;
			this.suit = suit;
		}

		/**
		 * 
		 */
		public Card() {
			// TODO Auto-generated constructor stub
			super();
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			String face = 
				(rank.getValue() == null) ? rank.toString() : rank.getValue().toString();
			builder.append(face).append(" of ").append(suit);
			return builder.toString();
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
		
		System.out.println("\n\n");
    
        String[] players = {
        		"Mahmud",
        		"Alia",
        		"Shraddha",
        		"Yami"
        };
		
        int totalCards 
        	= Suit.values().length * Rank.values().length; 
        int numHands = players.length;
        int cardsPerHand = totalCards / numHands;
        
        MainProgram x = new MainProgram(); 

        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(x.new Card(rank, suit));
			}
		}
    
        // Shuffle the deck.
        Collections.shuffle(deck);
        
        for (String player : players) {
        	System.out.printf("\t%-19s.", player);
		}
        System.out.println();
    
        for (int i = 0; i < cardsPerHand; i++) {
            for (Card card : dealHand(deck, numHands)) {
				System.out.printf("\t%-19s,", card);
			}
            System.out.println();
        }

	}
  
    public static <E> List<E> dealHand(List<E> deck, int numHands) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - numHands, deckSize);
        List<E> hand = new ArrayList<>(handView);
        handView.clear();
        return hand;
    }

}
