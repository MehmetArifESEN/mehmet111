package lesson008;

import java.util.Scanner;

public class Question60 {
	
	public static int bilgileriYazdir(int sayi) {
		int yil=2023;
		int yuzyil =21;
		int yas=yil-sayi;
		System.out.println("Yaşınız: " + yas);
		if (yas>23) {
			yuzyil--;
			System.out.println(yuzyil + ". yüzyılda doğdunuz");
		}else {
			System.out.println(yuzyil + ". yüzyılda doğdunuz");
		}
		
		return yuzyil;
	}


	public static void main(String[] args) {
		// Doğum yılınızı girerek yasınızı ve hangi yüzyılda dogdugunu hesaplayan metodları yazalım
		

		//3 farklı metod yazıcaz
		//yas hesapla
		//yuzyul hesapla
		//bılgılerı yazdır
		System.out.println("Doğum yılınızı gırınız");
		Scanner scanner =new Scanner(System.in);
		int sayi =scanner.nextInt();
		bilgileriYazdir(sayi);
		
		
	
		

	}

}
