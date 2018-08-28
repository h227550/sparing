package sparing;

import java.util.Date;

public class Utgift {
	private double bel�p;
	private String dato;
	private Kategori kategori;
	
	public Utgift() {
		
	}
	
	public Utgift(String d, double b,Kategori k) {
		b = bel�p;
		d = dato;
		k = kategori;
	}

	public double getBel�p() {
		return bel�p;
	}

	public void setBel�p(double bel�p) {
		this.bel�p = bel�p;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	@Override
	public String toString() {
		return "Utgift [bel�p=" + bel�p + ", dato=" + dato + ", kategori=" + kategori + "]";
	}
	
}
