package lesson019.homework1;

public class FilmKanali extends Kanal {
	private String kanalTuru;

	public FilmKanali(String kanalAdi, int kanalNo,String kanalTuru) {
		super(kanalAdi, kanalNo);
		this.kanalTuru=kanalTuru;
	}

	public FilmKanali() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getKanalTuru() {
		return kanalTuru;
	}

	public void setKanalTuru(String kanalTuru) {
		this.kanalTuru = kanalTuru;
	}

	@Override
	public String toString() {
		return "FilmKanali [kanalTuru= " + kanalTuru + ", getKanalAdi()= " + getKanalAdi() + ", getKanalNo()= "
				+ getKanalNo() + "]";
	}
	
	
	

	
	
}
