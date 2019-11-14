package it.unical.mat.ingsw.DesignPatterns.structurals.facade;

public class Client {

	public static void main(String[] args) {
		BusinessFacade businessFacade = new BusinessFacade();
		businessFacade.getInfo();
	}

}
