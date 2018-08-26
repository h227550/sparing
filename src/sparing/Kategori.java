package sparing;

public class Kategori {
	private String navn;

	public Kategori(String navn) {
		super();
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	@Override
	public String toString() {
		return "Kategori [navn=" + navn + "]";
	}
	
	

}
