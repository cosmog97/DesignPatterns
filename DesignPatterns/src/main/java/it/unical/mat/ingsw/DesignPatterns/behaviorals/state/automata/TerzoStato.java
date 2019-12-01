package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.automata;

public class TerzoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) {
		if (stato.equals("c")) {
			regex.setEspressione(new QuartoStato());
		}
	}

}
