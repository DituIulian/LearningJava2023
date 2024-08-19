package javaObiectOriented;

public class Inventar240Runner {

	public static void main(String[] args) {

		Inventar240 caras = new Inventar240();
		Inventar240 somon = new Inventar240();
		Inventar240 dorada = new Inventar240();
		Inventar240 levrek = new Inventar240();

		System.out.println(caras.getKg());
		System.out.println(somon.getKg());
		System.out.println(dorada.getKg());
		System.out.println(levrek.getKg());

		caras.inventariat();
		somon.inventariat();
		dorada.inventariat();
		levrek.inventariat();

		caras.adaugat(33);
		somon.adaugat(55);
		dorada.adaugat(122);
		levrek.adaugat(31);

		System.out.println(caras.getKg());
		System.out.println(somon.getKg());
		System.out.println(dorada.getKg());
		System.out.println(levrek.getKg());

	}
}
