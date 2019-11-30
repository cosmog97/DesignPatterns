package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.second;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Sono " + this + ": il Subject e stato modificato!");
	}

}