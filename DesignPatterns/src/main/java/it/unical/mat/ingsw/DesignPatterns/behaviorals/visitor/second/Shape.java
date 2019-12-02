package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.second;

public interface Shape {
	void move(int x, int y);

	void draw();

	String accept(Visitor visitor);
}