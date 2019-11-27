package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Table table = null;

		// Creazione di una tabella in formato XML
		table = new XMLTable();
		table.createTable(dvdList);

		// Creazione di una tabella in formato CSV
		table = new CSVTable();
		table.createTable(dvdList);

		// Creazione di una tabella in formato HTML
		table = new HTMLTable();
		table.createTable(dvdList);

	}

	private final static List dvdList;
	static {
		dvdList = new ArrayList();
		dvdList.add(new DVD("Biancaneve e il cacciatore", "Rupert Sanders", "Fantasy"));
		dvdList.add(new DVD("La bella e la bestia", "Gary Trousdale", "Animazione"));
		dvdList.add(new DVD("Freerunner - corri o muori", "Lawrence Silverstein", "Azione"));
	}
}