package exercise15;

class Card implements Comparable<Card> {

	public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;
	
	private int value;
	private int suit;
	
	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		StringBuilder printValue = new StringBuilder();
		
		if (value == 11)
			printValue.append("J of ");
		else if (value == 12)
			printValue.append("Q of ");
		else if (value == 13)
			printValue.append("K of ");
		else if (value == 14)
			printValue.append("A of ");
		else
			printValue.append(value + " of ");
		
		switch(suit) {
		case SPADES:
			printValue.append("Spades");
			break;
		case DIAMONDS:
			printValue.append("Diamonds");
			break;
		case HEARTS:
			printValue.append("Hearts");
			break;
		case CLUBS:
			printValue.append("Clubs");
			break;
		}
		
		return printValue.toString();
	}

	@Override
	public int compareTo(Card compare) {
		if (value != compare.value)
			return value - compare.value;
		else
			return suit - compare.suit;
	}
}
