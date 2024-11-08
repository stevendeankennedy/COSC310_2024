package Nov06;

import java.util.LinkedList;

/**
 * In class example that may or may not be useful for your potential maybe
 * existing project potentially who knows?
 * 
 * @author COSC 310 people
 */
public class MazeExample {

	public static final int VISITED = 9;
	public static final int WALL = 0;
	public static final int FREE = 1;
	public static final int CAT = 2;
	public static final int TREASURE = 3;

	// 2d array, representing the map (aka adjacency matrix)
	// 0: wall
	// 1: free
	// 2: cat
	// 3: treasure
	int[][] maze = { 
			{ 1, 0, 1, 1, 0, 1 }, 
			{ 1, 1, 0, 1, 2, 1 }, 
			{ 0, 1, 1, 1, 1, 0 }, 
			{ 1, 2, 1, 0, 1, 1 },
			{ 0, 0, 1, 1, 1, 0 }, 
			{ 1, 1, 0, 1, 3, 1 } };

	public static void main(String[] args) {
		MazeExample maze = new MazeExample();
//		maze.dfs();
		maze.bfs();
	}

	// Warrior named: ErenYaegar
	// int array is the coordinates: [row, col]
	public void dfs() {
		// Stack
		LinkedList<int[]> S = new LinkedList<>();

		// starting point
		int[] start = { 0, 0 };
		S.push(start);

		// while stack is not empty:
		while (S.size() > 0) {
			// pop
			int[] curr = S.pop();
			System.out.println(curr[0] +  "," + curr[1]);
			// mark room visited
			int type = maze[curr[0]][curr[1]];
			maze[curr[0]][curr[1]] = VISITED;
			
			// visit
			// don't do anything if curr is 0 <- This should not happen!
			// if we found treasure, done
			if (type == TREASURE) {
				System.out.println("Found the treasure!");
				return;
			}
			// if we found cat, something happens
			if (type == CAT) {
				System.out.println("Defeated a monster!");
			}

			// push all neighbors (in the order W, S, E, N)
			// -note that we can't move into a wall space
			// - go one room to the left and see what the hell's in there
			// - Look ahead at next room to see if it is valid
			// check each direction
			// West
			if (isValid(curr[0], curr[1] - 1)) {
				S.push(new int[] { curr[0], curr[1] - 1 });
			}
			// South
			if (isValid(curr[0] + 1, curr[1])) {
				S.push(new int[] { curr[0] + 1, curr[1] });
			}
			// East
			if (isValid(curr[0], curr[1] + 1)) {
				S.push(new int[] { curr[0], curr[1] + 1 });
			}
			// North
			if (isValid(curr[0] - 1, curr[1])) {
				S.push(new int[] { curr[0] - 1, curr[1] });
			}
		}
		// we have searched everywhere we can, but not found anything...
		// throw exception, do something bad I dunno
	}

	// room is [row][col]
	private boolean isValid(int row, int col) {
		if (row < 0 || row >= maze.length || col < 0 || col >= maze.length || maze[row][col] == WALL || maze[row][col] == VISITED)
			return false;
		return true;
	}

	// Wizard named: Ionno
	public void bfs() {
		// Queue
		LinkedList<int[]> Q = new LinkedList<>();

				// starting point
				int[] start = { 0, 0 };
				
				Q.addLast(start);

				// while stack is not empty:
				while (Q.size() > 0) {
					// pop
					int[] curr = Q.removeFirst();
					System.out.println(curr[0] +  "," + curr[1]);
					// mark room visited
					int type = maze[curr[0]][curr[1]];
					maze[curr[0]][curr[1]] = VISITED;
					
					// visit
					// don't do anything if curr is 0 <- This should not happen!
					// if we found treasure, done
					if (type == TREASURE) {
						System.out.println("Found the treasure!");
						return;
					}
					// if we found cat, something happens
					if (type == CAT) {
						System.out.println("Defeated a monster!");
					}

					// push all neighbors (in the order W, S, E, N)
					// -note that we can't move into a wall space
					// - go one room to the left and see what the hell's in there
					// - Look ahead at next room to see if it is valid
					// check each direction

					// North
					if (isValid(curr[0] - 1, curr[1])) {
						Q.addLast(new int[] { curr[0] - 1, curr[1] });
					}
					// East
					if (isValid(curr[0], curr[1] + 1)) {
						Q.addLast(new int[] { curr[0], curr[1] + 1 });
					}
					// South
					if (isValid(curr[0] + 1, curr[1])) {						
						Q.addLast(new int[] { curr[0] + 1, curr[1] });
					}
					// West
					if (isValid(curr[0], curr[1] - 1)) {						
						Q.addLast(new int[] { curr[0], curr[1] - 1 });
					}
				}
				// we have searched everywhere we can, but not found anything...
				// throw exception, do something bad I dunno
		
	}

}
