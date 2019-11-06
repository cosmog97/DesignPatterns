package it.unical.mat.ingsw.DesignPatterns.structurals.adapter.asobject;

public class Client {

	public static void main(String[] args) {
		double speedMPH1, speedKMH1, speedMPH2, speedKMH2;
		Car bugattiVeyron = new BugattiVeyron();
		Car fiatPanda = new FiatPanda();
		CarAdapter carAdapter1 = new MPHtoKMPhAdapter(bugattiVeyron);
		CarAdapter carAdapter2 = new MPHtoKMPhAdapter(fiatPanda);
		speedMPH1 = bugattiVeyron.getSpeed();
		speedMPH2 = fiatPanda.getSpeed();
		speedKMH1 = carAdapter1.getSpeed();
		speedKMH2 = carAdapter2.getSpeed();
	}

}
