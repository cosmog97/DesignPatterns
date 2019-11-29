package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.second;

public class StatoInPartenza implements Stato {

	@Override
	public void gestioneStatoOrdine(Ordine ordine, String stato) {
		if (stato.equals("spedito"))
			ordine.setStatoOrdine(new StatoSpedito());
	}

}