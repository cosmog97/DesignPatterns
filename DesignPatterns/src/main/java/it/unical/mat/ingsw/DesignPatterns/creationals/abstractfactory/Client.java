package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactory;

public class Client {

	public static void main(String[] args) {
		Pizzeria pizzeriaRomana = new PizzeriaRomana();
		Pizzeria pizzeriaNapoletana = new PizzeriaNapoletana();
		Pizza pizzaRomana = pizzeriaRomana.createPizza();
		Pizza pizzaNapoletana = pizzeriaNapoletana.createPizza();
		Calzone calzoneRomano = pizzeriaRomana.createCalzone();
		Calzone calzoneNapoletano = pizzeriaNapoletana.createCalzone();

	}

}
