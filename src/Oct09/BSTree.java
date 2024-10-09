package Oct09;

/**
 * In-class version of a BST.  Just does simple things, 
 * 	adding and printing.
 * @author COSC310 class
 */
public class BSTree {

	private BSTNode root;
	private int count;
	
	public BSTree() {
		count = 0;
		root = null;
	}
	
	/**
	 * Add an element to our tree.  Will make the node and inc count.
	 * @param dat the data to add
	 */
	private void add(BSTNode root, BSTNode nd) {

		if (nd.dat.compareTo(root.dat) <= 0) {
//			System.out.println("go left");
			if (root.left == null) {
				root.left = nd;
			} else { // not null
				add(root.left, nd);
			}
		} else { // go right
			if (root.right == null) {
				root.right = nd;
			} else { // not null
				add(root.right, nd);
			}
		}


	}
	
	public void add(String dat) {
		BSTNode nd = new BSTNode(dat);
		System.out.println("adding " + dat);

		if (isEmpty()) {
			root = nd;
		} else {
			add(root, nd);
		}
		count += 1;
	}
	
	/**
	 * Preorder printout
	 * 	
	 * @return
	 */
	public void printPreorder() {
		printPre(root);
		
	}
	
	private void printPre(BSTNode root) {
		// VLR
		if(root == null) {
			return;
		}
		System.out.println(root.dat);
		printPre(root.left);
		printPre(root.right);
	}
	
	public void printInorder() {
		printIn(root);
		
	}
	
	private void printIn(BSTNode root) {
		// VLR
		if(root == null) {
			return;
		}
		printIn(root.left);
		System.out.println(root.dat);
		printIn(root.right);
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
}
