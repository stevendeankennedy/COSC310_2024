package utility;

import BlackjackMaybe.Card;

public class Queue {
	
	public static final int DEFAULT_SIZE = 52;

	private int count;
	private Card[] Q;
	
	public Queue() {
		Q = new Card[DEFAULT_SIZE];
		count = 0;
	}
	
	public void enq(Card c) {
		if (count < 0 || count >= Q.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Q[count++] = c;
	}
	
	public Card deq() {
		return null;
	}
}
