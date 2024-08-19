package objectOrientedProgram;

public class MotorBike {
	// state
	private int speed; // member variable

	MotorBike() { // No argument constructor
		this(5);
	}
	MotorBike(int speed) { // Constructer method ( Name exactly like the class)
		this.speed = speed;
	}

	// behaviour
	// methods
	// inputs - int speed
	// outpoots - void
	// name setSpeed


	public int getSpeed() {
		return speed;

	}

	public void increseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
		// this.speed = this.speed + howMuch;
	}

	public void scadeSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
		//if (this.speed - howMuch > 0) {
		//	this.speed = this.speed - howMuch;
		//}
	}


	public void setSpeed(int speed) {
		if (speed > 0) {
		this.speed = speed;
		} 
		else if (speed < 0) {
				System.out.println("Error");
			}
	}
			// {
			// System.out.println(speed); // 100
			// System.out.println(this.speed); // 0
			// }

	

	void start() {
		System.out.println("Bike started");
	}
}
