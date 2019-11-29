package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.first;

public class Palette {

	private Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public void currentColor() {
		color.showColor();
	}

}