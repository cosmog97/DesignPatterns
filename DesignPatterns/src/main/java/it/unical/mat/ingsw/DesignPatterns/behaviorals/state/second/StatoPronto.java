package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.second;

public class StatoPronto implements Stato {

	@Override
	public void gestioneStatoOrdine(Ordine ordine, String stato) {
		if (stato.equals("in_partenza"))
			ordine.setStatoOrdine(new StatoInPartenza());
	}

}