package it.unical.mat.ingsw.DesignPatterns.structurals.adapter.asclass;

public class MPHtoKMHAdapter implements CarAdapter {

	@Override
	public double getSpeed(Car c) {
		// TODO Auto-generated method stub
		return convertMPHtoKMH(c.getSpeed());
	}

	private double convertMPHtoKMH(double mph) {
		return mph * 1.60934;
	}

}
