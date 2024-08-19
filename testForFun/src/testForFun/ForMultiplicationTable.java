package testForFun;

public class ForMultiplicationTable {

	void print(int table) {
		print(table, 4, 12);

	}

	void print(int table, int from, int to) {

		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d ", i, table, i * table).println();
		}

	}
}

