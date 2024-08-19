package conditionals;

import java.util.Scanner;

public class Calculator2Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print(" Introdu numarul1 : ");
		int number1 = scanner.nextInt();
		System.out.println(" Numarul ales este: " + number1);

		System.out.print(" Introdu numaru2: ");
		int number2 = scanner.nextInt();
		System.out.println(" Numarul ales este: " + number2);

		System.out.println(" Alege operatiunea");
		System.out.println(" 1 PLUS");
		System.out.println(" 2 MINUS");
		System.out.println(" 3 INMULTIT");
		System.out.println(" 4 IMPARTIT");

		int choice = scanner.nextInt();
		System.out.println(" Alegerile facute sunt: ");
		System.out.println(" Numarul 1: " + number1);
		System.out.println(" Numarul 2: " + number2);
		System.out.println(" Alegere : " + choice);

		System.out.print(" Rezultat: ");

		nestedIfElseCalculator2(number1, number2, choice);
		scanner.close();
	}

	private static void nestedIfElseCalculator2(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.println(number1 + number2);
		} else if (choice == 2) {
			System.out.println(number1 - number2);
		} else if (choice == 3) {
			System.out.println(number1 * number2);
		} else if (choice == 4) {
			System.out.println(number1 / number2);
		} else {
			System.out.println(" Eroare ");
		}
	}

}
