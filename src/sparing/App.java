package sparing;

import java.util.Date;

public class App {
	private Pengeforbruk pengeforbruk;
	private DAO<Utgift> u;
	
	public App() {
	}
	
	public void registrerPengeforbruk(Date dato, double beløp, Kategori kategori) {
		pengeforbruk.registrerUtgift(dato, beløp, kategori);
		
	}
	

}
