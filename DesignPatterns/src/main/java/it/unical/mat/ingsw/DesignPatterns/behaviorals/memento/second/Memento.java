package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.second;

public class Memento {

	private Object mementoState;

	public Object getMementoState() {
		return this.mementoState;
	}

	public void setMementoState(Object originatorState) {
		this.mementoState = originatorState;
	}
}