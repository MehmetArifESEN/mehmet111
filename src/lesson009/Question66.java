package lesson009;

import java.util.Scanner;

public class Question66 {
	
	public static void toplama() {
		
		Scanner scanner = new Scanner(System.in);
		int toplam =0;
		int i=1;
		boolean check=true;
		while (check) {
			System.out.println(i++ + ". sayı");
			int sayi=scanner.nextInt();
			if(sayi!=0) {
				toplam+=sayi;
				
			}else if (sayi==0) {
				check=false;
				System.out.println(toplam);
				
			}
		}
		
	}
	
	public static void cikarma() {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		int result=0;
		System.out.println("kaç adey sayi gireceksiniz: ");
		int n= scanner.nextInt();
		while(i<=n) {
			int sayi=scanner.nextInt();
			if(i==1) {
				result+=sayi;
				i++;
				continue;
			}
			result-=sayi;
			i++;
		}
		System.out.println(result);
	}
	
	public static void bolme() {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		double result=0;
		System.out.println("kaç adey sayi gireceksiniz: ");
		int n= scanner.nextInt();
		while(i<=n) {
			double sayi=scanner.nextInt();
			if(i==1) {
				result+=sayi;
				i++;
			} else if(i!=1){
				result= result/sayi;
				i++;
			}
		}
		System.out.println(result);
	}
	
	public static void usAlma() {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		int carpim=1;
		System.out.println("lütfen taban sayıyı giriniz");
		int sayi=scanner.nextInt();
		System.out.println("lütfen taban sayıyının kuvvetını giriniz");
		int us=scanner.nextInt();
		while(i<=us) {
			carpim*=sayi;
			i++;
		}
		System.out.println(carpim);
	}
	public static void main(String[] args) {
		//kullanıcıdan 0 gırene kadar sayıları alıyoruz
		//0 gırınce sonucu gosterıp tekrar menuyu gossterıyoruz
		
		//Integer ile int in farkı?
		// integer primitive ine hızmet eden bır sınıf aslında
		// int --> null alamaz deafuly 0
		//public
		
		
		//cıkarma metodu 
		//kullanıcıdan ılk bastagırıfdıgı sayıyı dıgelrınden cıakrıcıaz
		//
		
		//bolme metodu
		//kullanıcıdan kac adey sayı gıırecegını alalım
		//son sayı 1 olunca dursun
		
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		while (kontrol) {
			System.out.println("***************************");
			System.out.println("*                         *");
			System.out.println("*  Geometrik Hesaplayıcı  *");
			System.out.println("***************************");
			System.out.println("1- Toplama");
			System.out.println("2- Çıkarma");
			System.out.println("3- Çarpma");
			System.out.println("4- Bölme"); 
			System.out.println("5- Kare Al");
			System.out.println("6- Fonksiyon");
			System.out.println("7- Çıkış");
			
		
		
		int secim=scanner.nextInt();
		scanner.nextLine();
		
		
		switch (secim) {
		case 1:
			
			toplama();
			
		
			break;
		case 2:
			cikarma();
			
			break;	
		case 3:
			
			
			break;	
		case 4:
			bolme();
			break;	
			
		case 5:
			usAlma();
			break;
		case 6:
			
			
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
