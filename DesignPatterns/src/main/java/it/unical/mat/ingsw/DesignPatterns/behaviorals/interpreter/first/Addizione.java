package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.first;

public class Addizione implements Espressione {

	@Override
	public int interpreta(Contesto contesto) {
		return contesto.pop().interpreta(contesto) + contesto.pop().interpreta(contesto);
	}

}