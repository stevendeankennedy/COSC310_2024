package BlackjackMaybe;

import utility.Stack;

public class Deck extends Stack {

	public Card draw() {
		return this.pop();
	}
}
