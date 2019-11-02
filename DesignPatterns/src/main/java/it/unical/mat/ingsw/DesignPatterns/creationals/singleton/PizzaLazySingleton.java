package it.unical.mat.ingsw.DesignPatterns.creationals.singleton;

public class PizzaLazySingleton {
	
	private static PizzaLazySingleton mySingleton = null;
	  
	private PizzaLazySingleton(){
		System.out.println("PizzaLazySingleton inizializzata");
	}
	  
	public static PizzaLazySingleton getInstance(){
		if (mySingleton == null) {
			mySingleton = new PizzaLazySingleton();
	    }
		
	    return mySingleton;
	}
	  
}
