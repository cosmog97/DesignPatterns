package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.ui;

import javax.swing.DefaultListModel;

/**
 * Demo class. Everything comes together here.
 */
public class Client {
	public static void main(String[] args) {
		Mediator mediator = new Editor();

		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());

		mediator.createGUI();
	}
}