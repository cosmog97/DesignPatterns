package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.ui;

import java.awt.Color;
import java.awt.Graphics;

public class Tipo {
	private String nome;
	private Color colore;
	private String dati;

	public Tipo(String name, Color color, String otherTreeData) {
		this.nome = name;
		this.colore = color;
		this.dati = otherTreeData;
	}

	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.BLACK);
		g.fillRect(x - 1, y, 3, 5);
		g.setColor(colore);
		g.fillOval(x - 5, y - 10, 10, 10);
	}

}
