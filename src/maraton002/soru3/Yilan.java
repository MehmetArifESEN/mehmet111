package maraton002.soru3;

public class Yilan extends Surungen {
	private String sinifi;
	
	public Yilan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifi = "Yılan";
		setTehlikeliMi(true);
	}

	@Override
	public void surun() {
		System.out.println(getAd()+" isimli "+sinifi+ " sürünerek ilerliyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " tısssslıyor...");
		
	}
	public String getSinifi() {
		return sinifi;
	}
	
}
