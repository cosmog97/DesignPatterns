package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.second;

public class StatoEsaurito implements Stato {

	@Override
	public void gestioneStatoOrdine(Ordine ordine, String stato) {
		if (stato.equals("cancellato"))
			ordine.setStatoOrdine(new StatoCancellato());
	}

}