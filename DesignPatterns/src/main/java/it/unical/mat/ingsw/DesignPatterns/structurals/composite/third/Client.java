package it.unical.mat.ingsw.DesignPatterns.structurals.composite.third;

import java.util.ArrayList;
import java.util.List;

interface Graphic {

	// Stampa il grafico.
	public void print();

}

class CompositeGraphic implements Graphic {

	// Collezione di grafici figli.
	private List<Graphic> mChildGraphics = new ArrayList<Graphic>();

	// Stampa il grafico.
	@Override
	public void print() {
		for (Graphic graphic : mChildGraphics) {
			graphic.print();
		}
	}

	// Aggiunge il grafico alla composizione.
	public void add(Graphic graphic) {
		mChildGraphics.add(graphic);
	}

	// Rimuove il grafico dalla composizione.
	public void remove(Graphic graphic) {
		mChildGraphics.remove(graphic);
	}

}

class Ellisse implements Graphic {

	// Stampa il grafico.
	@Override
	public void print() {
		System.out.println("Ellisse");
	}

}

public class Client {

	public static void main(String[] args) {
		// Inizializza tre ellissi
		Ellisse ellisse1 = new Ellisse();
		Ellisse ellisse2 = new Ellisse();
		Ellisse ellisse3 = new Ellisse();
		Ellisse ellisse4 = new Ellisse();

		// Inizializza tre grafici composti
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		// Compone i grafici
		graphic1.add(ellisse1);
		graphic1.add(ellisse2);
		graphic1.add(ellisse3);

		graphic2.add(ellisse4);

		graphic.add(graphic1);
		graphic.add(graphic2);

		// Stampa i grafici completi (quattro volte la stringa "Ellisse").
		graphic.print();
	}
}