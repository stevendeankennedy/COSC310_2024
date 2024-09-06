package Aug28;

public class Driver {

	public static void main(String[] args) {
		Shout sh = new Shout("Hello World!");
		sh.msgOut();
		
		Shout sh1 = new Shout("Bye world!");
		sh1.msgOut();
	}
	
	// first example
//	public static void main(String[] args) {
//		Shout sh = new Shout();
//		sh.out("Hello?");
//		sh.out("Hi!");
//	}

}
