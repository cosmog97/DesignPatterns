package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.ui;

import java.awt.Graphics;

public class Albero {
	private int x;
	private int y;
	private Tipo tipo;

	public Albero(int x, int y, Tipo tipo) {
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}

	public void draw(Graphics g) {
		tipo.draw(g, x, y);
	}
}