package it.unical.mat.ingsw.DesignPatterns.structurals.decorator.ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Primo Oggetto");
		Oggetto primoOggetto = new BorderDecorator(new CasellaTesto(), Color.RED);		
		frame.setContentPane(new JPanel());
		frame.getContentPane().add(primoOggetto.draw());		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		
		JFrame frame2 = new JFrame("Secondo Oggetto");
		Oggetto secondoOggetto = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new AreaTesto()), Color.BLUE)
													, Color.RED);				
		frame2.setContentPane(new JPanel());
		frame2.getContentPane().add(secondoOggetto.draw());		
		frame2.setSize(800, 500);
		frame2.setVisible(true);	
							
	}
}
