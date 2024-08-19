package javaObiectOriented;

public class MotocicletaRunner {

	public static void main(String[] args) {

		Motocicleta honda = new Motocicleta();
		Motocicleta ducati = new Motocicleta();

		ducati.start();
		honda.start();


		ducati.alegeViteza(100);
		honda.alegeViteza(40);

		ducati.alegeViteza(80);
		honda.alegeViteza(90);


	}

}
