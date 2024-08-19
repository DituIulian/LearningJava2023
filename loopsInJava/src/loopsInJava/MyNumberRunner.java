package loopsInJava;



public class MyNumberRunner {

	public static void main(String[] args) {



		MyNumber number = new MyNumber(12);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUpToN();
		System.out.println("sumUpToN " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);

		number.printNumberTriangle();

	}

}
