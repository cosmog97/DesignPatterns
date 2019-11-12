package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

public interface RemoteController {
	void power();

	void volumeDown();

	void volumeUp();

	void channelDown();

	void channelUp();

	int getVolume();

	int getChannel();

	boolean getPower();
}
