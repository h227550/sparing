package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	
	private Date dato;
	private double beløp;
	private Kategori kategori;
	private ArrayList DAO<Utgift> u;
	
	public Pengeforbruk(Date dato, double beløp, Kategori kategori) {
		this.dato = dato;
		this.beløp = beløp;
		this.kategori = kategori;
	}
	public void registrerUtgift(Date dato, double beløp, Kategori kategori) {
		Utgift u = new Utgift(dato, beløp, kategori);
		
		
	}
	

}
