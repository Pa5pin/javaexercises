package helloworld.with.lambdas;

public class HelloWorldWithLambdas {

	public static void main(String[] args) {

		Greeting helloWorld = () -> {
			System.out.println("Hello World");
		};
		helloWorld.message();
	}

	interface Greeting {
		void message();
	}

}
