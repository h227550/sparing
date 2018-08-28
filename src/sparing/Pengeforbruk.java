package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	private String dato;
	private double beløp;
	private Kategori kategori;
	private Utgift u = new Utgift();
	private DAO<Utgift> dao = new DAO<Utgift>();
	
	public Pengeforbruk() {

	}
	public void registrerUtgift(String dato, double beløp, Kategori kategori) {
		 this.dato = dato;
		 this.beløp = beløp;
		 this.kategori = kategori;
		 u.setDato(this.dato);
		 u.setBeløp(this.beløp);
		 u.setKategori(this.kategori);
		 
		 dao.lagreNyUtgift(u);
	}
	

}
