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
	
	private void runSimpleGame() {
		
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
