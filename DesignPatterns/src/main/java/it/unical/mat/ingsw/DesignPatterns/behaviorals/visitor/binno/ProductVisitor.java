package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.binno;

public interface ProductVisitor {

	// evitare di usare INSTANCEOF o switch

	void visit(NecessityProduct p);

	void visit(OrdinaryProduct p);

	void visit(TobaccoProduct p);

	void visit(LiquorProduct p);
}
