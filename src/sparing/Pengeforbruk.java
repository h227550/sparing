package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	private String dato;
	private double bel�p;
	private Kategori kategori;
	private Utgift u = new Utgift();
	private DAO dao;
	public Pengeforbruk(String dato, double bel�p, Kategori kategori) {
		this.dato = dato;
		this.bel�p = bel�p;
		this.kategori = kategori;
	}
	public void registrerUtgift(String dato, double bel�p, Kategori kategori) {
		 u.setDato(dato);
		 u.setBel�p(bel�p);
		 u.setKategori(kategori);
		 
		 dao.lagreNyUtgift(u);
	}
	

}
