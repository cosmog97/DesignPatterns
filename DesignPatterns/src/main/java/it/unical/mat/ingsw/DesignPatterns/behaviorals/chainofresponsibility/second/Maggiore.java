package it.unical.mat.ingsw.DesignPatterns.behaviorals.chainofresponsibility.second;

public class Maggiore extends Ufficiale {

	@Override
	public void check(int stipendio) {
		if (stipendio > 2000)
			ufficiale.check(stipendio);
		else
			System.out.println("Li guadagna il " + this.getClass().getSimpleName());
	}

}