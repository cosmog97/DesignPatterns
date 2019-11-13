package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class BorderDecorator extends Decorator{
	Color color;
	
	public BorderDecorator(Oggetto oggetto, Color color) {
		setComponent(oggetto);
		this.color = color;
	}
	
	@Override
	public Component draw() {
		Component oggetto = super.draw();
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(color));
		panel.add(oggetto);
		return panel;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
}
