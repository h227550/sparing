package sparing;

import java.util.Date;

public class App {
	private static Pengeforbruk pengeforbruk;
	
	public App() {
	}
	
	public void registrerPengeforbruk(String dato, double beløp, String kate) {
		
		Kategori k = new Kategori(kate);
		pengeforbruk.registrerUtgift(dato, beløp, k);
		
	}
	
	public void visDagensUtgifter() {

		pengeforbruk.finnDagensUtgifter();
	}
	
	public static void main(String[] args) {
		App a = new App();
		pengeforbruk = new Pengeforbruk();
		//Date dato = new Date();
		
		a.registrerPengeforbruk("28.08.2018", 100, "mat");
		a.registrerPengeforbruk("28.08.2018", 123, "vann");
		a.registrerPengeforbruk("27.08.2018", 99, "netflix");
		a.visDagensUtgifter();
	}
	

}
