package maraton002.soru3;

public abstract class MemeliHayvan extends Hayvan {
	
	private String cinsi= "Memeli Hayvan";
	
	public MemeliHayvan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	
	
	public abstract void yuru(); 
	
	public String getCinsi() {
		return cinsi;
	}
	
	
}
