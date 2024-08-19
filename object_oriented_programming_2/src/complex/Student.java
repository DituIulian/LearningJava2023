package complex;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	private String collegeName;
	private int year;

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("Name - %s 	 E-mail - %s 	Phone numer - %s 	 College name - %s 	 Year %d", name,
				email,
				phoneNumber, collegeName, year);

	}
}