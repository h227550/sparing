package sparing;

import java.util.ArrayList;
import java.util.Date;

public class Pengeforbruk {
	private String dato;
	private double bel�p;
	private Kategori kategori;
	private Utgift u = new Utgift();
	private DAO<Utgift> dao = new DAO<Utgift>();
	
	public Pengeforbruk() {

	}
	public void registrerUtgift(String dato, double bel�p, Kategori kategori) {
		 System.out.println("test2");
		 this.dato = dato;
		 this.bel�p = bel�p;
		 this.kategori = kategori;
		 u.setDato(this.dato);
		 u.setBel�p(this.bel�p);
		 u.setKategori(this.kategori);
		 
		 dao.lagreNyUtgift(u);
		 System.out.println("test3");
		 String test = dao.getUtgifter().get(0).toString();
		 System.out.println(test);
	}
	

}
