package it.unical.mat.ingsw.DesignPatterns.structurals.bridge.second;

public class Client {

	public static void main(String[] args) {
		Device radio = new Radio();
		Device tv = new TV();

		Telecomando telecomandoBase = new TelecomandoBase();
		Telecomando telecomandoAvanzato = new TelecomandoAvanzato();

		telecomandoBase.controllaDevice(radio);
		telecomandoBase.premiTastoAccensione();
		telecomandoBase.aumentaVolume();
		telecomandoBase.diminuisciVolume();

		telecomandoAvanzato.controllaDevice(tv);
		telecomandoAvanzato.premiTastoAccensione();
		telecomandoAvanzato.aumentaCanale();
		telecomandoAvanzato.diminuisciCanale();
		((TelecomandoAvanzato) telecomandoAvanzato).premiTastoMuto();

	}

}
