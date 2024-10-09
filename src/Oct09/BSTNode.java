package Oct09;

/**
 * Simple node for a BST.
 */

public class BSTNode {

	String dat;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(String dat) {
		this.dat = dat;
		left = null;
		right = null;
	}
	
	public BSTNode(String dat, BSTNode left, BSTNode right) {
		this.dat = dat;
		this.left = left;
		this.right = right;
	}
}
