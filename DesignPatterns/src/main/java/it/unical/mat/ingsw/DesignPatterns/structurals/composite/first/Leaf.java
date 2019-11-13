package it.unical.mat.ingsw.DesignPatterns.structurals.composite.first;

public class Leaf implements Component {
	private String info;

	public Leaf(String info) {
		this.info = info;
	}

	@Override
	public void add(Component c) throws Exception {
		throw new Exception("Impossibile aggiungere componenti ad una foglia");
	}

	@Override
	public void remove(Component c) throws Exception {
		throw new Exception("Impossibile rimuovere componenti da una foglia");
	}

	@Override
	public void print() {
		System.out.println("Informazione :" + info);
	}
}
