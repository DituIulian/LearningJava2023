package conditionals;

import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) {

		// Type obj name = new Type(argument);
		Scanner scanner = new Scanner(System.in);

		System.out.print(" Enter number1:  ");
		int number1 = scanner.nextInt();
		System.out.println(" THe number you entered is - " + number1);

		System.out.print(" Enter number2:  ");
		int number2 = scanner.nextInt();
		System.out.println(" THe number you entered is - " + number2);

		System.out.println(" Chose operation ");
		System.out.println(" 1 - ADD ");
		System.out.println(" 2 - SUBSTRACT ");
		System.out.println(" 3 - DIVIDE  ");
		System.out.println(" 4 - MULTIPLY  ");

		int choiceX = scanner.nextInt();

		System.out.println(" Youre choices are");
		System.out.println(" Number1 " + number1);
		System.out.println(" Number2 " + number2);
		System.out.println(" ChoiceX  " + choiceX);

		System.out.print("Result : ");

		metodaExtrase(number1, number2, choiceX);

		scanner.close();
	}

	private static void metodaExtrase(int number1, int number2, int choiceX) {
		if (choiceX == 1) {
			System.out.println(number1 + number2);
		} else if (choiceX == 2) {
			System.out.println(number1 - number2);
		} else if (choiceX == 3) {
			System.out.println(number1 / number2);
		} else if (choiceX == 4) {
			System.out.println(number1 * number2);
		} else {
			System.out.println(" Error");
		}
	}

}
