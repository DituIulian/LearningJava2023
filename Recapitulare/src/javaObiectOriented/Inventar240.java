package javaObiectOriented;

public class Inventar240 {

	private int kg;

	Inventar240() {
		this(10);
	}

	Inventar240(int kg) {
		this.kg = kg;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public void inventariat() {
		System.out.println("A fost inventariat");
	}

	public void adaugat(int howMuch) {
		setKg(this.kg + howMuch);

	}
}
