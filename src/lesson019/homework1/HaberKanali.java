package lesson019.homework1;

public class HaberKanali extends Kanal{
	private String kanalTuru;

	public HaberKanali(String kanalAdi, int kanalNo,String kanalTuru) {
		super(kanalAdi, kanalNo);
		this.kanalTuru=kanalTuru;
	}

	public HaberKanali() {
		super();
		
	}

	@Override
	public String toString() {
		return "HaberKanali [kanalTuru= " + kanalTuru + ", getKanalAdi()= " + getKanalAdi() + ", getKanalNo()= "
				+ getKanalNo() + "]";
	}

	public String getKanalTuru() {
		return kanalTuru;
	}

	public void setKanalTuru(String kanalTuru) {
		this.kanalTuru = kanalTuru;
	}
	
	

	
	
	
	

}
