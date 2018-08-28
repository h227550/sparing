package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	private String dato;
	private double beløp;
	private Kategori kategori;
	private Utgift u = new Utgift();
	private DAO dao;
	public Pengeforbruk(String dato, double beløp, Kategori kategori) {
		this.dato = dato;
		this.beløp = beløp;
		this.kategori = kategori;
	}
	public void registrerUtgift(String dato, double beløp, Kategori kategori) {
		 u.setDato(dato);
		 u.setBeløp(beløp);
		 u.setKategori(kategori);
		 
		 dao.lagreNyUtgift(u);
	}
	

}
