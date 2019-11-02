package it.unical.mat.ingsw.DesignPatterns.creationals.singleton;

public class Client {

	public static void main(String[] args) {
		PizzaSingleton pizzaSingleton1 = PizzaSingleton.getInstance();
		PizzaSingleton pizzaSingleton2 = PizzaSingleton.getInstance();
		PizzaLazySingleton pizzaLazySingleton1 = PizzaLazySingleton.getInstance();
		PizzaLazySingleton pizzaLazySingleton2 = PizzaLazySingleton.getInstance();
	}

}
