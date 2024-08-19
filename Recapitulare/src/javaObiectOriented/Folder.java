package javaObiectOriented;

public class Folder {

	private int fisiere;

	Folder() {
		this(12);
	}

	Folder(int fisiere) {
		if (fisiere > 0) {
			this.fisiere = fisiere;
		}
	}
	public int getFisiere() {
		return fisiere;
	}

	public void adaugaFisiere(int cateFisiere) {
		setFisiere(this.fisiere + cateFisiere);
	}

	public void deschide() {
		System.out.println(" Fisierul se deschide");
	}

	public void setFisiere(int fisiere) {
		if (fisiere > 0) {
			this.fisiere = fisiere;
		}
	}

	public void inchide() {
		System.out.println(" Am inchis folderul");
	}

}
