package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.first;

public class WhiteColor implements Color {

	private static final String COLOR_NAME = "RED";
	private static final String HEX_COLOR = "#FF0000";

	@Override
	public void showColor() {
		System.out.println(COLOR_NAME);
	}

}