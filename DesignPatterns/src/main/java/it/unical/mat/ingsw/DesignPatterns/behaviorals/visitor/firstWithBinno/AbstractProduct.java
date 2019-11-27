package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.firstWithBinno;

public class AbstractProduct implements ProductInterface {
	private double price;

	public AbstractProduct(double price) {
		this.price = price;
	}

	@Override
	public void accept(ProductVisitor v) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double p) {
		// TODO Auto-generated method stub
		price = p;
	}
}
