package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.binno;

public class LiquorProduct extends AbstractProduct {
	public LiquorProduct(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ProductVisitor v) {
		v.visit(this);
	}

}
