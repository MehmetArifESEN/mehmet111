package maraton002.soru4;

public class MainSoru4 {

	public static void main(String[] args) {

		Yolcu yolcu = new BusinessYolcu(7755, "Mert", "Kaya", false);
		Yolcu yolcu2 = new EkonomiYolcu(889, "Ahmet", "Demir");
		Yolcu yolcu3 = new BusinessYolcu(555, "Aslı", "Bahar", true);
		
		System.out.println("*******Businesss VIP Yolcu*******");
		yolcu3.biletAl(EFirmalar.ADJ);
		yolcu3.biletAl(EFirmalar.PEGASUS);
		System.out.println("***************");
		
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		
		System.out.println("*******Ekonomi Yolcusu*********");
		
		yolcu2.biletAl(EFirmalar.ADJ);
		yolcu2.biletAl(EFirmalar.ADJ);
		yolcu2.biletAl(EFirmalar.PEGASUS);
		yolcu2.biletAl(EFirmalar.THY);
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();
		
		
		System.out.println("*******Business Yolcu**********");
		
		yolcu.biletAl(EFirmalar.ADJ);
		yolcu.biletAl(EFirmalar.PEGASUS);
		yolcu.biletAl(EFirmalar.PEGASUS);
		yolcu.biletAl(EFirmalar.THY);
		yolcu.ucagaBin();
		yolcu.ucagaBin();
		yolcu.checkInYap();
		yolcu.checkInYap();
		yolcu.ucagaBin();
		yolcu.yolcuBilgileriniGetir();

	}

}
