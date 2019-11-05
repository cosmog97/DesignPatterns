package it.unical.mat.ingsw.DesignPatterns.creationals.abstractfactorysingleton;

public class PizzeriaRomana implements Pizzeria {

	private static PizzeriaRomana pizzeriaRomana = null;

	private PizzeriaRomana() {

	}

	public static PizzeriaRomana getPizzeriaRomanaInstance() {
		if (pizzeriaRomana != null) {
			pizzeriaRomana = new PizzeriaRomana();
		}
		return pizzeriaRomana;
	}

	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new PizzaRomana();
	}

	public Calzone createCalzone() {
		// TODO Auto-generated method stub
		return new CalzoneRomano();
	}

}
