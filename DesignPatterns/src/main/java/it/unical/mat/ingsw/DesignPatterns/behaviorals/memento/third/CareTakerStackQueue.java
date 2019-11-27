package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.third;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.third.Originator.Memento;

public class CareTakerStackQueue {

	private static Stack<Memento> mementoStack = new Stack<Memento>();
	private static Queue<Memento> mementoQueue = new LinkedList<Memento>();

	public static void main(String[] args) {
		Originator originator = new Originator();

		originator.setOriginatorState("x");
		// inserisco lo stato attuale nella coda degli stati
		mementoQueue.add(originator.createMemento());
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		originator.setOriginatorState("z");
		// inserisco un altro stato nella coda degli stati
		mementoQueue.add(originator.createMemento());

		// eseguo l'inserimento delle stati
		commitMemento();
		System.out.println("Stato Originator: " + originator.getOriginatorState());

		// rimuovo l'ultimo stato
		mementoStack.pop();

		// ripristino lo stato precedente
		originator.restoreMemento(mementoStack.pop());
		System.out.println("Stato Originator: " + originator.getOriginatorState());
	}

	public static void commitMemento() {
		while (!mementoQueue.isEmpty()) {
			mementoStack.push(mementoQueue.poll());
		}
	}

	public void rollbackMemento() {
		mementoQueue.clear();
	}
}