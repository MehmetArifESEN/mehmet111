package maraton002.soru2;

public class MainSoru2 {

	public static void main(String[] args) {
		
		
		CustomStringTR customStr = new CustomStringTR("Merhaba");
		System.out.println(customStr.buyukHarfYap());
		System.out.println(customStr.kucukHarfYap());
		System.out.println(customStr.uzunluk());
		System.out.println(customStr.ilkKarakteriGoster());
		System.out.println(customStr.metni3DefaYazdir());
		System.out.println(customStr.metniTrimle());
		System.out.println(customStr.ileMiBitiyor("aba"));
		System.out.println(customStr.ileMiBasliyor("ha"));
		System.out.println(customStr.ilkUcVeSonUcKarakteriYazdir());
		System.out.println(customStr.iceriyorMu("ha"));
		

	}

}
