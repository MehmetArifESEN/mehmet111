package maraton002.soru4;

import java.util.HashMap;
import java.util.Map;

public class EkonomiYolcu extends Yolcu {
	private Map<String, Integer> biletlerE;
	private final int EKONOMIFIYAT = 100;

	public EkonomiYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		this.biletlerE = new HashMap<>();
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu "+getAd()+" Biletleri "+biletlerE );

	}

	@Override
	public void biletAl(EFirmalar eFirmaAdi) {
		String metin = "";
		int biletFiyatı = EKONOMIFIYAT + getBASEFIYAT();
		
		if (biletlerE.containsKey(eFirmaAdi.toString())) {
			biletlerE.put(eFirmaAdi.toString(), biletlerE.get(eFirmaAdi.toString())+biletFiyatı);
			metin = eFirmaAdi.toString() + " Adlı firmadan bir bilet daha alınmıştır biletleriniz-->" + biletlerE;
		} else {
			biletlerE.put(eFirmaAdi.toString(), biletFiyatı);
			metin = getAd() + " Adlı  yolcu " + eFirmaAdi.toString()
					+ " için Ekonomi sınıfından bilet alınmıştır Biletleriniz -->" + biletlerE;
		}
		
		System.out.println(metin);
	}

	@Override
	public void checkInYap() {
		if (isCheckIn()) {
			System.out.println(getAd() + " için chekin zaten yapılmıştır uçağa binebilirsiniz");
		} else {
			System.out.println("Checkin yapılmıştır iyi uçuşlar");
			setCheckIn(true);
		}
	}

	@Override
	public void ucagaBin() {
		if (!isCheckIn()) {
			System.out.println("Uçağa binmek için önce checkin yapınız");
		} else
			System.out.println(getAd() + " "+ getKoltukNo() + " numaralı koltukda uçağa binebilirsiniz");

	}

	public Map<String, Integer> getBiletler() {
		return biletlerE;
	}

	
}
