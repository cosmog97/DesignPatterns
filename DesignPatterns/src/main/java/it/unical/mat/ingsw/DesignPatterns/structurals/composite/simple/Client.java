package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simple;

public class Client {

	public static void main(String[] args) throws Exception {
		Oggetto ellisse1 = new Ellisse();
		Oggetto ellisse2 = new Ellisse();
		Oggetto ellisse3 = new Ellisse();
		Oggetto ellisse4 = new Ellisse();
		Oggetto rettangolo1 = new Rettangolo();
		Oggetto rettangolo2 = new Rettangolo();

		Oggetto contenitoreGenerale = new Contenitore();
		Oggetto contenitore1 = new Contenitore();
		Oggetto contenitore2 = new Contenitore();

		contenitore1.aggiungi(ellisse1);
		contenitore1.aggiungi(ellisse2);
		contenitore1.aggiungi(ellisse3);

		contenitore2.aggiungi(ellisse4);
		contenitore2.aggiungi(rettangolo1);
		contenitore2.aggiungi(rettangolo2);

		contenitoreGenerale.aggiungi(contenitore1);
		contenitoreGenerale.aggiungi(contenitore2);

		contenitoreGenerale.stampa();
	}
}