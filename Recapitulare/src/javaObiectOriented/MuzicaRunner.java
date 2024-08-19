package javaObiectOriented;

public class MuzicaRunner {

	public static void main(String[] args) {

		Muzica rammstein = new Muzica(40);
		Muzica emma = new Muzica(45);
		Muzica mo = new Muzica();


		System.out.println(rammstein.getVolum() + "  Start");
		System.out.println(emma.getVolum() + "  Start");
		System.out.println(mo.getVolum() + "   Start");

		rammstein.ascultata();
		emma.ascultata();
		mo.ascultata();

		rammstein.cresteVolum(65);
		rammstein.scadeVoulum(44);

		emma.cresteVolum(70);
		emma.scadeVoulum(18);
		
		mo.cresteVolum(55);
		mo.scadeVoulum(12);
		
		
		System.out.println(rammstein.getVolum() + "  +reglaje");
		System.out.println(emma.getVolum() + "  +reglaje");
		System.out.println(mo.getVolum() + "  +reglaje");



	}

}
