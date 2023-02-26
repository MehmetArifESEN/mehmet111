package lesson013;

import java.util.Scanner;

public class Sinav {
	
	private int maxPuan;
	private int soruSayisi;
	private String konu;
	private String ders;
	static String[] cevapSecenekleri = {"A" , "B" , "C" , "D" };
	private Soru[] sorular;
	private String[] cevaplar;
	private int sure;
	private int cevap;
	private int dogruSayisi;
	private int yanlisSayisi;
	
	private int toplamPuan;
	
	public Sinav() {
		
	}
	
	//Sınav oluştur metodu yazalım
	public void sinavOlustur() {
		//Dersi ve koyunu alalım
		//soru sayısını alalım
		//sınav suresını alalım
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sınavın dersini giriniz");
		setDers(scanner.nextLine());
		System.out.println("Lütfen sınavın konusunu gırınız");
		setKonu(scanner.nextLine());
		System.out.println("Sınavın süresinin giriniz");
		sure= Integer.valueOf(scanner.nextLine());
		System.out.println("Soru sayısını giriniz");
		
		this.soruSayisi=scanner.nextInt();
		sorular = new Soru[soruSayisi];
		for (int i=0;i<sorular.length;i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			sorular[i]= soru;
			
		}
		
		
		
	}
	
	
	public void cevapGir() {
		Scanner scanner = new Scanner(System.in);
		cevaplar= new String[sorular.length];
		for(int i=0; i<sorular.length; i++) {
			System.out.println(sorular[i].getIcerik());
			
			for(int j=0; j<sorular[i].getCevapIcerikleri().length; j++) {
				System.out.println(cevapSecenekleri[j] + "-)" + sorular[i].getCevapIcerikleri()[j]);
			}
			System.out.println("Cevabınızı giriniz: ");
			cevaplar [i] = scanner.nextLine().toUpperCase();
		}
		
	}
	
	public void cevaplariKontrolEt() {
		// dogru sayısı
		// yanlsı sayısı
		//puanı kullanıya gosterelım
		
		for(int i=0 ; i<sorular.length; i++) {
			if(cevaplar[i].equals(sorular[i].getDogruCevap())) {
				dogruSayisi++;
				toplamPuan=toplamPuan+ sorular[i].getPuan();
			}else {
				yanlisSayisi++;
			}
		}
		System.out.println("Doğru sayısı: " + dogruSayisi + " Yanlıs sayisi: " + yanlisSayisi);
		System.out.println("Puanınız: " + toplamPuan);
		
	}
	
	
	
	public int getMaxPuan() {
		return maxPuan;
	}
	public void setMaxPuan(int maxPuan) {
		this.maxPuan = maxPuan;
	}
	public int getSoruSayisi() {
		return soruSayisi;
	}
	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}
	public String getKonu() {
		return konu;
	}
	public void setKonu(String konu) {
		this.konu = konu;
	}
	public String getDers() {
		return ders;
	}
	public void setDers(String ders) {
		this.ders = ders;
	}
	public String[] getCevapSecenekleri() {
		return cevapSecenekleri;
	}
	public void setCevapSecenekleri(String[] cevapSecenekleri) {
		this.cevapSecenekleri = cevapSecenekleri;
	}
	public Soru[] getSorular() {
		return sorular;
	}
	public void setSorular(Soru[] sorular) {
		this.sorular = sorular;
	}
	public String[] getCevaplar() {
		return cevaplar;
	}
	public void setCevaplar(String[] cevaplar) {
		this.cevaplar = cevaplar;
	}

	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public int getCevap() {
		return cevap;
	}

	public void setCevap(int cevap) {
		this.cevap = cevap;
	}


	
	
	

}
