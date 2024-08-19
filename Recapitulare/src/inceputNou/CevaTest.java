package inceputNou;

public class CevaTest {

	private int limit;

	public CevaTest(int limit) {
		this.limit = limit;

	}

	public void printSquaresUpToLimit() {

		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}
	

	public void printCubesUpToLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}

}
