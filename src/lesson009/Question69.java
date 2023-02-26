package lesson009;

public class Question69 {
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
		 "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			 "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			 "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			 "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {
		// Parametre olarak gırılen harfe gore ıkınıc harfı gırılen harf ıle uyuşan şehirlerin ilk uc harfını bastıran metod
		//"a"
		//Bayburt -->BAY
		//Karaman -->KAr
		harfBastır('e');
		bIleBaslayanlar(iller);
		String [] sesliHarfleriSilinmis = sesliHarfSil ();
		for (int i=0;i<sesliHarfleriSilinmis.length;i++) {
			System.out.println(sesliHarfleriSilinmis[i]);
		}
		plakaBul(iller,"Adana","Ankara" , "Bursa", "Eskişehir");

	}
	public static void harfBastır(char c) {
		for (int i=0;i<iller.length;i++) {
			if(iller[i].charAt(1)==c) {
				System.out.println(iller[i] + "--->" + iller[i].substring(0, 3).toUpperCase());
			}
		}
	}
	public static void bIleBaslayanlar(String[] array) {
		for(String kelime : array) {
			if(kelime.startsWith("B")) {
				System.out.println(kelime + "--->" +kelime.substring(0, 3).toUpperCase());
			}
			
		}
	}
	
	//Sesli harfleri silip silinmiş halini return eden bir method yazalım
	//metot String array döncek parametre almasın
	//return eden arrayi mainde yazdıralım.
	public static String [] sesliHarfSil () {
		String[] sesliSilDizi= new String[iller.length];
		for (int i=0;i<iller.length;i++) {
			iller[i]= iller[i].replace("a","").replace("e", "").replace("i", "").replace("ı","").replace("o","").replace("ö","").replace("u","").replace("ü","");
			sesliSilDizi[i]=iller[i];
		}
		
		return sesliSilDizi;
		
	}
	
	//plakaBul(iller,"Ankara","Karaman")
	// parametre olarak array ve sınırsız sayıda sstrıng olarak sehı alsın
	//girilen şehirlerin plakalarını yazdırsın
	
	public static void plakaBul(String[] array,String...il) {
		
		for(int i=0; i<array.length;i++) {
			for(int j=0;j<il.length;j++) {
				if (array[i].equals(il[j])) {
					if(i<9) 
						System.out.println("0" + (i+1) + "-" + array[i]);
					}else {
						System.out.println((i+1) + "-" + array[i]);
					}
					
					
				}
			}
		}
		
	
	
		
	

}
