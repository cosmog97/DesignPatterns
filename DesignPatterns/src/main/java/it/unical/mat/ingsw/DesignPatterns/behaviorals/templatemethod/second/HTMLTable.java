package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.util.List;

public class HTMLTable extends Table {

	@Override
	public StringBuilder doBody(List<DVD> dvdList) {
		StringBuilder html = new StringBuilder();
		html.append("<TABLE border=1>" + "\n");
		html.append(" <TR>" + "\n");
		html.append("  <TD>TITOLO</TD>" + "\n");
		html.append("  <TD>REGIA</TD>" + "\n");
		html.append("  <TD>GENERE</TD>" + "\n");
		html.append(" </TR>" + "\n");

		for (DVD dvd : dvdList) {
			html.append(" <TR>" + "\n");
			html.append("  <TD>" + dvd.getTitolo() + "</TD>" + "\n");
			html.append("  <TD>" + dvd.getRegia() + "</TD>" + "\n");
			html.append("  <TD>" + dvd.getGenere() + "</TD>" + "\n");
			html.append(" </TR>" + "\n");
		}
		html.append("</TABLE>" + "\n");
		return html;
	}

	@Override
	protected void doHook() {
		this.tableContent.append("<A HREF=\"javascript:alert('Films di prima visione')\">Info</A>");
		this.filePath = "/testPattern/tabella.html";
	}
}