package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactory;

public class PizzeriaNapoletana implements Pizzeria {

	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new PizzaNapoletana();
	}

	public Calzone createCalzone() {
		// TODO Auto-generated method stub
		return new CalzoneNapoletano();
	}

}
