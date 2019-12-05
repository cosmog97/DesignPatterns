package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

public class TerzoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, char stato) throws Exception {
		if (stato == 'c' || stato == 'd') {
			regex.setStato(new TerzoStato());
		} else if (stato == 'e') {
			regex.setStato(new QuartoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}

	}

}
