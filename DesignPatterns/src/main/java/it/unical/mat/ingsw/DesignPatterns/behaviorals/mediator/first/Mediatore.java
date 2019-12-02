package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.first;

public abstract class Mediatore {

	public abstract void aggiungi(Collega collega);

	public abstract void inviaRicevi(String nickNameMittente, String messaggio, String nickNameDestinatario);

}