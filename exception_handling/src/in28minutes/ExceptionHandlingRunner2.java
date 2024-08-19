package in28minutes;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {

		method1();
		System.out.println("Nu printeaza dupa exceptie");
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		String str = null;
		str.length();
	}


}
