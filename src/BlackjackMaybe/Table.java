package BlackjackMaybe;

import utility.Stack;

public class Table {

	public static void main(String[] args) {
//		System.out.println("Test start");
//		Table t = new Table();
//		t.stackTest();
		
		System.out.println("Starting the game!");
		Table t = new Table();
		t.runSimpleGame();
	}
	
	private Deck deck;
	private Hand[] hands;
	
	public Table() {
		for (int i=0; i<2; i++) {
			hands[i] = new Hand();
		}
	}
	
	private void runSimpleGame() {
		// make cards
		// draw 2 cards each
	}
	
	private Deck makeDeck() {
		return null;
	}
	
	private void dealEach(int n) {
		
	}
	
	private void stackTest() {
		Stack myStack = new Stack();
		Card a = new Card(1, 2);
		Card b = new Card(4, 5);
		Card c = new Card(2, 7);
		myStack.push(a);
		myStack.push(b);
		myStack.push(c);
		for (int i=0; i<3; i++)
			System.out.println(myStack.pop());
	}
}
