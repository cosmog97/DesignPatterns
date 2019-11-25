package it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.second;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import it.unical.mat.ingsw.DesignPatterns.behaviorals.interpreter.first.Addizione;

public class Contesto {

	private Stack numeri = null;
	private Stack operatori = null;

	public Contesto(String operazione) {
		this.numeri = new Stack();
		this.operatori = new Stack();

		for (String token : revOperazione(operazione)) {
			if (token.equals("+")) {
				operatori.add(new Addizione());
			} else if (token.equals("-")) {
				operatori.add(new Sottrazione());
			} else if (token.equals("/")) {
				operatori.add(new Divisione());
			} else if (token.equals("*")) {
				operatori.add(new Moltiplicazione());
			} else {
				numeri.add(new Numero(token));
			}
		}
	}

	public Espressione getNumero() {
		return (Espressione) numeri.pop();
	}

	public void setNumero(Espressione exp) {
		numeri.push(exp);
	}

	public Espressione getOperatore() {
		return (Espressione) operatori.pop();
	}

	private String[] revOperazione(String operazione) {
		List listOperation = Arrays.asList(operazione.split(" "));
		Collections.reverse(listOperation);
		return (String[]) listOperation.toArray();
	}
}