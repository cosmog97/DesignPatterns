package it.unical.mat.ingsw.DesignPatterns.behaviorals.chainofresponsibility.second;

public class Generale extends Ufficiale {

	@Override
	public void check(int stipendio) {
		if (stipendio > 5000)
			System.out.println("Stipendio troppo alto");
		else
			System.out.println("Li guadagna il " + this.getClass().getSimpleName());
	}
}