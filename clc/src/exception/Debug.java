package exception;

public class Debug {

	public static void main(String[] args) {
		System.out.println(methodOne());
	}

	public static int methodOne() {

		try {
			System.out.println("try block");
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			System.out.println("finally block");
		}

	}

}
