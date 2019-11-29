package it.unical.mat.ingsw.DesignPatterns.behaviorals.iterator.first;

public class Client {

	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("item1");
		aggregate.add("item2");

		MyIterator iterator = aggregate.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}