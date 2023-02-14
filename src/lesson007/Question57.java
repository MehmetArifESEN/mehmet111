package lesson007;

import java.util.Scanner;

public class Question57 {
	
	public static int toplamaIslemi(int sayi1, int sayi2) {
		int toplam = sayi1 +sayi2;
		return toplam;
	}

	public static void main(String[] args) {
		// topla methodu yazalım
		
		// toplam sonucunu kontrol edelim
		// sayının 10 dan büyük olup olmadıgını bulalım
		// metod boolean değer donsun
		// 18 den buyukse ve eşitse true
		// kçükse false
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen bir sayı daha giriniz");
		int sayi2 = scanner.nextInt();
		
		int toplamSonuc = toplamaIslemi(sayi1,sayi2);
		boolean kontrol = ondanBuyukKontrol(toplamSonuc);
		if(kontrol) {
			System.out.println("mekana girebilrisniz");
		} else {
			System.out.println("mekana giremezsiniz");
		}
		
		System.out.println(toplamSonuc);
		
		if(toplamSonuc>10) {
			System.out.println("10 dan büyük");
		}else {
			System.out.println("10 dam küçük veya eşit");
		}
		
		

	}
	private static boolean ondanBuyukKontrol(int sayi) {
		if (sayi<18) {
			return false;
		}
		return true;
	}

}
