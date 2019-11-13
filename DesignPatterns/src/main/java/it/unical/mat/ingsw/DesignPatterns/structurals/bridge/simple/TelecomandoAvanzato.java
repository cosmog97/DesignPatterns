package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.simple;

public class TelecomandoAvanzato implements Telecomando {

	private Device device;

	private boolean isMute = false;

	@Override
	public void controllaDevice(Device d) {
		device = d;

	}

	@Override
	public void premiTastoAccensione() {
		if (device.eAcceso()) {
			device.spegni();
		} else {
			device.accendi();
		}

	}

	@Override
	public void aumentaVolume() {
		device.setVolume(device.getVolume() + 1);
	}

	@Override
	public void diminuisciVolume() {
		device.setVolume(device.getVolume() - 1);
	}

	@Override
	public void aumentaCanale() {
		device.setCanale(device.getCanale() + 1);
	}

	@Override
	public void diminuisciCanale() {
		device.setCanale(device.getCanale() - 1);
	}

	public void inserisciVolumeDesiderato(int volume) {
		device.setVolume(volume);
	}

	public void inserisciCanaleDesiderato(int canale) {
		device.setCanale(canale);
	}

	public void premiTastoMuto() {
		if (isMute) {
			isMute = false;
			device.setVolume(50);
		} else {
			isMute = true;
			device.setVolume(0);
		}
	}

}
