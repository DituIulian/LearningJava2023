package complex;

import java.math.BigDecimal;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	private String title;
	private String employeeName;
	private char emplyeeGrade;
	private BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employeeName;
	}

	public void setEmployerName(String employerName) {
		this.employeeName = employerName;
	}

	public char getEmplyeeGrade() {
		return emplyeeGrade;
	}

	public void setEmplyeeGrade(char emplyeeGrade) {
		this.emplyeeGrade = emplyeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return title + "# " + employeeName + "# " + emplyeeGrade + "# " + salary + "#" + super.getEmail() + "# " + super.getPhoneNumber();
	}

}
