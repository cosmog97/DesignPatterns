package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.second;

import java.util.Observable;

public class ConcreteSubject extends Observable {

	private boolean state;

	public void setState(boolean state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}

	public boolean getState() {
		return this.state;
	}

}