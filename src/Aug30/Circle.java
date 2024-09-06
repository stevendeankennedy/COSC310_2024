package Aug30;

public class Circle extends Shape implements Jumpable {
	
	public void circlewords() {
		System.out.println("I'm a circle");

	}

	@Override
	public void jump(String[] args) {
		System.out.println("jump!");
	}

}
