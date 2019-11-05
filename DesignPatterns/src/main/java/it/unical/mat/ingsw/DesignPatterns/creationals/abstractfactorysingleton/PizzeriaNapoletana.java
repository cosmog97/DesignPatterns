package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactorysingleton;

public class PizzeriaNapoletana implements Pizzeria {

	private static PizzeriaNapoletana pizzeriaNapoletana = null;

	private PizzeriaNapoletana() {

	}

	public static PizzeriaNapoletana getPizzeriaNapoletanaInstance() {
		if (pizzeriaNapoletana != null) {
			pizzeriaNapoletana = new PizzeriaNapoletana();
		}
		return pizzeriaNapoletana;
	}

	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new PizzaNapoletana();
	}

	public Calzone createCalzone() {
		// TODO Auto-generated method stub
		return new CalzoneNapoletano();
	}

}
