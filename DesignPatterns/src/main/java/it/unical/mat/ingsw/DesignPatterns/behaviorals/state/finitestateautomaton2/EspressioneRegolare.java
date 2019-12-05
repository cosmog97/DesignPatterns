package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

public class EspressioneRegolare {
	private Stato stato;
	private char[] regex;

	public EspressioneRegolare(char[] regex) {
		this.stato = new PrimoStato();
		this.regex = regex;
	}

	public void riconosci() throws Exception {
		for (char i : regex) {
			stato.leggi(this, i);
		}
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
}
