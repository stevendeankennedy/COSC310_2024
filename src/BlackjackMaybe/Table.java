package BlackjackMaybe;

/**
 * Example Data Structure project, using Q's and S's.
 * 
 * @author everyone
 */

import java.util.Random;

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
		deck = new Deck();
		hands = new Hand[2];
		for (int i=0; i<2; i++) {
			hands[i] = new Hand();
		}
	}
	
	private void runSimpleGame() {
		// make cards
		// draw 2 cards each
		
		makeDeck();
		dealEach(2);
		updateScore();
		testCards();
		checkEndState();
		
		System.out.println("Let's go!");

	}
	
	private void testCards() {
		Random R = new Random();
		for (Hand h: hands) {
			System.out.println(h);
			h.enq(new Card(R.nextInt(4), R.nextInt(13)));
			updateScore();
			System.out.println(h);
			h.enq(new Card(R.nextInt(4), R.nextInt(13)));
			updateScore();
			System.out.println(h);
		}
		
		
	}
	
	private void checkEndState() {
		// if 21, continue or win
		// if over 21, bust
	}

	private void updateScore() {
		for (Hand h : hands) {
			// add up the rank of cards
				// get all the card values, aka deq all of them,
				//		count them, and then re-que them
			int score = 0;
			Card c = null;
			int aces = 0;
			for (int i=0; i<h.getCount(); i++) {
				//	number cards are equal to their rank
				//	face cards are 10
				//	ace is 11 unless the rest of the score > 10, then it is 1
				c = h.deq();
				if (c.isFace()) {
					score += 10;
				} else if (c.getRank() > 1) {
					score += c.getRank();
				} else { // it is an ace
					aces += 1;
				}
				h.enq(c);
			}
			for (int i=0; i<aces; i++) {
				if (score <= 10) {
					score += 11;
				} else {
					score += 1;
				}
			}
			h.setScore(score);

		}
		

	}
	
	private void makeDeck() {
		Card c = null;
		for (int i=0; i<13; i+=1) {
			for (int s=1; s<=4; s+=1) {
				c = new Card(s, i);
				deck.push(c);
			}
		}
	}
	
	private void dealEach(int n) {
		for (int i=0; i<n; i++) {
			for (Hand h : hands) {
				Card c = deck.draw();
				h.enq(c);
			}
		}
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
