package Loops;

public class NumarulMeu {

	private int numar;

	public NumarulMeu(int numar) {

		this.numar = numar;

	}

	public boolean ePrim() {
		// 2 to number -1

		if (numar < 2) { // GUARD CHECK
			return false;
		}

		for (int i = 2; i <= numar - 1; i++) {
			if (numar % 2 == 0) {
				return false;
			}
		}

		return true;
	}

	public int sumUpTON() {
		// 1+2+3
		int sum = 0;
		for (int i = 1; i <= numar; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumaDivizorilor() {
		int sum = 0;

		for (int i = 2; i < numar; i++) {
			if (numar % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printeazaUnTriunghi() {

		for (int i = 1; i <= numar; i++) {
			for ( int j = 1;j <= i; j++ ) {
			System.out.print(j + " ");
		}
			System.out.println(" ");
	}
}
}
