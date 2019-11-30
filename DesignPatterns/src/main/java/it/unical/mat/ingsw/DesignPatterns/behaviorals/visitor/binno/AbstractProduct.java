package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.binno;

public abstract class AbstractProduct implements ProductInterface {
	private double price;

	public AbstractProduct(double price) {
		this.price = price;
	}

	@Override
	public abstract void accept(ProductVisitor v);

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
