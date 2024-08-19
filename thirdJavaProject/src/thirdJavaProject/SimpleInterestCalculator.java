package thirdJavaProject;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principle = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// Total Value = principal + principal * interest * noOfYears
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principle.add(principle.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

}
