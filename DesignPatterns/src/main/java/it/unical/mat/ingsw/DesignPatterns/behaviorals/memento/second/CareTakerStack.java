package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.second;

import java.util.Stack;

public class CareTakerStack {

	private static Stack<Memento> mementoStack = new Stack<Memento>();

	public static void main(String[] args) {
		Originator originator = new Originator();

		originator.setOriginatorState("x");
		// memorizzo lo stato attuale
		mementoStack.push(originator.createMemento());
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		originator.setOriginatorState("z");
		// memorizzo il nuovo stato attuale
		mementoStack.push(originator.createMemento());
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		// rimuovo l'ultimo stato
		mementoStack.pop();

		// ripristino lo stato precedente
		originator.restoreMemento(mementoStack.pop());
		System.out.println("Stato Originator: " + originator.getOriginatorState());
	}
}