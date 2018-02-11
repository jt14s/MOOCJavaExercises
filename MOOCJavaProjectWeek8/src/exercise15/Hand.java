package exercise15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Hand implements Comparable<Hand> {

	private List<Card> hand;
	
	public Hand() {
		hand = new ArrayList<>();
	}
	
	public void add(Card card) {
		hand.add(card);
	}
	
	public void print() {
		for (Card card : hand)
			System.out.println(card);
	}
	
	public void sort() {
		Collections.sort(hand);
	}

	public void sortAgainstSuit() {
		Collections.sort(hand, new SortAgainstSuitAndValue());
	}
	
	public int getHandValue() {
		int totalValue = 0;
		for (Card card : hand)
			totalValue += card.getValue();
		
		return totalValue;
	}
	
	@Override
	public int compareTo(Hand other) {
		return getHandValue() - other.getHandValue();
	}
}
