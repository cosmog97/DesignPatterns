package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.first;

public class Client {

	public static void main(String[] args) {
		Palette context = new Palette();
		context.setColor(new RedColor());
		context.currentColor();
		context.setColor(new WhiteColor());
		context.currentColor();
	}
}