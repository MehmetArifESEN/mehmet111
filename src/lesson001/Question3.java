package lesson001;

public class Question3 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar oldugunu bılıyoruz
		//Verilen ürünün ham fiyatı.
		
		float satisFiyati = 100f ;
		//int double float default değerleri 0 olarak kabul ediliyor.
		float hamFiyat;
		float kar = 0.15f;
		float kdv = 0.18f;
		hamFiyat = satisFiyati - (satisFiyati*kar) - (satisFiyati*kdv);
		
		System.out.println("ham Fiyatı--> " + hamFiyat);
		

	}

}
