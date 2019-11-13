package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.simple;

public class WaitingDecorator implements MyDecorator {

	MyComponent myComponent = null;

	public WaitingDecorator(MyComponent myComponent) {
		this.myComponent = myComponent;
	}

	@Override
	public void print() {
		try {
			System.out.println("Metodo in attesa...");
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		myComponent.print();

	}

}
