package tips_and_trics;

class Person {

}

public class NestedClassRunner {

	int i;

	class InnerClass {
		public void methid() {
			i = 5;
		}
	}

	static class StaticNestedClass {

	}

	public static void main(String[] args) {

		// InnerClass innerClass= new InnerClass();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass();
	}

}
