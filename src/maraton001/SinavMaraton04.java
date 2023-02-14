package maraton001;

import java.util.Scanner;

public class SinavMaraton04 {
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("***************************");
			System.out.println("*                         *");
			System.out.println("*  Geometrik Hesaplayıcı  *");
			System.out.println("***************************");
			System.out.println("1- Kare Alan hesaplama");
			System.out.println("2- Kare Çevre hesaplama");
			System.out.println("3- Dikdörtgen Alan hesaplama");
			System.out.println("4- Dikdörtgen Çevre hesaplama"); 
			System.out.println("5- Daire Alan hesaplama");
			System.out.println("6- Daire Çevre hesaplama");
			System.out.println("7- Çıkış");
			
		
		
		int secim=scanner.nextInt();
		
		
		switch (secim) {
		case 1:
			
			System.out.println("Lütfen karenin uzunluğunu giriniz");
			int kenar1 = scanner.nextInt();
			int kareAlan= kenar1*kenar1;
			System.out.println("Karenin Alanı: " + kareAlan);
			
		
			break;
		case 2:
			System.out.println("Lütfen karenin uzunluğunu giriniz");
			int kenar2 = scanner.nextInt();
			int kareCevre = 4*kenar2;
			System.out.println("Karenin Cevresi: " + kareCevre);
			
			break;	
		case 3:
			System.out.println("Lütfen Dikdörtgenin uzun kenarını giriniz");
			int uzunKenar1 = scanner.nextInt();
			System.out.println("Lütfen Dikdörtgenin kısa kenarını giriniz");
			int kisaKenar1 = scanner.nextInt();
			int dikdortgenAlan= uzunKenar1*kisaKenar1;
			System.out.println("Dikdörtgenin Alanı: " + dikdortgenAlan);
			
			break;	
		case 4:
			System.out.println("Lütfen Dikdörtgenin uzun kenarını giriniz");
			int uzunKenar2 = scanner.nextInt();
			System.out.println("Lütfen Dikdörtgenin kısa kenarını giriniz");
			int kisaKenar2 = scanner.nextInt();
			int dikdortgenCevre= (uzunKenar2+kisaKenar2)*2;
			System.out.println("Dikdörtgenin Çevresi: " + dikdortgenCevre);
			break;	
			
		case 5:
			System.out.println("Lütfen Dairenin yarıçapını giriniz");
			double yaricap1 = scanner.nextDouble();
			double daireAlan = PI*(yaricap1*yaricap1);
			System.out.println("Dairenin Alanı: " + daireAlan);
			break;	
		case 6:
			System.out.println("Lütfen Dairenin yarıçapını giriniz");
			double yaricap2 = scanner.nextDouble();
			double daireCevre = PI*(2*yaricap2);
			System.out.println("Dairenin Çevresi: " + daireCevre);
			break;	
			
			
		case 7:
			System.out.println("Hoşçakalın");
			kontrol = false;
			
			
			break;
			
		default:
			System.out.println("Lütfen ilgili menü üzerinden seçim yapınız");
			break;
		}
		}
	}


	

}
