package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.gui;

public interface Component {
	void setMediator(Mediator mediator);

	String getName();
}