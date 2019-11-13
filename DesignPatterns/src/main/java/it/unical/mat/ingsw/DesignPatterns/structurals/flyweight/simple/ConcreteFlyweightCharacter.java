package it.unical.mat.ingsw.DesignPatterns.structurals.flyweight.simple;

public class ConcreteFlyweightCharacter implements FlyweightCharacter {

	Character character = null;

	// stato interno
	public ConcreteFlyweightCharacter(Character character) {
		this.character = Character.toUpperCase(character);
	}

	@Override
	public Character operation() {
		return character;
	}

	// stato esterno
	@Override
	public void setColor(String color) {
		System.out.println("Colore: " + color);
	}
}
