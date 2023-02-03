package lesson4;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// //         Menu 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o 
		//        harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
		//        eğer harfi içermiyorsa bir çıktı aradağınız harf yok gibi
		//        2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		//          giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		//          içerisinde o harf varsa değiştirsin.
		//        3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		//         * olmadığını bulunuz(kek,iki,kabak,kayak)
		//		4 Sistemden çıksın
		
		
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("1- Girilen harften kaç adet var");
			System.out.println("2- Harf değiştirme");
			System.out.println("3- Polindrom Sorgulama");
			System.out.println("4- kelimenin harflerinin arasına ? koy"); //en sona koyamayacagız
			System.out.println("5- Kelimenin ilk 3 indeksini alıp sonuna... koyun");
			System.out.println("0- Çıkış");
			System.out.println("0- Çıkış");
			
		
		
		int secim=scanner.nextInt();
		scanner.nextLine();
		
		switch (secim) {
		case 1:
			int sayac=0;
			String indexler= "";
			System.out.println("Lütfen bir metin giriniz");
			String kelime = scanner.nextLine();
			System.out.println("Lütfen bir karakter giriniz");
			String harf = scanner.nextLine();
			
			if(!kelime.contains(harf)) {
				System.out.println("Aradığınız harf kelimenin içerisinde yoktur.");
			} else {
				for(int i=0;i<kelime.length(); i++) {
					if(kelime.charAt(i)== harf.charAt(0)) {
						sayac++;
						indexler+=1 + ",";
						
					}
				}
				System.out.println(sayac);
				System.out.println(harf + "değerinin indexleri===> " + indexler.substring(0,indexler.length()-1));
				//system.out.println()
				//1,2,5,7
			}
		
		
			
			break;
		case 2:
			//kelime
			//harf
			//kontrol edicez harf kelimenin içinde var mı
			//yeni Harf
			//var sa replace
			System.out.println("Lütfen bir metin giriniz");
			String kelime2 = scanner.nextLine();
			System.out.println("Lütfen değiştirmek istediğiniz karakteri giriniz");
			String harf2 = scanner.nextLine();
			System.out.println("Lütfen yeni karakteri giriniz.");
			String harfr = scanner.nextLine();
			if(!kelime2.contains(harf2)) {
				System.out.println("Aradığınız harf kelimenin içerisinde yoktur.");
			} else {
				kelime2=kelime2.replace(harf2, harfr);
			}
			System.out.println(kelime2);
			
			
			break;	
		case 3:
			System.out.println("Lütfen bir metin giriniz");
			String kelime3 = scanner.nextLine();
			for (int i=0 ;i<kelime3.length();i++) {
				if (i >= kelime3.length()/2) {
					System.out.println("Girilen metin polindromdur!");
					break ;
				}
				if (kelime3.charAt(i)== kelime3.charAt(kelime3.length()-1 -i)) {
					continue;
				}else {
					System.out.println("Girilen metin polindrom değildir.");
					break;
				}
				
		
					
			}
			
			break;	
		case 4:
			StringBuilder stringBuilder = new StringBuilder();
			System.out.println("Lütfen bir metin giriniz");
			String kelime4 = scanner.nextLine();
			for(int i=0; i<kelime4.length(); i++) {
				stringBuilder.append(kelime4.charAt(i)+ "?");
				
			}
			System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
			
			
			
			break;	
			
		case 5:
			System.out.println("Kelime giriniz.");
			String kelime5 = scanner.nextLine();
			String kelime6 = kelime5.substring(0,3);
			String eklencekSekil = "...";
			System.out.println(kelime6 + eklencekSekil);
			
			
			
			
			break;	
		case 6:
			System.out.println("Kelime giriniz.");
			String kelime7 = scanner.nextLine();
			String kelime8 = "";
			for(int i =0;i< kelime7.length();i++)  {
				if(i<3) {
					kelime8 +=kelime7.charAt(i);
					System.out.println("hatalı değer");
				}else {
					kelime8+= ".";
				}
			}
			
			System.out.println(kelime8);
			
			break;
			
		case 0:
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
