package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.second;

public class Numero implements Espressione {

	private int numero;

	public Numero(String numero) {
		this.numero = Integer.parseInt(numero);
	}

	@Override
	public int interpreta(Contesto contesto) {
		return numero;
	}

}
