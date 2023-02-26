package lesson013;

import java.util.Scanner;

public class Soru {
	
	private int puan;
	private String icerik;
	private String dogruCevap;
	private String[] cevapIcerikleri;
	
	
	public Soru () {
		
	}
	
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	public String getDogruCevap() {
		return dogruCevap;
	}
	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}
	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}
	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}
	
	public void soruOlustur(String[] cevapSecenekleri) {
		//İçerik alacagız(soruyu alıyoruz)
		//Şıkların degerlerini isticez
		//Puanı 
		//dogreu cevabı
		Scanner scanner = new Scanner(System.in);
		System.out.println("Soruyu yazınız");
		this.icerik = scanner.nextLine();
		
		//
		cevapIcerikleri = new String[cevapSecenekleri.length];
		for (int i=0; i<cevapSecenekleri.length; i++) {
			System.out.println("Lütfen " + cevapSecenekleri[i] + " cevabını giriniz");
			this.cevapIcerikleri[i]=scanner.nextLine();
			
		}
		
		System.out.println("Lütfen doğru cevabı belırtın");
		dogruCevap = scanner.nextLine().toUpperCase();
		System.out.println("Sorunun puanını belirtin");
		this.puan=Integer.valueOf(scanner.nextLine());
				
		
		
		
		
	}
	
	

}
