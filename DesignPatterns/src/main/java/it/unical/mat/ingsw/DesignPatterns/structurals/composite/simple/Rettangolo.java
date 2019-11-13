package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simple;

public class Rettangolo implements Oggetto {

	// Stampa il grafico.
	@Override
	public void stampa() {
		System.out.println("Rettangolo");
	}

	@Override
	public void aggiungi(Oggetto o) throws Exception {
		throw new Exception("Impossibile aggiungere figli al nodo Rettangolo");

	}

	@Override
	public void rimuovi(Oggetto o) throws Exception {
		throw new Exception("Impossibile eliminare figli dal nodo Rettangolo");
	}
}
