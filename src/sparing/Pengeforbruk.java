package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	
	private Date dato;
	private double bel�p;
	private Kategori kategori;
	private ArrayList DAO<Utgift> u;
	
	public Pengeforbruk(Date dato, double bel�p, Kategori kategori) {
		this.dato = dato;
		this.bel�p = bel�p;
		this.kategori = kategori;
	}
	public void registrerUtgift(Date dato, double bel�p, Kategori kategori) {
		Utgift u = new Utgift(dato, bel�p, kategori);
		
		
	}
	

}
