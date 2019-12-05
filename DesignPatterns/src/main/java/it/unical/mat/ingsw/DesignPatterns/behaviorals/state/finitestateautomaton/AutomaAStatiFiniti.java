package it.unical.mat.ingsw.DesignPatterns.behaviorals.state.finitestateautomaton;

//b+(c|d)*e+

public class AutomaAStatiFiniti {
	public static void main(String[] args) throws Exception {
		new AutomaAStatiFiniti().riconosciLinguaggio();
	}

	public void riconosciLinguaggio() throws Exception {
		EspressioneRegolare regex = new EspressioneRegolare();

		Stato stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "b");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "b");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "c");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "c");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "d");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "e");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "e");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

		stato.leggi(regex, "e");
		stato = regex.getEspressione();
		System.out.println("Stato attuale: " + stato);

	}
}
