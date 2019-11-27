package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.firstWithBinno;

public class TaxProductVisitor implements ProductVisitor {

	@Override
	public void visit(NecessityProduct p) {
		p.setPrice(p.getPrice() * 1.04);

	}

	@Override
	public void visit(OrdinaryProduct p) {
		// TODO Auto-generated method stub
		p.setPrice(p.getPrice() * 1.10);
	}

	@Override
	public void visit(TobaccoProduct p) {
		// TODO Auto-generated method stub
		p.setPrice(p.getPrice() * 1.22);
	}

	@Override
	public void visit(LiquorProduct p) {
		// TODO Auto-generated method stub
		p.setPrice(p.getPrice() * 1.25);
	}

}
