package lesson007;

import java.util.Scanner;

public class Question58 {
	
	public static int sayiBasamak(int x) {
		String sayi=String.valueOf(x);
		int basamak = sayi.length();
		return basamak ;
	}
	private static void bindenBuyukMu(int x) {
		if (x>=4) {
			System.out.println("sayi 1000 den buyuktur veya eşit");
		}else {
			System.out.println("sayi 1000 den kucuktur");
		}
	}

	public static void main(String[] args) {
		// parametre olarak in alan ve int döndüren
		//girilen sayının kaç basamaklı olduğunu bulan metodu yazalım
		//
		
		//daha sonra farklı bir method yazalım
		//sayının 100 den büyük olup olmadıgını kontrol edelim
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		int basamak = sayiBasamak(sayi);
		System.out.println(basamak);
		bindenBuyukMu(basamak);

	}

}
