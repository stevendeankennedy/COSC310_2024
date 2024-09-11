package utility;

import BlackjackMaybe.Card;

public class Stack {

	public static final int DEFAULT_SIZE = 52;
	
	private int count;
	// array for stack
	private Card[] S;
	
	public Stack() {  // O(1)
		S = new Card[DEFAULT_SIZE];
		count = 0;
	}
	
	// stack methods
	public void push(Card c) {
		if (count < 0 || count >= S.length) { // O(1)
			throw new ArrayIndexOutOfBoundsException(); // 0 - O(1)
		}
		// somehow, Jo and Andrew want us to increment count
		S[count++] = c;  // O(1)
	}
	
	public Card pop() {
		return S[--count];
	}
	
	public Card top() {
		return S[count - 1];
	}
}
