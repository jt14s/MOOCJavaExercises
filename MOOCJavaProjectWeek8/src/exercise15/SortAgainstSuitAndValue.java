package exercise15;

import java.util.Comparator;

class SortAgainstSuitAndValue implements Comparator<Card> {

	@Override
	public int compare(Card leftCard, Card rightCard) {
		if (leftCard.getSuit() - rightCard.getSuit() < 0) {
			return -1;
		} else if (leftCard.getSuit() - rightCard.getSuit() > 0) {
			return 1;
		} else {
			return leftCard.getValue() - rightCard.getValue();
		}
	}

}
