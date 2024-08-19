package objectOrientedProgram;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike dacia = new MotorBike(14);
		MotorBike bmw = new MotorBike(32);
		MotorBike honda = new MotorBike();
		MotorBike ducati = new MotorBike();

		System.out.println(dacia.getSpeed());
		System.out.println(bmw.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());


		ducati.start();

		dacia.start();

		bmw.start();

		honda.start();


		// state
		// ducati.setSpeed(100);
		// get current speed
		// increse it by 100
		// set it to ducati
		// int ducatiSpeed = ducati.getSpeed(); // get ducati speed
		// ducatiSpeed = ducatiSpeed + 100; // increse ducati speed by 100
		// ducati.setSpeed(ducatiSpeed); // set it to ducati
		ducati.increseSpeed(100);
		ducati.scadeSpeed(22);
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		honda.increseSpeed(80);
		honda.scadeSpeed(33);
		// int hondaSpeed = honda.getSpeed();
		// hondaSpeed = hondaSpeed + 80;
		// honda.setSpeed(hondaSpeed);
		System.out.println(honda.getSpeed());

		dacia.setSpeed(66);
		int daciaSpeed = dacia.getSpeed();
		daciaSpeed = daciaSpeed + 67;
		dacia.setSpeed(daciaSpeed);
		System.out.println(dacia.getSpeed());

		bmw.setSpeed(66);
		int bmwSpeed = bmw.getSpeed();
		bmwSpeed = bmwSpeed + 66;
		bmw.setSpeed(bmwSpeed);
		System.out.println(bmw.getSpeed());

		// ducati.setSpeed(20);
		// honda.setSpeed(0);
		// dacia.setSpeed(75);
		// bmw.setSpeed(110);

	}

}
