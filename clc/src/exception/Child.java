package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

	@Override
	public void m1() {

	}

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();

	}

}
