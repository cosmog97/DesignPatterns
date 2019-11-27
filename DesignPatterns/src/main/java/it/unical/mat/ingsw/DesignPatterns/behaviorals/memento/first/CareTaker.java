package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.first;

import it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.first.Originator.Memento;

public class CareTaker {

	public static void main(String[] args) {
		Originator originator = new Originator();

		originator.setOriginatorState("x");
		Memento mementoStato1 = originator.createMemento();
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		originator.setOriginatorState("y");
		originator.setOriginatorState("z");
		Memento mementoStato2 = originator.createMemento();
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		originator.restoreMemento(mementoStato1);
		System.out.println("Stato Originator: " + originator.getOriginatorState());

	}
}