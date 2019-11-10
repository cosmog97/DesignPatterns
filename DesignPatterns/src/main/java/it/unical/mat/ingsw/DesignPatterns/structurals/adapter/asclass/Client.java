package it.unical.mat.ingsw.DesignPatterns.structurals.adapter.asclass;

public class Client {

	public static void main(String[] args) {
		double speedMPH1, speedKMH1, speedMPH2, speedKMH2;
		Car bugattiVeyron = new BugattiVeyron();
		Car fiatPanda = new FiatPanda();
		CarAdapter carAdapter1 = new MPHtoKMHAdapter();
		CarAdapter carAdapter2 = new MPHtoKMHAdapter();
		speedMPH1 = bugattiVeyron.getSpeed();
		speedMPH2 = fiatPanda.getSpeed();
		speedKMH1 = carAdapter1.getSpeed(bugattiVeyron);
		speedKMH2 = carAdapter2.getSpeed(fiatPanda);
	}
}