package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public class Croma extends NotaMusicale {

	@Override
	public Croma clone() throws CloneNotSupportedException {
		Croma croma = new Croma();
		croma.setAltezzaPentagramma(this.altezzaPentagramma);
		croma.setPosizionePentagramma(this.posizionePentagramma);
		return croma;
	}
}
