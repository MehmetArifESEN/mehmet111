package lesson019.homework1;

import java.util.Scanner;

public class Main {
	static int sayac = 0;
	static boolean acikMi = false;
	static int ses = 0;
	static Kanal acikKanal = null;
	
	static Televizyon televizyon = new Televizyon();
	
	public static void tvKurveKanallariGoster() {
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Televizyon markasını giriniz");
		televizyon.setMarka(scanner2.nextLine());
		System.out.println("Televizyon boyutunu giriniz");
		televizyon.setBoyut(scanner2.nextLine());
	}

	public static void main(String[] args) {

		int secim;
		

		do {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Tv menüsü için 8 e basınız");
			secim = scanner.nextInt();

			switch (secim) {
			
			
			case 1:

				tvKur();

				break;
			case 2:
				
				tvAc();
				
				break;

			case 3:
				tvSesAc();

				break;

			case 4:
				
				tvSesAzalt();
				
				break;

			case 5:
				
				kanalDegistir();
				
				
				break;

			case 6:
				
				kanalBilgileriniGoster();
				

				break;
				
				
				case 7:
					
					
				tvKapat();

				break;
			case 8:
				menuyuGoster();

				break;

			default:
				break;
			}

		} while (secim != 0);

	}
	
	private static void menuyuGoster() {
		System.out.println("******MENU*******");
		System.out.println("0- Çıkış \\");
		System.out.println("1-- Televizyonu Kur");
		System.out.println("2-- Televizyonu Aç");
		System.out.println("3-- Sesini Artır");
		System.out.println("4-- Sesi Azalt");
		System.out.println("5-- Kanal Değiştir");
		System.out.println("6-- Kanal Bilgisi Goster");
		System.out.println("7-- Televizyonu Kapat");
		System.out.println("8-- Menüyü Goster\n");
		
	}

	public static void tvKur() {
		
		if (sayac == 0) {
			tvKurveKanallariGoster();
			sayac++;
		} else {
			System.out.println("Zaten bir tv kurulu");
		}
	}
	
	public static void tvAc() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == true) {
				System.out.println("Televizyonunuz zaten açık");

			} else if (acikMi == false) {
				System.out.println("Televizyon açılıyor....");
				acikMi = true;

			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}

	}
	public static void tvSesAc() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == true) {
				if (ses >= 0 && ses < 30) {
					ses++;
					System.out.println("Ses " + ses + " seviyesine yükseltildi.");
				}else if (ses==0) {
					System.out.println("Minimum ses seviyesine ulaşıldı");
				}else if (ses==30) {
					System.out.println("Maximum ses seviyesine ulaşıldı");
				}
			} else {
				System.out.println("Önce tv yi açınız");
			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}
	}
	
	public static void tvSesAzalt() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == true) {
				if (ses > 0 && ses <= 30) {
					ses--;
					System.out.println("Ses " + ses + " seviyesine düşürüldü.");
				}else if (ses==0) {
					System.out.println("Minimum ses seviyesine ulaşıldı");
				}else if (ses==30) {
					System.out.println("Maximum ses seviyesine ulaşıldı");
				}
			} else {
				System.out.println("Önce tv yi açınız");
			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}

			
	}
	public static void kanalDegistir() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Kanalı tuşlayın");
				int kanalTV = scanner.nextInt();
				for(int i=0; i<televizyon.getKanallar().size() ;  i++ ) {
					if (televizyon.getKanallar().get(i).getKanalNo() ==kanalTV) {
						acikKanal = televizyon.getKanallar().get(i);
						System.out.println(televizyon.getKanallar().get(i).getKanalNo() + ". kanal "+ televizyon.getKanallar().get(i).getKanalAdi() + " oynatılıuyor");
						break;
					}
				}
				

			} else {
				System.out.println("Önce tv yi açınız");
			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}

	}
	
	public static void kanalBilgileriniGoster() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == true) {
				if(acikKanal!=null) {
			System.out.println(acikKanal);
				}
				else {
					System.out.println("Menuden kanal tuşlayınız");
				}

			} else {
				System.out.println("Önce tv yi açınız");
			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}
	}
	
	public static void tvKapat() {
		if(televizyon.getMarka()!=null) {
			if (acikMi == false) {
				System.out.println("Televizyonunuz zaten kapalı");

			} else if (acikMi == true) {
				System.out.println("Televizyon kapanıyor....");
				acikMi = false;

			}
			}else {
				System.out.println("Önce TV yi kurunuz");
			}

	}

}
