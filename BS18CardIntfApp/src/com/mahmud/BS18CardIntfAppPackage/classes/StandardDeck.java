/**
 * 
 */
package com.mahmud.BS18CardIntfAppPackage.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class StandardDeck implements Deck {
	
	private final List<Card> entireDeck;

	/**
	 * @param entireDeck
	 */
	public StandardDeck(List<Card> entireDeck) {
		super();
		this.entireDeck = entireDeck;
	}

	/**
	 * 
	 */
	public StandardDeck() {
		// TODO Auto-generated constructor stub
		
		this(new ArrayList<>());
		for (Card.Rank r : Card.Rank.values()) {
			for (Card.Suit s : Card.Suit.values()) {
				addCard(new Card(){
					
					private final Rank rank = r;
					private final Suit suit = s;

					@Override
					public int compareTo(Card card) {
						// TODO Auto-generated method stub
						if(rank.getValue() != 
								card.getRank().getValue()){
							return rank.getValue() - card.getRank().getValue();
						}
						
						return suit.getValue() - card.getSuit().getValue();
					}

					@Override
					public Suit getSuit() {
						// TODO Auto-generated method stub
						return suit;
					}

					@Override
					public Rank getRank() {
						// TODO Auto-generated method stub
						return rank;
					}
					
				});
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#getCards()
	 */
	@Override
	public List<Card> getCards() {
		// TODO Auto-generated method stub
		
		List<Card> entireDeck = new ArrayList<>();
		entireDeck.addAll(this.entireDeck);
		
		return entireDeck;
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#deckFactory()
	 */
	@Override
	public Deck deckFactory() {
		// TODO Auto-generated method stub
		return new StandardDeck();
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return entireDeck.size();
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#addCard(com.mahmud.BS18CardIntfAppPackage.classes.Card)
	 */
	@Override
	public void addCard(Card card) {
		// TODO Auto-generated method stub
		
		entireDeck.add(card);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#addCards(java.util.List)
	 */
	@Override
	public void addCards(List<Card> cards) {
		// TODO Auto-generated method stub
		
		entireDeck.addAll(cards);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#addDeck(com.mahmud.BS18CardIntfAppPackage.classes.Deck)
	 */
	@Override
	public void addDeck(Deck deck) {
		// TODO Auto-generated method stub

		addCards(deck.getCards());
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#shuffle()
	 */
	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		
		Collections.shuffle(entireDeck);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#sort()
	 */
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
		Collections.sort(entireDeck);

	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#sort(java.util.Comparator)
	 */
	@Override
	public void sort(Comparator<Card> comparator) {
		// TODO Auto-generated method stub
		
		Collections.sort(entireDeck, comparator);
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#deckToString()
	 */
	@Override
	public String deckToString() {
		// TODO Auto-generated method stub
		
		String returnText = "{ ";
		int counter = 1;
		for(ListIterator<Card> listIterator = entireDeck.listIterator()
				;;counter++){
			Card card = listIterator.next();
			returnText += card.getRank() + " of " + card.getSuit();
			if(listIterator.hasNext()){
				returnText += ", ";
			} else {
				break;
			}
			if(counter % 4 == 0){
				returnText += "\n\t";
			} 
		}
		
		return returnText + " }";
	}

	/* (non-Javadoc)
	 * @see com.mahmud.BS18CardIntfAppPackage.classes.Deck#deal(int, int)
	 */
	@Override
	public Map<Integer, Deck> deal(int players, int cardsPerHand) 
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if(players * cardsPerHand > size()) {
			throw new IllegalArgumentException(
					"For " + players 
					+ " players, Maximum cards per hand is "
					+ (size()/players) + " Only");
		}
		
		shuffle();
		
		Map<Integer, Deck> map = new HashMap<>();
		for(int i = 0; i < players; i++) {
			Deck deck = new StandardDeck(entireDeck.subList(
					i, i + cardsPerHand));
			deck.sort(
				    Comparator
			        .comparing(Card::getRank)
			        .thenComparing(Comparator.comparing(Card::getSuit)));
			map.put(i, deck);
		}
		
		return map;
	}

}
