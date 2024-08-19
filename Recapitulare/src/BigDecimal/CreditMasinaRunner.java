package BigDecimal;

import java.math.BigDecimal;

public class CreditMasinaRunner {

	public static void main(String[] args) {

		CreditMasina calcul = new CreditMasina("5000.211", "6.81");
		BigDecimal total = calcul.totalRateInAni(10);
		System.out.println(total);

	}

}
