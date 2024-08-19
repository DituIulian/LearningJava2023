package BigDecimal;

import java.math.BigDecimal;

public class InterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public InterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// total value = principal + principal * interest * noOfYears
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));


		return totalValue;
	}

}
