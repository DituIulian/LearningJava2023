package conditionals;

public class MetodaExtrasePentruCalculatorRunner {

	@SuppressWarnings("unused")
	private static void metodaExtrase(int number1, int number2, int choiceX) {

		switch (choiceX) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 / number2);
			break;
		case 4:
			System.out.println(number1 * number2);
			break;
		default:
			System.out.println(" Error");
			break;

		}
	}
}