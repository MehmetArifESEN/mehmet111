package lesson012;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Pizza sipariş uygulaması
		//
		//Pizza sınıfı oluşturacağız
		//attribute --> price ,vejeterryan mı , normla mı
		//Eğer vejeteryan pızza ıse fıyat 300 tl 
		//normal fıyat ısıe 200 TL
		
		//Mainde bir piiza oluşturalım
		Pizza pizza1= new Pizza(true);
		System.out.println(pizza1.isVegie());
		System.out.println(pizza1.getPrice());
		Pizza pizza2= new Pizza(false);
		System.out.println(pizza2.isVegie());
		System.out.println(pizza2.getPrice());
		
		pizza1.sosEkle();
		pizza1.sosEkle();
		pizza1.sosEkle();
		pizza1.sosEkle();
		System.out.println(pizza1.getPrice());
		pizza1.peynirEkle();
		pizza1.eveSiparisVer();
		pizza1.fisAl();
		//4 metod yazalım
		//sos ekle--->50 tl
		//peynir ekle---> 100 TL
		//Eve sipariş ver--> 20 TL kurye
		//fiş al--->bize pızazamınız total prıce ın versın
		 menu();
		

		
	}
	
	public static void menu() {
		Pizza pizza2 = null;
		System.out.println("Pizzanızı belırtın");
		Scanner scanner = new Scanner(System.in);
		boolean isVegi=true;
		boolean cikis=true;
		String pizzaTercihi= scanner.nextLine(); 
		if(pizzaTercihi.equals("vegi")) {
			pizza2 = new Pizza(isVegi);
		} else if(pizzaTercihi.equals("normal")){
			isVegi = false;
			pizza2=new Pizza (isVegi);
		}
		else {
			System.out.println("botl bır pızza bulunmamakta");
			cikis=false;
		}
		
		
		
		
	
		
		while(cikis) {
			System.out.println("Menu: ");
			System.out.println("1- Sos Ekle ");
			System.out.println("2- Peynir Ekle");
			System.out.println("3- Sos çıkar");
			System.out.println("4- Peynir çıkar");
			System.out.println("5- Görüntüle");
			System.out.println("Seçim yapınız ");
			int secim =  scanner.nextInt();
			
			
			switch (secim) {
			case 1:
				pizza2.sosEkle();
				break;
			case 2:
				pizza2.peynirEkle();
				break;
			case 3:
				pizza2.sosCikart();
				break;
			case 4:
				pizza2.peynirCikart();
				break;
			case 5:
				pizza2.fisAl();
				cikis=false;
	
				break;

			default:
				break;
			}
		}
	}

}
