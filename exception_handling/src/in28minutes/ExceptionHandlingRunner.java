package in28minutes;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("method1 Ended");
	}

	private static void method2() {
		try {
			// String str = null;
			// str.length();
			int[] i = { 2, 1 };
			int number = i[3];

			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException\n");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException\n");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception\n");
			ex.printStackTrace();
		}
	}
}
