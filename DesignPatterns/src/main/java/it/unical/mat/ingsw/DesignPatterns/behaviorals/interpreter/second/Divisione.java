package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.second;

public class Divisione implements Espressione {

	@Override
	public int interpreta(Contesto contesto) {
		int risultato = contesto.getNumero().interpreta(contesto) / contesto.getNumero().interpreta(contesto);
		contesto.setNumero(new Numero(risultato + ""));
		return risultato;
	}

}