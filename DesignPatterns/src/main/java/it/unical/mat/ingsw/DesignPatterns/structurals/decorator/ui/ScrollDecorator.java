package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Component;

import javax.swing.JScrollPane;

public class ScrollDecorator extends Decorator{
	
	public ScrollDecorator(Oggetto oggetto) {
		setComponent(oggetto);
	}
	
	@Override
	public Component draw() {
		Component comp = super.draw();
		JScrollPane pane = new JScrollPane(comp);
		return pane;
	}
}
