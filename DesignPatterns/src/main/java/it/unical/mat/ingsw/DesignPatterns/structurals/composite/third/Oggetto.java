package it.unical.mat.ingsw.DesignPatterns.structurals.composite.third;

public interface Oggetto {

	public void aggiungi(Oggetto o) throws Exception;

	public void rimuovi(Oggetto o) throws Exception;

	public void stampa();
}
