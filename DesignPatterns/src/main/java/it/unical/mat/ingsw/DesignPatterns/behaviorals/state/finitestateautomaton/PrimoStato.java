package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

public class PrimoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, String stato) throws Exception {
		if (stato.equals("b")) {
			regex.setEspressione(new SecondoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}
	}

}
