package maraton002.soru3;

public abstract class Surungen extends Hayvan {
	
	private String cinsi= "Sürüngen";

	public Surungen(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);

	}

	public abstract void surun();
	
	public String getCinsi() {
		return cinsi;
	}

	
}