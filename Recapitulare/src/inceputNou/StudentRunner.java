package inceputNou;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		// int[] marks = { 32, 44, 78 }; Am modificat int[] in int... in clasa Student

		Student student = new Student("Mike", 12, 54, 22); // am putut pune direct cifrele in loc de "marks" NOTA*
															// Argumentul variabil trebuie sa fie ultimul (int...)

		int number = student.getNumberOfMarks();
		System.out.println("Number of marks " + number);

		int sum = student.getTotalOfMarks();
		System.out.println("Total of marks " + sum);

		int maxMark = student.getMaxMark();
		System.out.println("Max mark is " + maxMark);

		int minMark = student.getMinMark();
		System.out.println("Min mark is " + minMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average is " + average);

		System.out.println(student);

		student.addNewMark(66);

		System.out.println(student);

		student.removeMarkAtIndex(1);

		System.out.println(student);

	}
}