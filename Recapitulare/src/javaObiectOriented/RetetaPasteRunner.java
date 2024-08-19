package javaObiectOriented;

public class RetetaPasteRunner {

	public static void main(String[] args) {

		RetetaPaste cuSturion = new RetetaPaste();
		RetetaPaste cuSomon = new RetetaPaste(22);
		RetetaPaste cuPui = new RetetaPaste(23);

		System.out.println(cuSturion.getPaste() + " Sare");
		System.out.println(cuSomon.getPaste() + " Sare");
		System.out.println(cuPui.getPaste() + " Sare");
		System.out.println(" ");

		cuSturion.suntGata();
		cuSomon.suntGata();
		cuPui.nuSuntGata();
		System.out.println(" ");

		cuSturion.cresteSare(55);
		cuSomon.cresteSare(54);
		cuPui.cresteSare(24);
		System.out.println(" ");

		System.out.println(cuSturion.getPaste() + " Sare");
		System.out.println(cuSomon.getPaste() + " Sare");
		System.out.println(cuPui.getPaste() + " Sare");
		System.out.println(" ");

		cuSturion.suntGata();
		cuSomon.suntGata();
		cuPui.suntGata();

	}

}
