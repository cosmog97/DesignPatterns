package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.first;

public class Element {

	private String hello = "Element";

	public String getHello() {
		return hello;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}