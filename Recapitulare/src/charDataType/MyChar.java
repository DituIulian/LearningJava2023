package charDataType;

public class MyChar {

	private char vocala; // Vocala reprezinta un Caracter ' '



	MyChar(char vocala) {

		this.vocala = vocala;

	}


	public char getVocala() {
		return vocala;
	}

	public void setVocala(char vocala) {
		this.vocala = vocala;
	}

	public boolean eVocala() {
		if (vocala == 'a' || vocala == 'e' || vocala == 'i' || vocala == 'o' || vocala == 'u' || vocala == 'A'
				|| vocala == 'E' || vocala == 'I' || vocala == 'O' || vocala == 'U') {

		return true;
	} else {
		return false;
		}
}

public boolean eCifra() {
	if (vocala >= 48 && vocala <= 57) { // betwen '0' and '9'
		return true;
	} else {
		return false;
	}

}

public boolean eConsoana() {
	if (eLitera() && !eVocala()) {
		return true;
	}
	return false;
}

public boolean eLitera() {
	if (vocala >= 97 && vocala <= 122) { // betwen 'a' and 'z'
	return true;
	}
	if (vocala >= 65 && vocala <= 90) { // betwen 'A' and 'Z'
		return true;
	} else {
	return false;
}
}

public static void printeazaLitereleMici() {
	for (char vocala = 'a'; vocala <= 'z'; vocala++) {
		System.out.print(vocala + " ");
	}

}

public static void printeazaLitereleMari() {
	for (char vocala = 'A'; vocala <= 'Z'; vocala++) {
		System.out.print(vocala + " ");
	}
}
}
