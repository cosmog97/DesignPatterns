package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simple;

public interface Oggetto {

	public void aggiungi(Oggetto o) throws Exception;

	public void rimuovi(Oggetto o) throws Exception;

	public void stampa();
}
