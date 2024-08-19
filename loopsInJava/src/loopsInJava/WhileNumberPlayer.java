package loopsInJava;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;

	}

	// For limit = 30, output would be 1 4 9 16 25 ( x * x)
	public void printSquaresUpToLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.print((i * i) + " ");
			i++;

		}
		System.out.println();
	}

	// For limit = 30, output would be 1 8 27 ( x * x * X)
	public void printCubesUpToLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.print((i * i * i) + " ");
			i++;
		}
		System.out.println();
	}

}
