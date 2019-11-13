package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.simple;

public interface Device {

	public boolean eAcceso();

	public void accendi();

	public void spegni();

	public void setVolume(int volume);

	public void setCanale(int canale);

	public int getVolume();

	public int getCanale();
}
