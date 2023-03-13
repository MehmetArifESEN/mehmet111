package lesson022.StreamUygulama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Market {
	
	EUrun [] product= EUrun.values();
	List<Urun> urunler = new ArrayList<>();
	Map<String,Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();
	
	public Market() {
		urunOlustur();
		urunFiyatMapOlustur();
	}
	
	public void urunOlustur() {
		//productu lısteye sonra da streama cevırıcez
		//Sonra içinde işlem yapabılecek duruma gelıcez
		//Urun nesnesı olustururken degelerı EURUN ıcınden alcaz
		
		urunler = Arrays.asList(product).stream().map(urun-> new Urun(urun.name(),urun.fiyat)).collect(Collectors.toList());
		
	}
	
	public void urunleriListele() {
		//urunler.forEach(Urun::bilgileriGoster());
		urunler.forEach(System.out::println);
		//urunler.forEach(urun->System.out.println(urun.getName()));
		
	}
	
	//Urun fiyat listesi olustur
	
	public void urunFiyatMapOlustur() {
		urunMap = urunler.stream().collect(Collectors.toMap(urun -> urun.getName(), urun-> urun.getPrice() ));
	}
	
	public void fiyatListesi() {
		urunMap.forEach((key,value) -> System.out.println( key + "--> " + value) );
	}
	
	public void fiyati50denBuyukOlanlar() {
//		List<Entry<String,Double>> ellidenBuyukler= urunMap.entrySet().stream().filter(x -> x.getValue()>50).collect(Collectors.toList());
//		System.out.println("elliden buyuk olanlar: " + ellidenBuyukler);
		
		List<String> urunler = urunMap.entrySet().stream().filter(entry->entry.getValue() > 50).map(Entry::getKey).collect(Collectors.toList());
		System.out.println("ellıden buyuk olanlar: " + urunler);
	}
	
	
	
	// fiyatı 50 den buyuk olan urunlerın fıyatlarının ortalamasını bulalım
	public void ortalama() {
		//liste içinde ki sayıların ortalamasını nasıl bulurum stream api ile
		List<Urun> ellidenBuyukler = urunler.stream().filter(x-> x.getPrice()>50).collect(Collectors.toList());
		
		ellidenBuyukler.stream().mapToDouble(i-> i.getPrice()).average().ifPresent(avg-> System.out.println("50 den buyuklerın ortalaması: " + avg));
		
		
	}
	
	public void SepeteUrunEkle() {
		
		//markette var mı yok mu
		//yoksa ürün yok
		//varsa sepete eklicez
		//ilk defa eklediysek +1
		//ikinci eklediğimde 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklemek istediğiniz ürün ");
		String urun = scanner.nextLine();
		if(urunMap.containsKey(urun)) {
		if(sepetMap.containsKey(urun)) {
			sepetMap.put(urun, sepetMap.get(urun)+1);
		}else {
			sepetMap.put(urun, 1);
			System.out.println(urun + " urun sepete eklendi...");
		}
		}else {
			System.out.println("Boyle bır urun yok");
		}
		
	}
	
	public void sepetiGoster() {
		sepetMap.forEach((key,value) ->System.out.println(key + "  " + value));
	}
	
	
	

}

//Sepet diye bir class olyusturalım
//product, arrayde tutalım enum arrayi olacak, değerleri EUrun sınıfından alıcak (Product)
//yine aynı şekilde urunler dıye bır lıstemız olsun enum arrayınden buraya urunlerı tasıcaz(urunler)
//map olarak sepetı tutcaz burda urun ısmı ve adet alacak sekılde .(sepetMap)
//Yine utunlerı hem ısmını hem de fıatlarını tutmak ıcın bır map daha olusturalım.(urunmap)
