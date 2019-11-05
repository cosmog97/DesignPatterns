package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public class SemiCroma extends NotaMusicale {

	@Override
	public SemiCroma clone() throws CloneNotSupportedException {
		SemiCroma semicroma = new SemiCroma();
		semicroma.setAltezzaPentagramma(this.altezzaPentagramma);
		semicroma.setPosizionePentagramma(this.posizionePentagramma);
		return semicroma;
	}

}
