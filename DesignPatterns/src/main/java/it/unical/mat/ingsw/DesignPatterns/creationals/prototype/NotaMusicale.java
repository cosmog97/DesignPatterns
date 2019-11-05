package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public abstract class NotaMusicale implements Cloneable {

	protected int altezzaPentagramma;

	protected int posizionePentagramma;

	@Override
	public abstract NotaMusicale clone() throws CloneNotSupportedException;

	public int getAltezzaPentagramma() {
		return altezzaPentagramma;
	}

	public void setAltezzaPentagramma(int altezzaPentagramma) {
		this.altezzaPentagramma = altezzaPentagramma;
	}

	public int getPosizionePentagramma() {
		return posizionePentagramma;
	}

	public void setPosizionePentagramma(int posizionePentagramma) {
		this.posizionePentagramma = posizionePentagramma;
	}
}
