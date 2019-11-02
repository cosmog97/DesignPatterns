package it.unical.mat.ingsw.DesignPatterns.creationals.factorymethod;

public class PizzeriaNapoletana implements Pizzeria {

	public Pizza createPizzaMargherita() {
		// TODO Auto-generated method stub
		return new PizzaMargherita();
	}

	public Pizza createPizzaDiavola() {
		// TODO Auto-generated method stub
		return new PizzaDiavola();
	}

}
