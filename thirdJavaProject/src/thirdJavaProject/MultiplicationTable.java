package thirdJavaProject;

public class MultiplicationTable {

	public static void main(String[] args) {

		int rows = 10; // number of rows in the table

		for (int i = 5; i <= rows; i++) {
			// print the row header
			System.out.print(i + " | ");
			// generate and print the row values
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			// print a new line after the row
			System.out.println();
		}
	}
}