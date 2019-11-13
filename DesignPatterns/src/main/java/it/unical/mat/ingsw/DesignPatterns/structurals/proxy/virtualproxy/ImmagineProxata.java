package it.unical.mat.ingsw.DesignPatterns.structurals.proxy.virtualproxy;

public class ImmagineProxata implements Immagine {

	private String nomeFile;

	private ImmagineReale immagineReale;

	public ImmagineProxata(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	@Override
	public void disegnaImmagine() {
		if (immagineReale == null) {
			immagineReale = new ImmagineReale(nomeFile);
		}
		immagineReale.disegnaImmagine();
	}

}
