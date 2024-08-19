package amRevenit;

import java.util.Arrays;

public class zileleSaptamaniiRunner {

	public static void main(String[] args) {

		String[] zile = { "luni", "marti", "miercuuuri", "joi", "vineri", "sambata", "duminica" };

		String ziuaCuMulteLitere = "";
		for (String zi : zile) {
			if (zi.length() > ziuaCuMulteLitere.length()) {
				ziuaCuMulteLitere = zi;
			}

		}
		System.out.println("ziua cu cele mai multe caractere este " + ziuaCuMulteLitere);

		for (int i = zile.length - 1; i >= 0; i--) {
			System.out.println(zile[i]); // Zilele saptamani de la sfarsit la inceput
		}

		System.out.println(Arrays.toString(zile));

	}

}
