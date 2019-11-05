package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

abstract class Cuoco {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createPizza() {
		pizza = new Pizza();
	}

	public abstract void buildImpasto();

	public abstract void buildSalsa();

	public abstract void buildCondimento();
}
