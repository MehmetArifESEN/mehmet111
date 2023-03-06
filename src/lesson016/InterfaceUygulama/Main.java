package lesson016.InterfaceUygulama;

public class Main {
	
	static Kutuphane kutuphane = new Kutuphane("Milli Kütüphane");

	public static void main(String[] args) {
		// Kitap sınıfımız olsun
		//isim, yazar, fiyat
		
		//Kutupgane 
		//isim, kitaplar
		
		//IKutuphaneManager diye bir interface oluşturalım
		//İnterface kitapEkle methodu yazalım
		
		//Util sınıfı olusturalım
		//int degerAl
		//StringDegerAl()
//		int sayi=Util.intDegerAl("stok");
//		String isim = Util.stringDegerAl();
//		
//		System.out.println(sayi + " " + isim);
		
		//Kullanıcıdan aldıgımız isim yazar ve fiyatla bir kitap nesnesi oluşturalım
		
		//kitaplari lsitele kitapları ısım ve fıyatlarını goreloım
		
		//Yazar ismine göre arama yapalım
		//Ahmetin yazıdıgı kitaları lıstele
		
		//Kitap sil metodu yazalım
		//Silmek istedigimiz kitabın ismini girin
		//girdiği kitap varsa silsin
		//yoksa girdiginiz kitap yoktur
		
		//Kontrol dıye bır metod yazarısz
		//Kitap var mı yok mu onu bulur
		//varsa o kştabı bize return eder
		//yoksa bilgilendirir
		
		
		//Kitabı guncelle methodu
		adminMenu();

	}
	
	public static void adminMenu() {
		boolean check=true;
		while(check) {
			System.out.println("1-Kitap ekle");
			System.out.println("2-Butun kitapları listele");
			System.out.println("3-Yazar ismine göre sorgula");
			System.out.println("4-KitapSil");
			System.out.println("5-İndirim Yap");
			System.out.println("6-Kitap ismini güncelle");
			System.out.println("7-İndirimdeki Kitaplari Goster");
			System.out.println("0-Çıkış yap");
			int secim=Util.intDegerAl("Seçiminiz?");
			switch (secim) {
			case 1:
				kutuphane.kitapEkle();
				break;
			case 2:
				kutuphane.kitaplariListele();
				break;
			case 3:
				kutuphane.yazarİsmineGoreSorgula();
				break;
			case 4:
				kutuphane.kitapSil();
				break;
			case 5:
				kutuphane.indirimYap();
				break;
			case 6:
				kutuphane.kitabiGuncelle();
				break;
			case 7:
				kutuphane.indirimdekiKitaplariGoster();
				break;
			case 0:
				System.out.println("Hoşçakalın");
				check=false;
				
				break;

			default:
				break;
			}
			
		}
	}

}
