package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.util.List;

public class CSVTable extends Table {

	@Override
	protected StringBuilder doBody(List<DVD> dvdList) {
		StringBuilder csv = new StringBuilder();
		csv.append("TITOLO;REGIA;GENERE" + "\n");
		for (DVD dvd : dvdList) {
			csv.append(dvd.getTitolo() + ";");
			csv.append(dvd.getRegia() + ";");
			csv.append(dvd.getGenere());
			csv.append("\n");
		}
		return csv;
	}

	@Override
	protected void doHook() {
		this.filePath += ".csv";
	}
}