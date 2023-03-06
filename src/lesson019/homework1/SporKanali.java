package lesson019.homework1;

public class SporKanali extends Kanal{

	private String kanalTuru;

	public SporKanali(String kanalAdi, int kanalNo, String kanalTuru) {
		super(kanalAdi, kanalNo);
		this.kanalTuru=kanalTuru;
	}

	public SporKanali() {
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
		return "SporKanali [kanalTuru= " + kanalTuru + ", getKanalAdi()= " + getKanalAdi() + ", getKanalNo()= "
				+ getKanalNo() + "]";
	}
	
	
	

}
