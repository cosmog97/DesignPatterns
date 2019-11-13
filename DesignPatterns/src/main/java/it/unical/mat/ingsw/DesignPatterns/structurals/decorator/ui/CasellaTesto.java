package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Component;

import javax.swing.JTextField;

public class CasellaTesto implements Oggetto {

	@Override
	public Component draw() {
		JTextField text = new JTextField();
		text.setColumns(30);
		return text;
	}

	
}
