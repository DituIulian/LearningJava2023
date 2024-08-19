package conditionals;

public class isWeekDay {

	public static void main(String[] args) {
		System.out.println(isWeekDayMai(0));
	}

	public static boolean isWeekDayMai(int dayNumber) {

		switch (dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}

		return false;

	}

}
