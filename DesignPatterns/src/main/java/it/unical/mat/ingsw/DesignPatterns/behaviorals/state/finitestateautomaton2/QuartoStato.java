package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

public class QuartoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, char stato) throws Exception {
		if (stato == 'e') {
			regex.setStato(new QuartoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}
	}

}
