package BigDecimal;

import java.math.BigDecimal;

public class CreditCursuri {

	BigDecimal imprumut;
	BigDecimal dobanda;

	public CreditCursuri(String imprumut, String dobanda) {
		this.imprumut = new BigDecimal(imprumut);
		this.dobanda = new BigDecimal(dobanda).divide(new BigDecimal(100));

	}

	public BigDecimal totalRateInAni(int totalRateInAni) {
		// total value = rataLuna + rataLuna * dobanda * ani
		BigDecimal total = imprumut.add(imprumut.multiply(dobanda).multiply(new BigDecimal(totalRateInAni)));
		return total;

}
}
