package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Component;

import javax.swing.JTextArea;

public class AreaTesto implements Oggetto{

	@Override
	public Component draw() {
		JTextArea text = new JTextArea();
		text.setColumns(50);
		text.setRows(10);
		return text;
	}
	
}
