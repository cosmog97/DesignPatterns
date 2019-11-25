package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.gui;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class TextBox extends JTextArea implements Component {
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void processComponentKeyEvent(KeyEvent keyEvent) {
		mediator.markNote();
	}

	@Override
	public String getName() {
		return "TextBox";
	}
}