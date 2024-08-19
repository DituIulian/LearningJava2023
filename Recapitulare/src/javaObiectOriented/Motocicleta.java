package javaObiectOriented;

public class Motocicleta {

	private int viteza;

	void alegeViteza(int viteza) {
		this.viteza = viteza;
		System.out.println(this.viteza);
	}

	void start() {
		System.out.println(" Motocicleta a pornit ");
	}

}
