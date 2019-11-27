package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.util.List;

public class XMLTable extends Table {

	@Override
	public StringBuilder doBody(List<DVD> dvdList) {
		StringBuilder xml = new StringBuilder();
		xml.append("<DVD_LIST>" + "\n");
		for (DVD dvd : dvdList) {
			xml.append(" <DVD>" + "\n");
			xml.append("  <TITOLO>" + dvd.getTitolo() + "</TITOLO>" + "\n");
			xml.append("  <REGIA>" + dvd.getRegia() + "</REGIA>" + "\n");
			xml.append("  <GENERE>" + dvd.getGenere() + "</GENERE>" + "\n");
			xml.append(" </DVD>" + "\n");
		}
		xml.append("</DVD_LIST>" + "\n");
		return xml;
	}

	@Override
	protected void doHook() {
		this.filePath += ".xml";
	}
}