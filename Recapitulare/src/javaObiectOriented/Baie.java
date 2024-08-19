package javaObiectOriented;

public class Baie {

	private int curata;

	public int getCurata() {
		return curata;
	}

	public void setCurata(int curata) {
		this.curata = curata;
	}

	Baie() {
		this(012);
	}

	Baie(int curata) {
		if (curata > 0 & curata < 100) {

			this.curata = curata;
		}

	}

	public void cresteCuratenie(int cuCat) {
		setCurata(this.curata + cuCat);

	}
	public void curata() {
		System.out.println(" Curatenia a inceput");
	}

	public void gata() {
		System.out.println(" Curatenia s-a terminat");
	}
}
