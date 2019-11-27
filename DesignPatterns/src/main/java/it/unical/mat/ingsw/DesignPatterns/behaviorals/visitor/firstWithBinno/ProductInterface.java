package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.firstWithBinno;

public interface ProductInterface {
	public void accept(ProductVisitor v);

	public double getPrice();

	public void setPrice(double p);
}
