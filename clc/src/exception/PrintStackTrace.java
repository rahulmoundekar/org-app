package exception;

class PrintStackTrace {
	public void m1() throws Exception {
		m2();
		System.out.println("m1");
	}

	public void m2() {
		m3();
		System.out.println("m2");
	}

	public void m3() {
		try {
			m4();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("m3");
	}

	public void m4() throws Exception {
		int c = 10 / 0;
		System.out.println("m4");
	}

	public static void main(String[] args) {

		PrintStackTrace t = new PrintStackTrace();
		try {
			t.m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
