package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.first;

public class RedColor implements Color {

	private static final String COLOR_NAME = "WHITE";
	private static final String HEX_COLOR = "#FFFFFF";

	@Override
	public void showColor() {
		System.out.println(COLOR_NAME);
	}

}