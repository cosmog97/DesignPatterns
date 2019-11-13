package it.unical.mat.ingsw.DesignPatterns.structurals.composite.first;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component {
	private Vector foglie;

	public Composite() {
		foglie = new Vector();
	}

	@Override
	public void add(Component c) {
		foglie.add(c);
	}

	@Override
	public void remove(Component c) {
		foglie.remove(c);
	}

	@Override
	public void print() {
		Enumeration enumeration = foglie.elements();
		Component c;
		for (; enumeration.hasMoreElements();) {
			c = (Component) enumeration.nextElement();
			c.print();
		}
	}
}