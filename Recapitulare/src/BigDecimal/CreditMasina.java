package BigDecimal;

import java.math.BigDecimal;

public class CreditMasina {

	BigDecimal imprumut;
	BigDecimal dobanda;

	public CreditMasina(String imprumut, String dobanda) {
		this.imprumut = new BigDecimal(imprumut);
		this.dobanda = new BigDecimal(dobanda).divide(new BigDecimal(100));
	}

	public BigDecimal totalRateInAni(int aniDeRata) {
		BigDecimal aniDeRataBigDecimal = new BigDecimal(aniDeRata);
		BigDecimal total = imprumut.add(imprumut.multiply(dobanda).multiply(aniDeRataBigDecimal));

		return total;
	}

	
	public void calculPlus() {
		this.imprumut.min(dobanda);
	}
}
