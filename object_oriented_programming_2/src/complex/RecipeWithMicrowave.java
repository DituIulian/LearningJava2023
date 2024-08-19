package complex;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
		System.out.println("Put them in microwave");

	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensiles");
		System.out.println("Switch off the microwave ");

	}

}
