package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.second;

public class Radio implements Device {
	private boolean isEnabled = false;

	private int volume;
	private int channel;

	@Override
	public boolean eAcceso() {
		return isEnabled;
	}

	@Override
	public void accendi() {
		isEnabled = true;
	}

	@Override
	public void spegni() {
		isEnabled = false;
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void setCanale(int canale) {
		this.channel = canale;

	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public int getCanale() {
		return channel;
	}
}
