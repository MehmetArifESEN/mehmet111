package maraton002.soru3;

public class Main {

	public static void main(String[] args) {
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		
		Aslan aslan = new Aslan("King" , 100,180) ;
		Yilan yilan = new Yilan("BlackMamba" , 20 , 200);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("White", 110,175 ));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Şebek" , 35 , 105));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Şebek" , 35 , 105));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Venom" , 30 , 260));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Dragon" , 25, 75));
		
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanBilgileriniYazdir("White");
		hayvanatBahcesi.hayvanBilgileriniYazdir("Dragon");
		hayvanatBahcesi.hayvaniHareketEttir("Venom");
		hayvanatBahcesi.hayvaniHareketEttir("Şebek");
		hayvanatBahcesi.hayvaniHareketEttir("King");
		
		hayvanatBahcesi.hayvaninCinsiniBul("Venom");
		hayvanatBahcesi.hayvaninCinsiniBul("King");
		hayvanatBahcesi.hayvaninCinsiniBul("Dragon");
		hayvanatBahcesi.hayvaninCinsiniBul("Şebek");
		

	}

}
