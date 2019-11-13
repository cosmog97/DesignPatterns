package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simple;

public class Ellisse implements Oggetto {

	// Stampa il grafico.
	@Override
	public void stampa() {
		System.out.println("Ellisse");
	}

	@Override
	public void aggiungi(Oggetto o) throws Exception {
		throw new Exception("Impossibile aggiungere figli al nodo Ellisse");

	}

	@Override
	public void rimuovi(Oggetto o) throws Exception {
		throw new Exception("Impossibile eliminare figli dal nodo Ellisse");
	}
}