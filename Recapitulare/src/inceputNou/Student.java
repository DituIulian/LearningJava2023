package inceputNou;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(Class<int[]> class1) {

	}

	public Student(String name, int... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxMark() {
		return Collections.max(marks);

		/*
		 * int maxMark = Integer.MIN_VALUE; **Am schimbat din Array in ArrayList for
		 * (int mark : marks) { if (mark > maxMark) { maxMark = mark; }
		 * 
		 * 
		 * } return maxMark;
		 */
	}

	public int getMinMark() {
		int minMark = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minMark) {
				minMark = mark;
			}

		}
		return minMark;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);

	}

}
