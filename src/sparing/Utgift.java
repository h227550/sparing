package sparing;

import java.util.Date;

public class Utgift {
	private double beløp;
	private Date dato;
	private Kategori kategori;
	
	public Utgift( Date d, double b,Kategori k) {
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

	public Date getDato() {
		return dato;
	}

	public void setDato(Date dato) {
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
