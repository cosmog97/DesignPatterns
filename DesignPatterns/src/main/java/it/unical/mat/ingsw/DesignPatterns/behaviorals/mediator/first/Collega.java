package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.first;

public abstract class Collega {

	public abstract void invia(String messaggio, String nickNameDestinatario);

	public abstract String getNickName();

	public abstract void ricevi(String messaggio, String nickNameMittente);

}