package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.second;

public class Originator {

	private Object originatorState;

	public void setOriginatorState(Object state) {
		originatorState = state;
	}

	public Object getOriginatorState() {
		return originatorState;
	}

	public Memento createMemento() {
		Memento memento = new Memento();
		memento.setMementoState(originatorState);
		return memento;
	}

	public void restoreMemento(Memento memento) {
		originatorState = memento.getMementoState();
	}

}