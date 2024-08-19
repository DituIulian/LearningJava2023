package inceputNou;

public class Inmultire {
	
	void print() { 
		
		print(5);
	}

	void print(int tabla) {

		print(tabla, 1, 10);
	}

	void print(int tabla, int from, int to) {

		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", tabla, i, tabla * i).println();
		}
	}

}
