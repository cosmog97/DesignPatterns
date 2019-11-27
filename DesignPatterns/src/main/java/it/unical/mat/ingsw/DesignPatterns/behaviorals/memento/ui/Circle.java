package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.ui;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends BaseShape {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6567574564254784871L;
	private int radius;

	public Circle(int x, int y, int radius, Color color) {
		super(x, y, color);
		this.radius = radius;
	}

	@Override
	public int getWidth() {
		return radius * 2;
	}

	@Override
	public int getHeight() {
		return radius * 2;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
	}
}
