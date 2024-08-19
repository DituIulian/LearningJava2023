package javaObiectOriented;

public class Carte {

	private int pagini;
	
	Carte() {
		this(5);
	}
	Carte(int pagini) {
		this.pagini = pagini;
	}

	int getPagini() {
		return pagini;
	}

	void setPagini(int pagini) {
		if (pagini > 0) {
			this.pagini = pagini;
		}
	}

	public void crestePagini(int cuCat) {
		setPagini(this.pagini + cuCat);
	}

	public void scadePagini(int cuCat) {

		setPagini(this.pagini - cuCat);
		}

	void citita() {
		System.out.println("Cartea a fost citita");
	}

	void necitita() {
		System.out.println("Cartea nu a fost citita");
	}
}
