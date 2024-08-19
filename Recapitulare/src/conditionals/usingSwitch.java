package conditionals;

public class usingSwitch {

	@SuppressWarnings("unused")
	private static void nestedIfElseCalculator2UsingSwitch(int number1, int number2, int choice) {

		switch (choice) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
			break;
		default:
			System.out.println(" Eroare ");
		}

	}
}
