package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.first;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("Sono " + this + ": il Subject e' stato modificato!");
	}

}