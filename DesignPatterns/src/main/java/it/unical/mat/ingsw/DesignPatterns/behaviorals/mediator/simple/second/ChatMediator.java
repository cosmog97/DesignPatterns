package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.simple.second;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
