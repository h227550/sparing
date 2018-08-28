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
		 System.out.println("test2");
		 this.dato = dato;
		 this.beløp = beløp;
		 this.kategori = kategori;
		 u.setDato(this.dato);
		 u.setBeløp(this.beløp);
		 u.setKategori(this.kategori);
		 
		 dao.lagreNyUtgift(u);
		 System.out.println("test3");
		 String test = dao.getUtgifter().get(0).toString();
		 System.out.println(test);
	}
	

}
