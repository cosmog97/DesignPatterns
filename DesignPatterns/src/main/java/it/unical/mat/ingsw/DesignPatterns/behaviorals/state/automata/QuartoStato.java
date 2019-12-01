package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.automata;

public class QuartoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) {
		if (stato.equals("b")) {
			regex.setEspressione(new TerzoStato());
		}
	}

}
