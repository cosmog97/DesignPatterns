package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Foresta extends JFrame {

	private static final long serialVersionUID = 1L;
	private List<Albero> alberi = new ArrayList<>();

	public void piantaAlbero(int x, int y, String nome, Color colore, String dati) {
		Tipo tipoAlbero = TipoFactory.getTreeType(nome, colore, dati);
		Albero albero = new Albero(x, y, tipoAlbero);
		alberi.add(albero);
	}

	@Override
	public void paint(Graphics graphics) {
		for (Albero albero : alberi) {
			albero.draw(graphics);
		}
	}
}