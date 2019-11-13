package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Component;

public abstract class Decorator implements Oggetto{
	private Oggetto componente;

	@Override
	public Component draw() {
		return componente.draw();
	}
	
	public void setComponent(Oggetto oggetto){
		this.componente = oggetto;
	}
}
