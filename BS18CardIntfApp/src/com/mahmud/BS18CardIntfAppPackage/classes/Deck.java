/**
 * 
 */
package com.mahmud.BS18CardIntfAppPackage.classes;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public interface Deck {
	
	List<Card> getCards();
    Deck deckFactory();
    int size();
    void addCard(Card card);
    void addCards(List<Card> cards);
    void addDeck(Deck deck);
    void shuffle();
    void sort();
    void sort(Comparator<Card> comparator);
    String deckToString();

    Map<Integer, Deck> deal(int players, int cardsPerHand)
        throws IllegalArgumentException;
	
}
