package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.virtualproxy;

public class ImmagineReale implements Immagine {

	private String nomeFile;

	public ImmagineReale(String nomeFile) {
		this.nomeFile = nomeFile;
		caricaImmagine();
	}

	private void caricaImmagine() {
		System.out.println("Carimento immagine " + nomeFile);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void disegnaImmagine() {
		System.out.println("Sono l'immagine " + nomeFile);
	}

}
