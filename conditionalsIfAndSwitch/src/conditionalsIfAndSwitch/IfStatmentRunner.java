package conditionalsIfAndSwitch;

public class IfStatmentRunner {

	public static void main(String[] args) {
		int i = 22;
		// i is 25
		// i is 24
		// is is nneither 24 or 25

		if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 24) {
			System.out.println(" i = 24");
		}
		else if (i == 23) {
			System.out.println(" i = 23");
		}
		else {
			System.out.println(" i != 23 or i != 24 and i != 25");
		}
	}

}

