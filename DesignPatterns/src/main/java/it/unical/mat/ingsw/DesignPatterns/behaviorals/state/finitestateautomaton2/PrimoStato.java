package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

public class PrimoStato implements Stato {

	@Override
	public void leggi(EspressioneRegolare regex, char stato) throws Exception {
		if (stato == 'b') {
			regex.setStato(new SecondoStato());
		} else {
			throw new Exception("Espressione regolare non riconosciuta");
		}
	}

}
