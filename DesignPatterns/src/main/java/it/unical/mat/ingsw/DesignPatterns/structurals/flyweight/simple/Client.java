package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.simple;

public class Client {

	public static void main(String[] args) {

		FlyweightCharacter a1 = FlyweightFactory.getFlyweight('a');
		System.out.println("HashCode: " + a1.hashCode());
		System.out.println("Value: " + a1.operation());
		a1.setColor("red");

		FlyweightCharacter a2 = FlyweightFactory.getFlyweight('a');

		System.out.println("HashCode: " + a2.hashCode());
		System.out.println("Value: " + a2.operation());
		a2.setColor("blue");

	}
}