package Sept18;

public class LinkedList {

	private Node head;
	private int count;
	
	public LinkedList() {
		count = 0;
		head = null;
	}
	
	public void append(int d) {
		Node nNode = new Node(d); // O(1)
		
		if (head == null) { // O(1)
			head = nNode;	// O(1)
		} else {  // i.e., head is pointing to a node
			Node v = head; // O(1)
			while(v.next != null) { // traverse the list -- O(n)
				v = v.next; // O(1)
			} 
			// now we are pointing at the last node...
			v.next = nNode; // O(1)
		}
		count +=1 ;
	}
	
	public void delete(int i) {
		if (head == null || i > count)
			return;
		Node v = head;
		while (i > 1) {
			i -= 1;
			v = v.next;
		}
//		int tmp = v.dat;
		v.next = v.next.next;
	}
	
	public void appendR(int d) {
		if (head == null) {
			Node nNode = new Node(d);
			head = nNode;
		} else {
			appendR(d, head);  // O(n)... but why?
		}
	}
	
	private void appendR(int d, Node v) {
		// base case
		if (v.next == null) {  // O(1)
			Node nNode = new Node(d);  // O(1)
			v.next = nNode;  // O(1)
			return;
		} else { // recursive case
			appendR(d, v.next);  // O(n)...
		}
		
	}
	
	
	public void printListR() {
		printListR(head);
	}
	
	private void printListR(Node nd) {
		if (nd == null)
			return;
		
		int d = nd.dat;
		
		System.out.println(d);

		printListR(nd.next);

	}
	
}
