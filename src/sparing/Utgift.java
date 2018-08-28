package sparing;

import java.util.Date;

public class Utgift {
	private double beløp;
	private String dato;
	private Kategori kategori;
	
	public Utgift() {
		
	}
	
	public Utgift(String d, double b,Kategori k) {
		b = beløp;
		d = dato;
		k = kategori;
	}

	public double getBeløp() {
		return beløp;
	}

	public void setBeløp(double beløp) {
		this.beløp = beløp;
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
		return "Utgift [beløp=" + beløp + ", dato=" + dato + ", kategori=" + kategori + "]";
	}
	
}
