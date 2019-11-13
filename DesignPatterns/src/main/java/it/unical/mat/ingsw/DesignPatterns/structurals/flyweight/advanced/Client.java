package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.advanced;

import java.awt.Color;

public class Client {
	static int CANVAS_SIZE = 500;
	static int TREES_TO_DRAW = 1000000;
	static int TREE_TYPES = 2;

	public static void main(String[] args) {
		Foresta foresta = new Foresta();
		for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
			foresta.piantaAlbero(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak", Color.GREEN,
					"Oak texture stub");
			foresta.piantaAlbero(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE,
					"Autumn Oak texture stub");
		}
		foresta.setSize(CANVAS_SIZE, CANVAS_SIZE);
		foresta.setVisible(true);

		System.out.println(TREES_TO_DRAW + " trees drawn");
		System.out.println("---------------------");
		System.out.println("Memory usage:");
		System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
		System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
		System.out.println("---------------------");
		System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) + "MB (instead of "
				+ ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
	}

	private static int random(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}