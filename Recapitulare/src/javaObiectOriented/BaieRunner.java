package javaObiectOriented;

public class BaieRunner {

	public static void main(String[] args) {

		Baie cada = new Baie();
		Baie wc = new Baie(21);
		Baie chiuveta = new Baie(62);

		// cada.curata();
		// wc.curata();
		// chiuveta.curata();
		// System.out.println(" ");

		System.out.println("cada este curata in porportie de " + cada.getCurata() + "%");
		System.out.println("wc este curata in porportie de " + wc.getCurata() + "%");
		System.out.println("chiuveta este curata in porportie de " + chiuveta.getCurata() + "%");
		System.out.println(" ");

		cada.curata();
		wc.curata();
		chiuveta.curata();
		System.out.println(" ");

		cada.cresteCuratenie(77);
		wc.cresteCuratenie(74);
		chiuveta.cresteCuratenie(35);
		System.out.println(" ");

		System.out.println("cada este curata in porportie de " + cada.getCurata() + "%");
		System.out.println("wc este curata in porportie de " + wc.getCurata() + "%");
		System.out.println("chiuveta este curata in porportie de " + chiuveta.getCurata() + "%");
		System.out.println(" ");

		cada.gata();
		wc.gata();
		chiuveta.gata();

	}

}
