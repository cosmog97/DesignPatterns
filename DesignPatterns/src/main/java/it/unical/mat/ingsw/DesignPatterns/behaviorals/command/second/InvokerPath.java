package it.unical.mat.ingsw.DesignPatterns.behaviorals.command.second;

public class InvokerPath {

	Command command = null;

	public InvokerPath(Command command) {
		this.command = command;
	}

	public void path() {
		command.execute();
	}

}