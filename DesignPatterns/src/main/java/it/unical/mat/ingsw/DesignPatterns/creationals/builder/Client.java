package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class Client {

	public static void main(String[] args) {
        Pizzeria cook = new Pizzeria();
        Cuoco hawaiianPizzaBuilder = new CuocoCapricciosa();
        Cuoco spicyPizzaBuilder = new CuocoDiavola();
        
        cook.setPizzaBuilder( hawaiianPizzaBuilder );

        
        Pizza pizza = cook.constructPizza().getPizza();
        
        Pizza pizza2 = cook.constructPizza().getPizza();
        
        System.out.println("PIZZA1: " + pizza.hashCode());
        System.out.println("PIZZA2: " + pizza2.hashCode());
	}

}
