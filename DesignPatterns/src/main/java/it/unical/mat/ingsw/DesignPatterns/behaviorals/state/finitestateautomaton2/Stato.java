package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

public interface Stato {

	public void leggi(EspressioneRegolare regex, char stato) throws Exception;
}
