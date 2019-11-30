package it.unical.mat.ingsw.DesignPatterns.behaviorals.observer.first;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();

		// aggiungo 2 observer che saranno notificati
		subject.addObserver(observer1);
		subject.addObserver(observer2);

		// modifico lo stato
		subject.setState(true);

		// rimuovo il primo observer che non sarà + notificato
		subject.removeObserver(observer1);

		// modifico lo stato
		subject.setState(false);

	}

}