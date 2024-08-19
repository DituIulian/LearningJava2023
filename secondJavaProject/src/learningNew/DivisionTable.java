package learningNew;

public class DivisionTable {

	void print(int table) {
		print(table, 22, 10);

	}

	void print(int table, int from, int to) {

		for (int i = from; i >= to; i--) {
			System.out.printf("%d : %d = %d ", i, table, i / table).println();
		}

	}
}


