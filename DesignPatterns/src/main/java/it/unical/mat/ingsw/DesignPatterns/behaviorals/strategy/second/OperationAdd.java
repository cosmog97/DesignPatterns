package it.unical.mat.ingsw.DesignPatterns.behaviorals.strategy.second;

public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}