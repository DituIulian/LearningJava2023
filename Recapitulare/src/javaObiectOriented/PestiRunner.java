package javaObiectOriented;

public class PestiRunner {

	public static void main(String[] args) {

		Pesti caras = new Pesti();
		Pesti crap = new Pesti(22);
		Pesti macrou = new Pesti();

		System.out.println(caras.getSpecii());
		System.out.println(crap.getSpecii());
		System.out.println(macrou.getSpecii());

		caras.inoate();
		crap.inoate();
		macrou.viu();

		caras.adauga(44);
		crap.adauga(98);
		macrou.adauga(447);

		System.out.println(caras.getSpecii() + " Dupa comanda");
		System.out.println(crap.getSpecii() + " Dupa comanda");
		System.out.println(macrou.getSpecii() + " Dupa comanda");
	}

}
