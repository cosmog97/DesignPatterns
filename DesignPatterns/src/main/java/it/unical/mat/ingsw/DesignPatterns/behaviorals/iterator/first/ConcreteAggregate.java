package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.first;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {

	private ArrayList arrayList;

	public ConcreteAggregate() {
		arrayList = new ArrayList();
	}

	@Override
	public MyIterator createIterator() {
		return new ConcreteIterator(arrayList);
	}

	@Override
	public void add(Object item) {
		arrayList.add(item);
	}
}