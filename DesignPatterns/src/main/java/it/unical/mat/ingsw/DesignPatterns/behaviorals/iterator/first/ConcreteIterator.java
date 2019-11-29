package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.first;

import java.util.ArrayList;

public class ConcreteIterator implements MyIterator {

	private ArrayList arrayList;
	private int current = -1;

	public ConcreteIterator(ArrayList arrayList) {
		this.arrayList = arrayList;
	}

	@Override
	public Object next() {
		current++;
		return arrayList.get(current);
	}

	@Override
	public boolean hasNext() {
		return (current + 1) < arrayList.size();
	}

}