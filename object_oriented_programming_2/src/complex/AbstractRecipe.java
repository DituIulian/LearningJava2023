package complex;

public abstract class AbstractRecipe {

	// preparation
	// recipe
	// cleanup

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();

}
