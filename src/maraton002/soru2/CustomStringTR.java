package maraton002.soru2;

public class CustomStringTR {
	
	private String metin;

	public CustomStringTR(String metin) {
		super();
		this.metin = metin;
	}
	
	
	
	
	public String getMetin() {
		return metin;
	}




	public void setMetin(String metin) {
		this.metin = metin;
	}




	public int uzunluk() {
		int uzunluk = metin.length();
		return uzunluk;
	}
	
	public String kucukHarfYap() {
		String kucuk = metin.toLowerCase();
		return kucuk;
	}
	public String buyukHarfYap() {
		String buyuk = metin.toUpperCase();
		return buyuk;
	}
	
	public char ilkKarakteriGoster() {
		char c = metin.charAt(0);
		return c;
	}
	
	public String metni3DefaYazdir() {
		return metin+metin+metin;
	}
	
	public String metniTrimle () {
		String trimliMetin=metin.trim();
		return trimliMetin;
	}
	
	public boolean ileMiBitiyor(String s) {
		boolean bitiyor = metin.endsWith(s);
		return bitiyor;
	}
	public boolean ileMiBasliyor(String s) {
		boolean basliyor = metin.startsWith(s);
		return basliyor;
	}
	
	public String ilkUcVeSonUcKarakteriYazdir() {
		String metin2 = metin.substring(0, 3) + metin.substring(metin.length()-3, metin.length());
		return metin2;
	}
	
	public boolean iceriyorMu(String s) {
		boolean iceriyor = metin.contains(s);
		return iceriyor;
	}

}
