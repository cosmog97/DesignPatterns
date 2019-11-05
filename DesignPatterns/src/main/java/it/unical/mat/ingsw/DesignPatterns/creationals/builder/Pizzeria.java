package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class Pizzeria {

	private Cuoco cuoco;

	public void setCuoco(Cuoco pb) {
		cuoco = pb;
	}

	public Pizza getPizza() {
		return cuoco.getPizza();
	}

	public Pizzeria constructPizza() {
		cuoco.createPizza();
		cuoco.buildImpasto();
		cuoco.buildSalsa();
		cuoco.buildCondimento();
		return this;
	}
}