package Nov06;

import java.util.LinkedList;

/**
 * In class example that may or may not be useful
 * 	for your potential maybe existing project potentially who knows?
 * 
 * @author COSC 310 people
 */
public class MazeExample {

	public static final int WALL = 0;
	public static final int FREE = 1;
	public static final int CAT = 2;
	public static final int TREASURE = 3;
	
	
	//2d array, representing the map (aka adjacency matrix)
	// 0: wall
	// 1: free
	// 2: cat
	// 3: treasure
	int[][] maze = {
		{1, 0, 1, 1, 0, 1},
		{1, 1, 0, 1, 2, 1},
		{0, 1, 1, 1, 1, 0},
		{1, 2, 1, 0, 1, 1},
		{0, 0, 1, 1, 1, 0},
		{1, 1, 0, 1, 3, 1}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// int array is the coordinates: [row, col]
	public int[] dfs() {
		// Stack
		LinkedList<int[]> S = new LinkedList<>();
		
		// starting point
		int[] start = {0, 0};
		S.push(start);
		
		// while stack is not empty:
		while(S.size() > 0) {
		//	pop
			int[] curr = S.pop();
			int type = maze[curr[0]][curr[1]];
		//	visit
			//	don't do anything if curr is 0 <- This should not happen!
			//	if we found treasure, done
			if (type == TREASURE) {
				System.out.println("Found the treasure!");
				return curr;
			}
			//	if we found cat, something happens
			if (type == CAT) {
				System.out.println("Defeated a monster!");
			}
			
			//	push all neighbors (in the order W, S, E, N)

		}
		// we have searched everywhere we can, but not found anything...
			// throw exception, do something bad I dunno
		
		return null;
	}
	
	public int[] bfs() {
		// Queue
		LinkedList<int[]> Q = new LinkedList<>();
		
		return null;
	}

}
