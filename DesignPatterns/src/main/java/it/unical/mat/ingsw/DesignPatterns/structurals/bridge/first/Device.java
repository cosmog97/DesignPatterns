package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.first;

public interface Device {

	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);

	void printStatus();
}
