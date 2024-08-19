package loopsInJava;

import java.util.Scanner;

public class DoWhileRepeteadQuestionRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;


		do {
			System.out.println("Cube is: " + (number * number * number));
			System.out.print("Eneter a number: ");
			number = scanner.nextInt();
			scanner.close();
		} while (number >= 0);
		
		System.out.println(" Thank You! Have Fun!");


	}
}