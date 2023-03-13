package maraton002.soru4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Yolcu {
	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	private final int BASEFIYAT = 100;
	static List<Integer> biletNumaraları = new ArrayList<>();
	
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo=koltukOlustur();
	}
	

	private static int koltukOlustur() {
		Random random =  new Random() ;
		int koltukSayisi = random.nextInt(10,100);
		return koltukSayisi;
	}


	public abstract void yolcuBilgileriniGetir();

	public abstract void biletAl(EFirmalar efirmalar);

	public abstract void checkInYap();

	public abstract void ucagaBin();





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getKoltukNo() {
		return koltukNo;
	}


	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}


	public boolean isCheckIn() {
		return checkIn;
	}


	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}


	public static List<Integer> getBiletNumaraları() {
		return biletNumaraları;
	}


	public static void setBiletNumaraları(List<Integer> biletNumaraları) {
		Yolcu.biletNumaraları = biletNumaraları;
	}


	public int getBASEFIYAT() {
		return BASEFIYAT;
	} 
	
	

	
	
	
	

}
