package maraton002.soru3;

public class Maymun extends MemeliHayvan {
	private String sinifi;

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifi = "Maymun";
	}

	@Override
	public void yuru() {
		System.out.println(getAd()+" isimli "+sinifi+ " yürüyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " maymun sesi çıkarıyor...");
		
	}
	public String getSinifi() {
		return sinifi;
	}
	
}