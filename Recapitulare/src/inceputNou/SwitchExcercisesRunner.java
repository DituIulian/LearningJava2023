package inceputNou;

public class SwitchExcercisesRunner {

	public static void main(String[] args) {
		System.out.println(aflaNumeleZilei(5));
	}

	public static String aflaNumeleZilei(int numarZi) {

		String result = "";
		switch (numarZi) {
		case 1:
			result = "Luni";
			break;
		case 2:
			result = "Marti";
			break;
		case 3:
			result = "Miercuri";
			break;
		case 4:
			result = "Joi";
			break;
		case 5:
			result = "Vineri";
			break;
		case 6:
			result = "Sambata";
			break;
		case 7:
			result = "Duminica";
			break;
		default:
			result = "Eroare";
		}
		return result;
	}

}
