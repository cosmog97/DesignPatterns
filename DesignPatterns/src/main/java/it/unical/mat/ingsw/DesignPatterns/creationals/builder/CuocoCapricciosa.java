package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class CuocoCapricciosa extends Cuoco {
	
	@Override
	public void buildImpasto() {
		pizza.setImpasto("di farina integrale");
		
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("di pomodoro");
	}

	@Override
	public void buildCondimento() {
		pizza.setCondimento("mozzarella, olive, prosciutto cotto");
	}

}
