package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.virtualproxy;

public class Client {

	public static void main(String[] args) {
		Immagine image1 = new ImmagineProxata("HiRes_10MB_Photo1");
		Immagine image2 = new ImmagineProxata("HiRes_10MB_Photo2");
		Immagine image3 = new ImmagineProxata("HiRes_10MB_Photo3");

		image1.disegnaImmagine(); // loading necessary
		image2.disegnaImmagine(); // loading necessary
		image1.disegnaImmagine(); // no loading necessary; already done
		image2.disegnaImmagine(); // no loading necessary; already done
		image3.disegnaImmagine(); // loading necessary

	}

}
