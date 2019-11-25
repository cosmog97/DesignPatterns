package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.simple.first;

import java.util.ArrayList;
import java.util.List;

public class ConcretoMediatore extends Mediatore {

	private List<Collega> colleghiInLista = new ArrayList<Collega>();

	@Override
	public void aggiungi(Collega collega) {
		colleghiInLista.add(collega);
	}

	@Override
	public void inviaRicevi(String nickNameMittente, String messaggio, String nickNameDestinatario) {
		for (Collega collegaInLista : colleghiInLista) {
			if (collegaInLista.getNickName().equals(nickNameDestinatario)) {
				collegaInLista.ricevi(messaggio, nickNameMittente);
			}
		}
	}

}