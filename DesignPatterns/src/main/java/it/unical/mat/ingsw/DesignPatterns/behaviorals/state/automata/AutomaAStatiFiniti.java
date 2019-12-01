package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.automata;

//a+(bc)*b

public class AutomaAStatiFiniti {
	public static void main(String[] args) {
		new AutomaAStatiFiniti().riconosciLinguaggio();
	}

	public void riconosciLinguaggio() {
		EspressioneRegolare regex = new EspressioneRegolare();

		Stato stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "a");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "a");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "a");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "b");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "c");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "b");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "c");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "b");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

	}
}
