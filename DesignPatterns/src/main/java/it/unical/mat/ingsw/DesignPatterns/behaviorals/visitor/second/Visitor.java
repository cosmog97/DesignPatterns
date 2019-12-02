package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.second;

public interface Visitor {
	String visitDot(Dot dot);

	String visitCircle(Circle circle);

	String visitRectangle(Rectangle rectangle);

	String visitCompoundGraphic(CompoundShape cg);
}