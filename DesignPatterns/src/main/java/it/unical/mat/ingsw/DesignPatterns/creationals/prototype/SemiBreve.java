package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public class SemiBreve extends NotaMusicale {

	@Override
	public SemiBreve clone() throws CloneNotSupportedException {
		SemiBreve semiBreve = new SemiBreve();
		semiBreve.setAltezzaPentagramma(this.altezzaPentagramma);
		semiBreve.setPosizionePentagramma(this.posizionePentagramma);
		return semiBreve;
	}

}
