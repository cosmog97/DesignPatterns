package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.simple;

public interface Telecomando {

	public void controllaDevice(Device d);

	public void premiTastoAccensione();

	public void aumentaVolume();

	public void diminuisciVolume();

	public void aumentaCanale();

	public void diminuisciCanale();

}
