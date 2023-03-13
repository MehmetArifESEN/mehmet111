package maraton002.soru3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HayvanatBahcesi {

	Map<String, Hayvan> hayvanlar = new HashMap<>();
	Set<String> hayvanAdlari = new HashSet<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan memeliHayvan) {
		if (ayniİsimdeBaskaHayvanVarmi(memeliHayvan)) {
			System.out.println("Bu isimde bir hayvan zaten mevcut...");
		} else {
			hayvanlar.put(memeliHayvan.getAd(), memeliHayvan);
		}
	}

	public void bahceyeSurungenEkle(Surungen surungen) {
		if (ayniİsimdeBaskaHayvanVarmi(surungen)) {
			System.out.println("Bu isimde bir hayvan zaten mevcut...");
		} else {
			hayvanlar.put(surungen.getAd(), surungen);
		}
	}

	public boolean ayniİsimdeBaskaHayvanVarmi(Hayvan hayvan) {
		boolean ayniİsimdeHayvanVarMi = !hayvanAdlari.add(hayvan.getAd());
		return ayniİsimdeHayvanVarMi;
	}
	
	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
	}
	
	public void hayvaninCinsiniBul(String ad) {
		String metin = "";
		if (hayvanlar.get(ad) != null) {
			metin = hayvanlar.get(ad).getAd() + " bir " + hayvanlar.get(ad).getCinsi();
		} else
			metin = ad + " isimli hayvan Hayvanat Bahçesinde yok";
		System.out.println(metin);

	}
	
	public void hayvanBilgileriniYazdir(String hayvanAdi) {
		if (hayvanlar.get(hayvanAdi) != null)
			System.out.println(hayvanlar.get(hayvanAdi));
		else
			System.out.println(hayvanAdi + " isminde bir hayvan Hayvanat Bahçesinde yok");
	}
	
	public void hayvaniHareketEttir(String ad) {
		if (hayvanlar.get(ad).getSinifi().equalsIgnoreCase("aslan")) {
			Aslan hyvn = (Aslan) hayvanlar.get(ad);
			hyvn.yuru();
		} else if (hayvanlar.get(ad).getSinifi().equalsIgnoreCase("yilan")) {
			Yilan hyvn = (Yilan) hayvanlar.get(ad);
			hyvn.surun();
		} else if (hayvanlar.get(ad).getSinifi().equalsIgnoreCase("kertenkele")) {
			Kertenkele hyvn = (Kertenkele) hayvanlar.get(ad);
			hyvn.surun();
		} else if (hayvanlar.get(ad).getSinifi().equalsIgnoreCase("maymun")) {
			Maymun hyvn = (Maymun) hayvanlar.get(ad);
			hyvn.yuru();
		}

	}

}
