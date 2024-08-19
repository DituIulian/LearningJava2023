package complex;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensiles");
	}

	@Override
	void doTheDish() {
		System.out.println("Get the dish");

	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensiles");

	}

}
