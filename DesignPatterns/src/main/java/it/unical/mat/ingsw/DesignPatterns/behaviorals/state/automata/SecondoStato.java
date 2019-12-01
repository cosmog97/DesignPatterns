package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.automata;

public class SecondoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) {
		if (stato.equals("a")) {
			regex.setEspressione(new SecondoStato());
		} else if (stato.equals("b")) {
			regex.setEspressione(new TerzoStato());
		}

	}

}
