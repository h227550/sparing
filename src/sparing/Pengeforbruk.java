package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	private String dato;
	private double bel�p;
	private Kategori kategori;
	private Utgift u;
	private DAO<Utgift> dao = new DAO<Utgift>();
	
	public Pengeforbruk() {

	}
	public void registrerUtgift(String dato, double bel�p, Kategori kategori) {
         u = new Utgift();
		 this.dato = dato;
		 this.bel�p = bel�p;
		 this.kategori = kategori;
		 u.setDato(this.dato);
		 u.setBel�p(this.bel�p);
		 u.setKategori(this.kategori);
		 
		 dao.lagreNyUtgift(u);

	}
	public void finnDagensUtgifter() {
		dao.finnUtgifter("28.08.2018");
	}

}
