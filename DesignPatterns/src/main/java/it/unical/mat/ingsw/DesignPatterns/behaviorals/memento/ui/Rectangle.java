package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.ui;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BaseShape {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031459075894764450L;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
	}
}
