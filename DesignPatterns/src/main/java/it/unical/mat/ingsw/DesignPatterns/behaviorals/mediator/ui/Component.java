package it.unical.mat.ingsw.DesignPatterns.behaviorals.mediator.ui;

public interface Component {
	void setMediator(Mediator mediator);

	String getName();
}