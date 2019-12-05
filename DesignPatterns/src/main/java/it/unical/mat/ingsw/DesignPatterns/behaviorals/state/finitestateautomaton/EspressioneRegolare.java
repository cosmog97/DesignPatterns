package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

public class EspressioneRegolare {
	private Stato stato;

	public EspressioneRegolare() {
		this.stato = new PrimoStato();
	}

	public Stato getEspressione() {
		return stato;
	}

	public void setEspressione(Stato stato) {
		this.stato = stato;
	}
}
