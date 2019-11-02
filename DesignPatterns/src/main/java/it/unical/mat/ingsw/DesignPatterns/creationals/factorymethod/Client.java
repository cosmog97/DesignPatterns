package it.unical.mat.ingsw.DesignPatterns.creationals.factorymethod;

public class Client {

	public static void main(String[] args) {
		Pizzeria pizzeriaNapoletana = new PizzeriaNapoletana();
		Pizza pizza1 = pizzeriaNapoletana.createPizzaDiavola();
		Pizza pizza2 = pizzeriaNapoletana.createPizzaMargherita();
		Pizza pizza3 = pizzeriaNapoletana.createPizzaDiavola();
		pizza1.mangia();
		pizza2.mangia();
		pizza3.mangia();
	}

}
