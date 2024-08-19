package javaObiectOriented;

public class CarteRunner {

	public static void main(String[] args) {

		Carte focus = new Carte(55);
		Carte crimaSiPedeapsa = new Carte(115);
		Carte demoni = new Carte(255);
		Carte harryPotter = new Carte();

		System.out.println(focus.getPagini() + "   inceput");
		System.out.println(crimaSiPedeapsa.getPagini() + "   inceput");
		System.out.println(demoni.getPagini() + "   inceput");
		System.out.println(harryPotter.getPagini() + "  inceput");

		focus.citita();
		crimaSiPedeapsa.citita();
		demoni.necitita();
		harryPotter.citita();

		// focus.setPagini(1);
		focus.crestePagini(2);
		focus.scadePagini(1);

		// int focusPagini = focus.getPagini();
		// focusPagini = focusPagini + 99;
		// focus.setPagini(focusPagini);

		System.out.println(focus.getPagini() + " Gata");


		crimaSiPedeapsa.crestePagini(88);
		crimaSiPedeapsa.scadePagini(75);
		// int crimaSiPedeapsaPagini = crimaSiPedeapsa.getPagini();
		// crimaSiPedeapsaPagini = crimaSiPedeapsaPagini + 88;
		// crimaSiPedeapsa.setPagini(crimaSiPedeapsaPagini);

		System.out.println(crimaSiPedeapsa.getPagini() + " Gata");

		demoni.crestePagini(77);
		demoni.scadePagini(87);
		// int demoniPagini = demoni.getPagini();
		// demoniPagini = demoniPagini - 77;
		// demoni.setPagini(demoniPagini);
		System.out.println(demoni.getPagini() + " Inca nu am inceput");

		harryPotter.crestePagini(1220);
		harryPotter.scadePagini(400);
		System.out.println(harryPotter.getPagini() + "  Gata ");
	}

}
