package Sept18;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		for (int i = 0; i < 10; i++) {
			list.appendR(i);
		}

		list.printListR();

	}

}
