package it.unical.mat.ingsw.DesignPatterns.behaviorals.memento.ui;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends BaseShape {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1318968603759144362L;
	private final int DOT_SIZE = 3;

	public Dot(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public int getWidth() {
		return DOT_SIZE;
	}

	@Override
	public int getHeight() {
		return DOT_SIZE;
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
	}
}
