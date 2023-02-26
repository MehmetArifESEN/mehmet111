package lesson012;

public class Pizza {
	
	private boolean isVegie;
	private int price;
	private static final int NORMAL_FIYAT = 200;
	private static final int VEGI_FIYAT=300;
	private static final int SOS_FIYAT=50;
	private static final int PEYNIR_FIYAT=100;
	private static final int KURYE_FIYAT=20;
	
	
	public Pizza(boolean isVegie) {
		this.isVegie =isVegie;
		if(this.isVegie) {
			this.setPrice(VEGI_FIYAT);
		} else {
			this.setPrice(NORMAL_FIYAT);
		}
	}
	
	public boolean isVegie() {
		return isVegie;
	}
	public void setVegie(boolean isVegie) {
		this.isVegie = isVegie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void sosEkle() {
		System.out.println("SosEklendi " +  SOS_FIYAT);
		setPrice(getPrice() + SOS_FIYAT);
	}
	public void peynirEkle() {
		System.out.println("SosEklendi " +  PEYNIR_FIYAT);
		setPrice(getPrice() + PEYNIR_FIYAT);
	}
	
	public void eveSiparisVer() {
		setPrice(getPrice() + KURYE_FIYAT);
	}
	
	public void fisAl() {
		System.out.println("Toplam Ücreti:" + getPrice());
	}
	
	public void sosCikart() {
		System.out.println("Sos Çıkartıldı " +  SOS_FIYAT);
		setPrice(getPrice() - SOS_FIYAT);
	}
	
	public void peynirCikart() {
		System.out.println("peynir Çıkartıldı " +  PEYNIR_FIYAT);
		setPrice(getPrice() - PEYNIR_FIYAT);
	}

}
