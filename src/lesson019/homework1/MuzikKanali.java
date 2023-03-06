package lesson019.homework1;

public class MuzikKanali extends Kanal{
	private String kanalTuru;

	public MuzikKanali(String kanalAdi, int kanalNo,String kanalTuru) {
		super(kanalAdi, kanalNo);
		this.kanalTuru=kanalTuru;
	}

	public MuzikKanali() {
		super();
		
	}

	public String getKanalTuru() {
		return kanalTuru;
	}

	public void setKanalTuru(String kanalTuru) {
		this.kanalTuru = kanalTuru;
	}

	@Override
	public String toString() {
		return "MuzikKanali [kanalTuru=" + kanalTuru + ", getKanalAdi()=" + getKanalAdi() + ", getKanalNo()="
				+ getKanalNo() + "]";
	}
	
	
	
	
	

}
