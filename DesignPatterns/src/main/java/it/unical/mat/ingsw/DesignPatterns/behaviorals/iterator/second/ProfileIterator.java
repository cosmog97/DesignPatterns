package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.second;

public interface ProfileIterator {
	boolean hasNext();

	Profile getNext();

	void reset();
}