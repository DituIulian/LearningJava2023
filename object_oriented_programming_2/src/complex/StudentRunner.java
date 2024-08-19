package complex;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setName("Ranga");
		 * student.setEmail("ranga@ceacea.band");
		 * student.setPhoneNumber("7554 554 332"); student.setCollegeName("Eminescu");
		 * student.setYear(4);
		 * 
		 * System.out.println(student);
		 */

		Employee employee = new Employee(null);

		// employee.setName("Ranga");
		employee.setEmail("ranga@ceacea.band");
		employee.setPhoneNumber("7554 554 332");
		employee.setEmplyeeGrade('A');
		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("Ranga11322");

		System.out.print(employee);

	}

}
