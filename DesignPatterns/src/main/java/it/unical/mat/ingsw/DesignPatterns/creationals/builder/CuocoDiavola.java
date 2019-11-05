package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class CuocoDiavola extends Cuoco {

	@Override
	public void buildImpasto() {
		pizza.setImpasto("di farina 00");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("di pomodorini freschi e basilico");
	}

	@Override
	public void buildCondimento() {
		pizza.setCondimento("salame piccante calabrese");
	}

}
