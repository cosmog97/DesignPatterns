package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactorysingleton;

public class Client {

	public static void main(String[] args) {
		Pizzeria pizzeriaRomana = PizzeriaRomana.getPizzeriaRomanaInstance();
		Pizzeria pizzeriaNapoletana = PizzeriaNapoletana.getPizzeriaNapoletanaInstance();
		Pizza pizzaRomana = pizzeriaRomana.createPizza();
		Pizza pizzaNapoletana = pizzeriaNapoletana.createPizza();
		Calzone calzoneRomano = pizzeriaRomana.createCalzone();
		Calzone calzoneNapoletano = pizzeriaNapoletana.createCalzone();
	}
}
