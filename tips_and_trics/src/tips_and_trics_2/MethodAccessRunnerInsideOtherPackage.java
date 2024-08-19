package tips_and_trics_2;

import tips_and_trics.ExampleClass;

public class MethodAccessRunnerInsideOtherPackage {

	public static void main(String[] args) {

		ExampleClass exampleClass = new ExampleClass();

		exampleClass.publicMethod();
//	exampleClass.protectedMethod();
//	exampleClass.privateMethod();
//	exampleClass.defaultMethod();
	}
}