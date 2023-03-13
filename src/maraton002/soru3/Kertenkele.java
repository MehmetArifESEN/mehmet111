package maraton002.soru3;

public class Kertenkele extends Surungen {
	private String sinifi;

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifi = "Kertenkele";
	}

	@Override
	public void surun() {
		System.out.println(getAd()+" isimli "+sinifi+ " yerde ilerliyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " ses çıkartıyor...");
		
	}
	public String getSinifi() {
		return sinifi;
	}

}