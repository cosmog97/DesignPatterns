package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton2;

//b+(c|d)*e+

public class AutomaAStatiFiniti {
	public static void main(String[] args) throws Exception {
		char[] array = { 'b', 'e' };
		EspressioneRegolare regex = new EspressioneRegolare(array);
		regex.riconosci();
	}
}
