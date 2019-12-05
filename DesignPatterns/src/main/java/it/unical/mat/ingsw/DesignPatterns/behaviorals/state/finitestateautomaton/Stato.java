package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

public interface Stato {

	public void leggi(EspressioneRegolare regex, String stato) throws Exception;
}
