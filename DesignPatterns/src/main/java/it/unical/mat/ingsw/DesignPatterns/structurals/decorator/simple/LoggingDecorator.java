package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.simple;

public class LoggingDecorator implements MyDecorator {

	MyComponent myComponent = null;

	public LoggingDecorator(MyComponent myComponent) {
		this.myComponent = myComponent;
	}

	@Override
	public void print() {
		System.out.println("__________________");
		System.out.println("Metodo avviato");
		myComponent.print();
		System.out.println("Metodo terminato");
		System.out.println("__________________");
	}

}
