package conditionals;

public class NumeLuna {

	public static void main(String[] args) {

		System.out.println(aflaNumeleLunii(3));

	}

	public static String aflaNumeleLunii(int numeLuna) {
		switch (numeLuna) {
		case 1:
			return "Ianuarie";
		case 2:
			return "Februarie";
		case 3:
			return "Martie";
		case 4:
			return "Aprilie";
		case 5:
			return "Mai";
		case 6:
			return "Iunie";
		case 7:
			return "Iulie";
		case 8:
			return "August";
		case 9:
			return "Septembrie";
		case 10:
			return "Octombrie";
		case 11:
			return "Noiembrie";
		case 12:
			return "Decembrie";
		}
		return "Nu_e_luna";
	}

}
