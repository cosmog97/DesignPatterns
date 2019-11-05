package it.unical.mat.ingsw.DesignPatterns.creationals.builder;

public class Client {

	public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        Cuoco cuocoCapricciosa = new CuocoCapricciosa();
        Cuoco cuocoDiavola = new CuocoDiavola();
        pizzeria.setCuoco(cuocoCapricciosa);
        Pizza pizza1 = pizzeria.constructPizza().getPizza();
        Pizza pizza2 = pizzeria.constructPizza().getPizza();
        pizzeria.setCuoco(cuocoDiavola);
        Pizza pizza3 = pizzeria.constructPizza().getPizza();
        System.out.println("PIZZA1: " + pizza1.toString() + " : " + pizza1.hashCode());
        System.out.println("PIZZA2: " + pizza2.toString() + " : " + pizza2.hashCode());
        System.out.println("PIZZA3: " + pizza3.toString() + " : " + pizza3.hashCode());
	}

}
