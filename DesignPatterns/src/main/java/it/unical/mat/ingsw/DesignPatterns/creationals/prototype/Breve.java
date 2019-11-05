package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public class Breve extends NotaMusicale {

	@Override
	public Breve clone() throws CloneNotSupportedException {
		Breve breve = new Breve();
		breve.setAltezzaPentagramma(this.altezzaPentagramma);
		breve.setPosizionePentagramma(this.posizionePentagramma);
		return breve;
	}

}
