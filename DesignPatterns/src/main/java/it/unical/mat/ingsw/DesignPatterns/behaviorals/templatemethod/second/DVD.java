package it.unical.mat.ingsw.DesignPatterns.behaviorals.templatemethod.second;

import java.io.Serializable;

public class DVD implements Serializable {

	private String titolo;
	private String regia;
	private String genere;

	public DVD(String titolo, String regia, String genere) {
		this.titolo = titolo;
		this.regia = regia;
		this.genere = genere;
	}

	public DVD() {
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegia() {
		return regia;
	}

	public void setRegia(String regia) {
		this.regia = regia;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
}