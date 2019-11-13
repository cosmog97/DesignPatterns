package it.unical.mat.ingsw.DesignPatterns.structurals.composite.third;

public class ExceptionClient {

	public static void main(String[] args) throws Exception {
		// oltre throws, si può usare il try/catch

		// Inizializza tre ellissi
		Oggetto ellisse1 = new Ellisse();
		Oggetto ellisse2 = new Ellisse();
		Oggetto ellisse3 = new Ellisse();
		Oggetto ellisse4 = new Ellisse();
		Oggetto rettangolo1 = new Rettangolo();
		Oggetto rettangolo2 = new Rettangolo();

		// Inizializza tre grafici composti
		Oggetto oggetto = new Contenitore();
		Oggetto oggetto1 = new Contenitore();
		Oggetto oggetto2 = new Contenitore();

		// Compone i grafici
		oggetto1.aggiungi(ellisse1);
		oggetto1.aggiungi(ellisse2);
		oggetto1.aggiungi(ellisse3);

		oggetto2.aggiungi(ellisse4);
		oggetto2.aggiungi(rettangolo1);
		oggetto2.aggiungi(rettangolo2);

		ellisse1.aggiungi(ellisse4);

		oggetto.aggiungi(oggetto1);
		oggetto.aggiungi(oggetto2);

		// Stampa i grafici completi (quattro volte la stringa "Ellisse").
		oggetto.stampa();
	}
}