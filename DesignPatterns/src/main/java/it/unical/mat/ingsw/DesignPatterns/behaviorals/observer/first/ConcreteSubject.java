package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.first;

public class ConcreteSubject extends Subject {

	private boolean state;

	public void setState(boolean state) {
		this.state = state;
		notifyObservers();
	}

	public boolean getState() {
		return this.state;
	}
}