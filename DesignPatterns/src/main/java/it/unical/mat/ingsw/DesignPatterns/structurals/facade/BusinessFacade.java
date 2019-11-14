package it.unical.mat.ingsw.DesignPatterns.structurals.facade;

public class BusinessFacade {

	private static Azienda azienda;

	private static Business ceo;

	private static Business capoMarketing;

	static {
		azienda = new Azienda();
		ceo = new CEO();
		capoMarketing = new CapoMarketing();
	}

	public void getInfo() {
		ceo.getInfo();
		capoMarketing.getInfo();
		azienda.getPosizione();
	}
}
