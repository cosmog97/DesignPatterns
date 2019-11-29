package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.first;

public interface Aggregate {

	public MyIterator createIterator();

	public void add(Object item);

}