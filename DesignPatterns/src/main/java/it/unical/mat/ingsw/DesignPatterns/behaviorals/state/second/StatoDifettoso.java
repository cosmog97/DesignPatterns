package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.second;

public class StatoDifettoso implements Stato {

	@Override
	public void gestioneStatoOrdine(Ordine ordine, String stato) {
		if (stato.equals("in_corso"))
			ordine.setStatoOrdine(new StatoInCorso());
	}

}