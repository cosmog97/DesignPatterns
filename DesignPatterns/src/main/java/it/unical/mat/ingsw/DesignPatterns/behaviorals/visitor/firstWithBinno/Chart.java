package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.firstWithBinno;

import java.util.ArrayList;
import java.util.List;

public class Chart {
	private List<AbstractProduct> chartProducts = new ArrayList<>();

	public void addProduct(AbstractProduct p) {
		chartProducts.add(p);
	}

	public double checkout() {
		double sum = 0;
		ProductVisitor taxVisitor = new TaxProductVisitor();
		for (AbstractProduct p : chartProducts) {
			p.accept(taxVisitor);
			sum += p.getPrice();
		}
		return sum;
	}
}
