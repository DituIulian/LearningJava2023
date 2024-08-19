package BigDecimal;

import java.math.BigDecimal;

public class CreditCursuriRunner {

	public static void main(String[] args) {

		CreditCursuri calcul = new CreditCursuri("30000.2", "8.1");
		BigDecimal total = calcul.totalRateInAni(5);
		System.out.println(total);

	}
}
