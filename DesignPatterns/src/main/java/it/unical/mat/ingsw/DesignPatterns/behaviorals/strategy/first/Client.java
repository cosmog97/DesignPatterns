package it.unical.mat.ingsw.DesignPatterns.behaviorals.strategy.first;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		ElementList contextElements = new ElementList();
		contextElements.addElement(new int[] { 3, 2, 4, 3, 6, 5 });
		contextElements.setSortAlgorithm(new InsertionSortAlgorithm());
		List sortedList = contextElements.getSortedList();
	}
}