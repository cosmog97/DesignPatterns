package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.second;

public class TelecomandoBase implements Telecomando {

	private Device device;

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

}
