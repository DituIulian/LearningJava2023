package BigDecimal;

import java.math.BigDecimal;

public class InterestCalculatorRunner {

	public static void main(String[] args) {

		InterestCalculator calculator = new InterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
