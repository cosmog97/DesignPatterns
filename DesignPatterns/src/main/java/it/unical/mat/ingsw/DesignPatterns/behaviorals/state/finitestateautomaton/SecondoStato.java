package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

public class SecondoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) throws Exception {
		if (stato.equals("b")) {
			regex.setEspressione(new SecondoStato());
		} else if (stato.equals("c") || stato.equals("d")) {
			regex.setEspressione(new TerzoStato());
		} else if (stato.equals("e")) {
			regex.setEspressione(new QuartoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}
	}

}
