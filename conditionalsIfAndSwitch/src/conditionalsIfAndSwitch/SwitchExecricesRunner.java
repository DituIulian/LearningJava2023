package conditionalsIfAndSwitch;

public class SwitchExecricesRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(4));
		System.out.println(isWeekDay(4));
	}

	public static String determineNameOfDay(int dayNumber) {
		@SuppressWarnings("unused")
		String result = " ";
		switch (dayNumber) {
		case 0:
			return "Monday"; // result = "Monday"; // break;
		case 1:
			return "Tuesday"; // result = "Tuesday"; // break;
		case 2:
			return "Wednesday"; // result = "Wednesday"; // break;
		case 3:
			return "Thursday"; // result = "Thursday"; // break;
		case 4:
			return "Friday"; // result = "Friday"; // break;
		case 5:
			return "Saturday"; // result = "Saturday"; // break;
		case 6:
			return "Sunday"; // result = "Sunday"; // break;

		}

		return "Invalid day";
	}


			/*
			 * System.out.println(determineNameOfMounthy(6)); }
			 * 
			 * public static String determineNameOfMounthy(int monthNumber) { String result
			 * = ""; switch (monthNumber) {
			 * 
			 * case 1: return "January"; case 2: return "February"; case 3: return "March";
			 * case 4: return "April"; case 5: return "May"; case 6: return "June"; case 7:
			 * return "July"; case 8: return "August"; case 9: return "September"; case 10:
			 * return "October"; case 11: return "November"; case 12: return "December";
			 * 
			 * } return "Invalid Month"; }
			 */

			public static boolean isWeekDay(int dayNumber) {
				switch (dayNumber) {
				case 0:
					return true;
				case 1:
					return true;
				case 2:
					return true;
				case 3:
					return true;
				case 4:
					return true;
				case 5:
					return true;
				case 6:
					return false;
				case 7:
					return false;

	}

				return false;
			}
		}
