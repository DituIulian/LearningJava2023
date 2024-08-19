package javaObiectOriented;

public class Pesti {

	private int specii;

	Pesti() {
		this(3);
	}

	Pesti(int specii) {
		this.specii = specii;

	}

	public int getSpecii() {
		return specii;
	}

	public void setSpecii(int specii) {

		this.specii = specii;

	}

	public void adauga(int kg) {
		setSpecii(this.specii + kg);
	}
	public void inoate() {
		System.out.println("Pestele inoata");
	}

	public void viu() {
		System.out.println("Pestele este viu");
	}
}
