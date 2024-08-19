package javaObiectOriented;

public class Bucatarie {

	private int pret;

	Bucatarie() {
		this(200);
	}

	Bucatarie(int pret) {
		this.pret = pret;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		if (pret > 0) {
			this.pret = pret;
		}
	}

	void reducere() {
		System.out.println(" a primit reducere");
	}

	public void scadePret(int cuCat) {
		setPret(this.pret - cuCat);
	}
}
