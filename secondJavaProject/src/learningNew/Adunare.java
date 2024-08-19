package learningNew;

public class Adunare {

	void print(int table) {
		print(table, 10, 22);

	}

	void print(int table, int from) {
		print(table, from, 22);

	}
	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d + %d = %d", table, i, table + i).println();
		}
	}
}

//	void print(int table) {
//print(table, 22, 10);