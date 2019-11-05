package it.unical.mat.ingsw.DesignPatterns.creationals.prototype;

public class Spartito {

	public static void main(String[] args) throws CloneNotSupportedException {
		NotaMusicale croma1 = GestoreNoteMusicali.getNota("croma");
		NotaMusicale semicroma1 = GestoreNoteMusicali.getNota("semicroma");
		NotaMusicale semicroma2 = GestoreNoteMusicali.getNota("semicroma");
		NotaMusicale croma2 = GestoreNoteMusicali.getNota("croma");
		System.out.println(croma1.hashCode() + " : " + croma2.hashCode());
		NotaMusicale croma3 = croma2.clone();
		System.out.println(croma3.hashCode() + " : " + croma2.hashCode());
	}

}
