package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.ui;

/**
 * Demo class. Everything comes together here.
 */
public class Client {
	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();
	}
}