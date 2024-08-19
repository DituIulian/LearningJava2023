package functionalPrograming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		numbers.stream().forEach(element -> System.out.println("number - " + element));


		int sum = fpSum(numbers);
		// int sum = normalSum(numbers);
		System.out.println("sum - " + sum);

	}

	private static int fpSum(List<Integer> numbers) {
		int sum = numbers.stream()./* filter(number -> number % 2 == 1). */reduce(0,
				(number1, number2) -> number1 + number2);
		return sum;
	}

	@SuppressWarnings("unused")
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
