package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.second;

public class Client {

	public static void main(String[] args) {
		// Contesto delle variabili ed operatori
		String operazione = "45 + 38 - 13 / 21 * 16";
		Contesto contesto = new Contesto(operazione);

		// Risultato
		int risultato = 0;
		while (true) {
			try {
				Espressione operatore = contesto.getOperatore();
				risultato = operatore.interpreta(contesto);
			} catch (java.util.EmptyStackException ese) {
				break;
			}
		}
		System.out.println(operazione + " = " + risultato);
	}
}