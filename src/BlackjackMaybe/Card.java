package BlackjackMaybe;

/**
 * Simple card class.  Represents a basic playing card.
 * 
 * @author sdkennedy + friends
 */
public class Card {

	int suit;
	int rank; // 1-10 are numbers, but 11:Jack, 12:Queen, 13:King...
	boolean isFace;
	
	/**
	 * Constructor.
	 */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
		
		// is it a face card?
		if (rank > 10 && rank <= 13) {
			isFace = true;
		} else 
			isFace = false;
	}
	
	
	/**
	 * Returns the score of this card.
	 * 
	 * @return score of 1-11
	 */
	public int getValue() {
		int value = 0;
		if (isFace) {
			value = 10;
		} else {
			value = rank;
		}
		return value;
	}
	
	/* -- Generic getter methods -- */
	public int getSuit() {
		return suit;
	}
	public int getRank() {
		return rank;
	}
	public boolean isFace() {
		return isFace;
	}
	
	public String toString() {
		return "Card:" + suit + ", " + rank + ", " + isFace + ".";
	}
}
