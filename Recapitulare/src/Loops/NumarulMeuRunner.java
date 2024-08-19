package Loops;

public class NumarulMeuRunner {

	public static void main(String[] args) {

		NumarulMeu numar = new NumarulMeu(21);

		boolean ePrim = numar.ePrim();
		System.out.println("EPrim " + ePrim);

		int sum = numar.sumUpTON();
		System.out.println("sumUpTON " + sum);

		int sumaDivizorilor = numar.sumaDivizorilor();
		System.out.println("sumaDivizorilor " + sumaDivizorilor);

		numar.printeazaUnTriunghi();

	}

}
