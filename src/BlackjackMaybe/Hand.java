package BlackjackMaybe;

import utility.Queue;

public class Hand extends Queue {
	int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "Score:" + score;
	}
}
