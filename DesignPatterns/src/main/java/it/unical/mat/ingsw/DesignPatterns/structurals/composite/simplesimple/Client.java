package it.unical.mat.ingsw.DesignPatterns.structurals.composite.simplesimple;

public class Client {
	public static void main(String args[]) {
		Component a = new Leaf("uno");
		Component b = new Leaf("due");
		Component c = new Leaf("tre");
		Component d = new Leaf("quattro");
		Component e = new Composite();
		Component f = new Composite();
		Component g = new Composite();
		try {
			g.add(a);
			g.add(b);
			f.add(g);
			f.add(c);
			e.add(d);
			e.add(f);
			e.print();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}