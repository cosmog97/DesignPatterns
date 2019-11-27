package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.io.FileOutputStream;
import java.util.List;

public abstract class Table {

	protected StringBuilder tableContent;
	protected String filePath = "/testPattern/table";

	// metodo template "public final" che DEVE essere visibile
	// MA NON DEVE essere sovrascritto in quanto definisce l'algoritmo
	public final void createTable(List dvdList) {
		logging();
		tableContent = doBody(dvdList);
		doHook();
		saveFile();
	}

	// metodo fattorizzato "private" facente parte dell'algoritmo
	private void logging() {
		System.out.println("## Generazione della tabella in base al formato/contenuto richiesto ##");
	}

	// metodo "abstract" primitivo che DEVE essere implementato
	protected abstract StringBuilder doBody(List<DVD> dvdList);

	// metodo concreto vuoto che PUO' ESSERE implementato
	protected void doHook() {
	}

	// metodo fattorizzato "private" facente parte dell'algoritmo
	private void saveFile() {
		try {
			new FileOutputStream(filePath).write(tableContent.toString().getBytes());
			System.out.println("## File path: " + filePath);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}