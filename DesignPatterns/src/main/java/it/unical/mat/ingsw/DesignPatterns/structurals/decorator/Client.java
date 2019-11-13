package it.unical.mat.ingsw.DesignPatterns.structurals.decorator;

public class Client {

	public static void main(String[] args) {
		MyComponent firstComponent = new LoggingDecorator(new WaitingDecorator(new FirstConcreteComponent()));
		MyComponent secondComponent = new LoggingDecorator(new LoggingDecorator(new SecondConcreteComponent()));

		System.out.println("First Component: ");
		firstComponent.print();
		System.out.println("");
		System.out.println("Second Component: ");
		secondComponent.print();
	}

}
