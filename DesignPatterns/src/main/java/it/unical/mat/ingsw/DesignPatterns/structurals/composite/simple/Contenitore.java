package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simple;

import java.util.ArrayList;
import java.util.List;

public class Contenitore implements Oggetto {

	// Collezione di grafici figli.
	private List<Oggetto> figli = new ArrayList<Oggetto>();

	// Stampa il grafico.
	@Override
	public void stampa() {
		System.out.println("_______________________________");
		System.out.println("Contenitore: " + this.toString());
		for (Oggetto oggetto : figli) {
			oggetto.stampa();
		}
		System.out.println("_______________________________");
	}

	// Aggiunge il grafico alla composizione.
	public void aggiungi(Oggetto oggetto) {
		figli.add(oggetto);
	}

	// Rimuove il grafico dalla composizione.
	public void rimuovi(Oggetto oggetto) {
		figli.remove(oggetto);
	}

}
