package it.unical.mat.ingsw.DesignPatterns.behaviorals.command.second;

public class Client {

	public static void main(String[] args) {
		InvokerPath invokerPath = new InvokerPath(new CommandPath(new Receiver()));
		invokerPath.path();
	}

}