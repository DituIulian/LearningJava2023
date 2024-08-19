package BigDecimal;

import java.math.BigDecimal;

public class RataLaptop {

	BigDecimal rataLuna;
	BigDecimal dobanda;

	public RataLaptop(String rataLuna, String dobanda) {
		this.rataLuna = new BigDecimal(rataLuna);
		this.dobanda = new BigDecimal(dobanda).divide(new BigDecimal(100));
	}

	public BigDecimal adunareTotal(int ani) {
		// total value = rataLuna + rataLuna * dobanda * ani
		BigDecimal aniBigDecimal = new BigDecimal(ani);
		BigDecimal total = rataLuna.add(rataLuna.multiply(dobanda).multiply(aniBigDecimal));

		return total;
	}

}
