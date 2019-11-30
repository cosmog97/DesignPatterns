package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.binno;

public class Client {

	public static void main(String[] args) {
		Chart chart = new Chart();
		chart.addProduct(new NecessityProduct(1));
		chart.addProduct(new TobaccoProduct(3));
		chart.addProduct(new LiquorProduct(5));
		chart.addProduct(new NecessityProduct(2.5));
		chart.addProduct(new OrdinaryProduct(1));
		chart.addProduct(new OrdinaryProduct(10));
		chart.addProduct(new NecessityProduct(3));
		System.out.println("Il prezzo totale con le tasse è: " + chart.checkout());

	}

}
