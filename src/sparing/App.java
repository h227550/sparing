package sparing;

import java.util.Date;

public class App {
	private Pengeforbruk pengeforbruk;
	
	public App() {
	}
	
	public void registrerPengeforbruk(String dato, double bel�p, String kate) {
		
		Kategori k = new Kategori(kate);
		System.out.println("test");
		pengeforbruk.registrerUtgift(dato, bel�p, k);
		
	}
	
	public static void main(String[] args) {
		App a = new App();
		//Date dato = new Date();
		
		a.registrerPengeforbruk("28.08.2018", 100, "mat");
	}
	

}
