package it.unical.mat.ingsw.DesignPatterns.behaviorals.command.first;

public class InvokerList {

	Command command = null;

	public InvokerList(Command command) {
		this.command = command;
	}

	public void list() {
		command.execute();
	}

}