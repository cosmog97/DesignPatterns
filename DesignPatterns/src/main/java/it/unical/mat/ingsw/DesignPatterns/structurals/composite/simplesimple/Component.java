package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simplesimple;

public interface Component {

	public void add(Component c) throws Exception;

	public void remove(Component c) throws Exception;

	public void print();
}