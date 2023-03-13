package lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek {

	public static void main(String[] args) {


		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);
		List<Integer> beseBolunen = sayilar.stream().filter(sayi -> sayi % 5==0 ).collect(Collectors.toList());
		
		System.out.println(beseBolunen);
		
		//Syaıları kendısı ıle carpıp yenıb ır lısteye ekleyelım
		List<Integer> carpimList = sayilar.stream().map(sayi-> sayi*sayi).collect(Collectors.toList());
		carpimList.stream().forEach(sayi -> System.out.println(sayi));
		
		//Kac tane 5 e bolunen sayı var onu bulalım
		long beseBolunenSaydir = sayilar.stream().filter(sayi -> sayi % 5==0 ).count();
		System.out.println("5 e bolunen sayı adedi: " + beseBolunenSaydir);

	}
	
	//5 ile bölünen sayıları bır lısteye atalım ve lısteye yazdıralım StreamApi kullanalım

}
