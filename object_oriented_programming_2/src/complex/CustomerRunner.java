package complex;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line1", " Profetului", "78809");
		Customer customer = new Customer("Iulian", homeAddress);

		Address workAddress = new Address("line1 for work", " Geamiei", "79990");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);


	}



}
