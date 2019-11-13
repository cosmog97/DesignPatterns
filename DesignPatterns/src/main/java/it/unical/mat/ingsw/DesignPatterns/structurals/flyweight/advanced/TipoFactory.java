package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.advanced;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TipoFactory {
	static private Map<String, Tipo> tipi = new HashMap<>();

	public static Tipo getTreeType(String nome, Color colore, String dati) {
		Tipo result = tipi.get(nome);
		if (result == null) {
			result = new Tipo(nome, colore, dati);
			tipi.put(nome, result);
		}
		return result;
	}
}
