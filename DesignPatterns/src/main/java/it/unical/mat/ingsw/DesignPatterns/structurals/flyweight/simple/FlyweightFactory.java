package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.simple;

import java.util.Hashtable;

public class FlyweightFactory {

	private static Hashtable<Character, FlyweightCharacter> cache = new Hashtable<Character, FlyweightCharacter>();

	public static FlyweightCharacter getFlyweight(Character character) {
		FlyweightCharacter flyweight = null;
		if (cache.containsKey(character)) {
			flyweight = cache.get(character);
		} else {
			flyweight = new ConcreteFlyweightCharacter(character);
			cache.put(character, flyweight);
		}
		return flyweight;
	}
}