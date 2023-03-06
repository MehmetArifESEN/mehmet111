package lesson016.InterfaceUygulama;

import java.util.ArrayList;

public class Kutuphane  implements IKutuphaneManager{
	
	private String kutuphaneAdi;
	private ArrayList <Kitap> kitaplar;
	
	private ArrayList <Kitap> indirimdekiKitaplar;
	
	
	
	
	public Kutuphane(String kutuphaneAdi) {
		super();
		this.kutuphaneAdi = kutuphaneAdi;
		this.kitaplar = new ArrayList<>();
		this.indirimdekiKitaplar=new ArrayList<>();
	}
	
	public String getKutuphaneAdi() {
		return kutuphaneAdi;
	}
	
	public void setKutuphaneAdi(String kutuphaneAdi) {
		this.kutuphaneAdi = kutuphaneAdi;
	}
	
	public ArrayList<Kitap> getKitaplar() {
		return kitaplar;
	}
	
	public ArrayList<Kitap> getİndirimdekiKitaplar() {
		return indirimdekiKitaplar;
	}
	
	

	@Override
	public void kitapEkle() {
		String isim =Util.stringDegerAl("Lütfen Kitap isminin giriniz") ;
		String yazar=Util.stringDegerAl("Lütfen kitabın yazarını giriniz");
		int fiyat = Util.intDegerAl("Lütfen kitabın fiyatını giirn");
		
		Kitap kitap = new Kitap(isim ,yazar ,fiyat);
		kitaplar.add(kitap);
		System.out.println(isim + " adlı kitap kutuphaneye eklendi");
		
		
		
	}

	@Override
	public void kitaplariListele() {
		for (Kitap kitap : kitaplar) {
			System.out.println(kitap.getName() + " kitabının fiyatı: " + kitap.getPrice());
		}
		
	}

	@Override
	public void yazarİsmineGoreSorgula() {
		String yazar= Util.stringDegerAl("Yazarın adını giriniz");
		
		System.out.println(yazar + " adlı yazarın kitapları listeleniyor...");
		
		for (Kitap kitap : kitaplar) {
			if(yazar.equals(kitap.getYazar())) {
			System.out.println(kitap.getName() + " kitabının fiyatı: " + kitap.getPrice());
			}
			
		}
		
	}

	@Override
	public void kitapSil() {
		String kitapAdi= Util.stringDegerAl("Silmek istediginiz Kitabın adını giriniz");
		int sayac=0;
		
		for (Kitap kitap : kitaplar) {
			
			if(kitapAdi.equals(kitap.getName())) {
				kitaplar.remove(kitap);
				System.out.println("Kitap başarıyla silindi...");
				sayac++;
			} 
			
		} if(sayac==0) {
			System.out.println("Girdiğiniz isimde bir kitap kütüphanede zaten bulunmuyor.");
			
		}
		
	}

	@Override
	public void indirimYap() {
		String kitapAdi= Util.stringDegerAl("Kitabın adını giriniz");
		
		int indirim= Util.intDegerAl("Yapmak istediğiniz indirim miktarını giriniz");
		boolean kosul=false;
	
		
		for (Kitap kitap : kitaplar) {
			if(kitapAdi.equals(kitap.getName())) {
			kitap.setPrice(kitap.getPrice()-indirim);
			System.out.println(kitap.getName() + " Kitabının güncel fiyatı--->" + kitap.getPrice());
			kosul=true;
			getİndirimdekiKitaplar().add(kitap);
			}
			
		} if(kosul==false)
			System.out.println("Girdiğiniz isimde bir kitap kütüphanede zaten bulunmuyor.");
		
	}
	
	
	private Kitap kontrolEt(String name) {
		for (int i = 0; i < kitaplar.size(); i++) {
			if(kitaplar.get(i).getName().equalsIgnoreCase(name)) {
				return kitaplar.get(i);
			}
			
		} 
		System.out.println("Kitap bulunamamıştır.");
		return null;
		
	}

	@Override
	public void kitabiGuncelle() {
		System.out.println("Güncellemek istediğiniz kitabı giriniz.");
		String kitapAdi= Util.stringDegerAl("Kitabın adını giriniz");
		Kitap kitap=kontrolEt(kitapAdi);
		if (kitap != null) {
		
			String newİsim=Util.stringDegerAl("Değiştireceginiz Kitabın yeni adını giriniz");
			kitap.setName(newİsim);
		} else {
			System.out.println("Lütfen geçerli bir kitap adı giriniz");
		}
		
	}

	@Override
	public void indirimdekiKitaplariGoster() {
		System.out.println("İndirimdeki Kitaplar");
		for (Kitap kitap : indirimdekiKitaplar) {
			System.out.println(kitap.getName() + " kitabının fiyatı: " + kitap.getPrice());
			
		}
		
	}
	
	
	
	

}
