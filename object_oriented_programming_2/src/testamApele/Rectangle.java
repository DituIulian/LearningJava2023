package testamApele;

public class Rectangle {

	private int lungime;
	private int latime;
	private int diagonala;

	private boolean seRoteste;
	private byte viteza;

	public Rectangle(int lungime, int latime, int diagonala) {
		this.lungime = lungime;
		this.latime = latime;
		this.diagonala = diagonala;
	}

	public void seMisca() {
		this.seRoteste = true;
		setViteza((byte) 3);
	}

	public void seOpreste() {
		this.seRoteste = false;
		setViteza((byte) 0);
	}

	private void setViteza(byte viteza) {
		this.viteza = viteza;

	}

	@Override
	public String toString() {
		return String.format("lungime - %d , latime - %d , diagonala - %d, seRoteste - %b , viteza - %d", lungime,
				latime, diagonala, seRoteste, viteza);
	}

}
