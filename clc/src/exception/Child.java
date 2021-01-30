package exception;

public class Child extends Parent {

	int i = 10;

	@Override
	public void m1() {
		// Do nothing because of X and Y.
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();

	}

}
