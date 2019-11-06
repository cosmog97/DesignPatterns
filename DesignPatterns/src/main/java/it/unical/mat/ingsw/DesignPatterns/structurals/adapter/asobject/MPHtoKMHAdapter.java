package it.unical.mat.ingsw.DesignPatterns.structurals.adapter.asobject;

public class MPHtoKMHAdapter implements CarAdapter {

	private Car car;

	public MPHtoKMHAdapter(Car car) {
		this.car = car;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMH(car.getSpeed());
	}

	private double convertMPHtoKMH(double mph) {
		return mph * 1.60934;
	}
}
