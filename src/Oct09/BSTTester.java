package Oct09;

public class BSTTester {

	public static void main(String[] args) {
		BSTree T = new BSTree();
		
		BSTTester test = new BSTTester();
		test.testTree1(T);
	}
	
	public void testTree1(BSTree T) {
		T.add("X");
		T.add("A");
		T.add("B");
		T.add("D");
		T.add("C");
		T.add("B");
		T.add("Z");
		T.add("B");
//		T.printPreorder();
		T.printInorder();
		System.out.println(T);
	}

}
