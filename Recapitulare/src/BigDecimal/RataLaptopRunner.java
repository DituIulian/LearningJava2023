package BigDecimal;

import java.math.BigDecimal;

public class RataLaptopRunner {

	public static void main(String[] args) {

		RataLaptop calculator = new RataLaptop("120.02", "6.5");
		BigDecimal total = calculator.adunareTotal(2);
		System.out.println(total);

	}
}
