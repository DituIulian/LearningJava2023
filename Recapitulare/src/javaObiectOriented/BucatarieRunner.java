package javaObiectOriented;

public class BucatarieRunner {

	public static void main(String[] args) {

		Bucatarie frigider = new Bucatarie(1200);
		Bucatarie aragaz = new Bucatarie(1050);
		Bucatarie mixer = new Bucatarie(170);

		System.out.println(frigider.getPret() + " - Pret initial frigider");
		System.out.println(aragaz.getPret() + " - Pret initial aragaz");
		System.out.println(mixer.getPret() + " - Pret initial mixer");

		System.out.print(" frigiderul");
		frigider.reducere();
		System.out.print(" aragazul");
		aragaz.reducere();
		System.out.print(" mixerul");
		mixer.reducere();


		frigider.scadePret(200);
		aragaz.scadePret(150);
		mixer.scadePret(30);

		System.out.println(frigider.getPret() + " - Pret final frigider");
		System.out.println(aragaz.getPret() + " - Pret final aragaz");
		System.out.println(mixer.getPret() + " - Pret final mixer");
	}

}
