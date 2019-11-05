package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

class Pizza {

	private String impasto = "";
	private String salsa = "";
	private String condimento = "";

	public void setImpasto(String dough) {
		this.impasto = dough;
	}

	public void setSalsa(String sauce) {
		this.salsa = sauce;
	}

	public void setCondimento(String topping) {
		this.condimento = topping;
	}

	@Override
	public String toString() {
		return "Pizza con impasto " + this.impasto + ", salsa " + this.salsa + ", condimenti " + this.condimento + ".";
	}
}