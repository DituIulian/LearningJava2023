package inceputNou;

public class TablaInmultirii {


	void print() {
		print(5);
	}

	void print(int oriceCuvant) {
		print(oriceCuvant, 1, 10);
		}

	void print(int oriceCuvant, int deLa, int la) {

		for (int i = deLa; i <= la; i++) {
			System.out.printf("%d * %d = %d", oriceCuvant, i, oriceCuvant * i).println();
		}
	}

}
