package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class CuocoCapricciosa extends Cuoco {
	@Override
	public void buildDough() {
		pizza.setDough("");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("");
	}

}
