package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.first;

import java.util.Stack;

public class Contesto {

	private Stack var = null;

	public Contesto() {
		this.var = new Stack();
	}

	public void push(Espressione exp) {
		this.var.push(exp);
	}

	public Espressione pop() {
		return (Espressione) this.var.pop();
	}
}