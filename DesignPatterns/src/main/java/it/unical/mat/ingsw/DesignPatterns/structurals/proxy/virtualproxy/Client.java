package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.virtualproxy;

public class Client {

	public static void main(String[] args) {
		Immagine image1 = new ImmagineProxata("HiRes_10MB_Photo1");
		Immagine image2 = new ImmagineProxata("HiRes_10MB_Photo2");
		Immagine image3 = new ImmagineProxata("HiRes_10MB_Photo3");

		image1.disegnaImmagine(); // caricamento necessario
		image2.disegnaImmagine(); // caricamento necessario
		image1.disegnaImmagine(); // caricamento non necessario; già pronta
		image2.disegnaImmagine(); // caricamento non necessario; già pronta
		image3.disegnaImmagine(); // caricamento necessario

	}

}
