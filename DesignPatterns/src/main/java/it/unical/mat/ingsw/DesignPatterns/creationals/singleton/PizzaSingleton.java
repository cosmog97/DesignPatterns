package it.unical.mat.ingsw.DesignPatterns.creationals.singleton;

public class PizzaSingleton {
	
	private final static PizzaSingleton mySingleton = new PizzaSingleton();
	
	private PizzaSingleton() {
		System.out.println("PizzaSingleton inizializzata");
	}
	
	public static PizzaSingleton getInstance(){
		   return mySingleton;
	}
	
}
