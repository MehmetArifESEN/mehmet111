package lesson019.homework1;

import java.util.ArrayList;
import java.util.List;

public class Televizyon {
	
	private String marka;
	private String boyut;
	private List <Kanal> kanallar;
	
	
	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		this.kanallar = new ArrayList<>();
		this.kanallar.add(new HaberKanali("TRT Haber" , 1 , "Ana Haber bülteni yayınlanıyor "));
		this.kanallar.add(new MuzikKanali("Kral Fm" , 2 , "Muzik çalıyor"));
		this.kanallar.add(new SporKanali("NTV Spor" , 3 , "Günün maçları ve özetler yayınlanıyor"));
		this.kanallar.add(new FilmKanali("DMax" , 4 , "Dizi ve filmler yayınlanıyor"));
		kanallariOlustur();
	}
	


	public Televizyon() {
		super();
		kanallar = new ArrayList<>();
		kanallar.add(new HaberKanali("TRT Haber" , 1 , "Ana Haber bülteni yayınlanıyor "));
		kanallar.add(new MuzikKanali("Kral Fm" , 2 , "Muzik çalıyor"));
		kanallar.add(new SporKanali("NTV Spor" , 3 , "Günün maçları ve özetler yayınlanıyor"));
		kanallar.add(new FilmKanali("DMax" , 4 , "Dizi ve filmler yayınlanıyor"));
		kanallariOlustur();
	}



	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getBoyut() {
		return boyut;
	}


	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}


	public List<Kanal> getKanallar() {
		return kanallar;
	}


	public void setKanallar(List<Kanal> kanallar) {
		this.kanallar = kanallar;
	}


	@Override
	public String toString() {
		return "Televizyon [marka=" + marka + ", boyut=" + boyut + ", kanallar=" + kanallar + "]";
	}
	
	
	public void kanallariOlustur() {
		
		this.kanallar.add(new Kanal("Tv8", 5));
		this.kanallar.add(new Kanal("TRT" , 6));
		this.kanallar.add(new Kanal("Show" , 7));
		this.kanallar.add(new Kanal("TLC" , 8));
		
		
	}
	
	
	

}
