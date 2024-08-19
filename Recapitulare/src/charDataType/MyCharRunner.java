package charDataType;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar caracter = new MyChar('2');
		MyChar altCaracter = new MyChar('a');


		System.out.println(caracter.getVocala());
		System.out.println(altCaracter.getVocala());
		System.out.println(" ");


		System.out.println(caracter.eVocala() + "   E vocala");
		System.out.println(altCaracter.eVocala() + "   E vocala");
		System.out.println(" ");

		System.out.println(caracter.eConsoana() + "   E consoana");
		System.out.println(altCaracter.eConsoana() + "   E consoana");
		System.out.println(" ");

		System.out.println(caracter.eCifra() + "   E cifra");
		System.out.println(altCaracter.eCifra() + "   E cifra");
		System.out.println(" ");

		System.out.println(caracter.eLitera() + "   E litera");
		System.out.println(altCaracter.eLitera() + "   E litera");
		System.out.println(" ");

		MyChar.printeazaLitereleMici();
		System.out.println(" ");
		MyChar.printeazaLitereleMari();
	}
}
