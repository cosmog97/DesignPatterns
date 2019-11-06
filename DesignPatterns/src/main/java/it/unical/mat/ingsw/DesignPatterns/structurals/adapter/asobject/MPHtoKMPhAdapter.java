package it.unical.mat.ingsw.DesignPatterns.structurals.adapter.asobject;

public class MPHtoKMPhAdapter implements CarAdapter {

	private Car car;

	public MPHtoKMPhAdapter(Car car) {
		this.car = car;
	}

	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(car.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}
