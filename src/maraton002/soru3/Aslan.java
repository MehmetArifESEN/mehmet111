package maraton002.soru3;

public class Aslan extends MemeliHayvan {
	private String sinifi;
	
	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		this.sinifi = "Aslan";
		setTehlikeliMi(true);
		
	}

	@Override
	public void yuru() {
		System.out.println(getAd()+" isimli "+sinifi+ " yürüyor..");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+ " kükrüyor...");
		
	}

	
	public String getSinifi() {
		return sinifi;
	}
	

	

}
