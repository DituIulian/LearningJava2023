package inceputNou;

import java.util.Scanner;

public class DoWhileRepeteadQuesteionRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = 0;
		do {
			System.out.println("Cube is = " + (number * number * number));
			System.out.print(" Enter a number: ");
			number = scanner.nextInt();
		} while (number >= 0);

		scanner.close();
		System.out.println("Thank you! Have fun!");
	}
}
