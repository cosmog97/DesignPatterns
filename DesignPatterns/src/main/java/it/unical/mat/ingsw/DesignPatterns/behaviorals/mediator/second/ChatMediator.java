package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.second;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
}
