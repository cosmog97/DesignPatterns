package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.first;

public class Visitor {

	public void visit(Element element) {
		System.out.println("Hello " + element.getHello());
	}

}