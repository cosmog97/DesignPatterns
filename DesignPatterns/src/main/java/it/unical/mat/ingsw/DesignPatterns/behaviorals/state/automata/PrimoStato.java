package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.automata;

public class PrimoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) {
		if (stato.equals("a")) {
			regex.setEspressione(new SecondoStato());
		}
	}

}
