package Aug28;

public class Shout {

	/* state ----------------- */
	private String myMsg;
	
	public Shout(String myMsg) {
		this.myMsg = myMsg;
	}
	
	/* behavior -------------- */
	public void msgOut() {
		System.out.println(myMsg);
	}
	
	// first example
//	public void out(String msg) {
//		System.out.println(msg);
//	}
	

}
