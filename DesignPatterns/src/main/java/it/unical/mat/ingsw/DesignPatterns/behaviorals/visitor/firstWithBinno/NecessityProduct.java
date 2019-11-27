package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.firstWithBinno;

public class NecessityProduct extends AbstractProduct {
	public NecessityProduct(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(ProductVisitor v) {
		v.visit(this);
	}

}
