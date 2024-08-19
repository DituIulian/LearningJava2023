package testamApele;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Qilive", 0.345, "Green");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		// fan.setSpeed((byte) 0);
		System.out.println(fan);
	}

}
