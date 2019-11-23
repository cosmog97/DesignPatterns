package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.protectionproxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverhost) {
		System.out.println("Connecting to " + serverhost);
	}
}
