package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactory;

public class PizzeriaRomana implements Pizzeria {

	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new PizzaRomana();
	}

	public Calzone createCalzone() {
		// TODO Auto-generated method stub
		return new CalzoneRomano();
	}

}
