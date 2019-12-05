package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

public class QuartoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) throws Exception {
		if (stato.equals("e")) {
			regex.setEspressione(new QuartoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}
	}

}
