package it.unical.mat.ingsw.DesignPatterns.behaviorals.strategy.second;

public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}